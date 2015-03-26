package com.xiaohao.mobile.push;

import cn.jpush.api.JPushClient;
import cn.jpush.api.examples.PushExample;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;

import java.util.ResourceBundle;

/**
 * Created by xiaohao on 2015/3/26.
 */
public class Startor {

    public static ResourceBundle kvproperty;

    static {
        kvproperty =ResourceBundle.getBundle("jpush");
    }

    public static void main(String[] args){


        JPushClient jc = new JPushClient(getAppSecret(),getAppKey());
        int i=0;
        while(true){
            i++;
            try{

                jc.sendMessageAll(i+"");
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    public static String getAppKey(){
        return kvproperty.getString("appKey");
    }

    public static String getAppSecret(){
        return kvproperty.getString("appSecret");
    }

}
