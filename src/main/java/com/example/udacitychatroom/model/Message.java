package com.example.udacitychatroom.model;

import com.alibaba.fastjson.JSON;

public class Message {
    private String username;
    private String msg;
    private int onlineCount;

    //    Test for message type
    private String type;
//    Test End here

//    private MessageType type;
//
//    public enum MessageType {
//        CHAT,
//        JOIN,
//        LEAVE
//    }

    public Message(String msg, String username, int onlineCount, String type) {
        this.msg = msg;
        this.username = username;
        this.onlineCount = onlineCount;

        this.type = type;
    }

    public static String strToJson(String msg, String username, int onlineCount, String type) {
        return JSON.toJSONString(new Message(msg, username, onlineCount, type));
    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getOnlineCount() {

        return this.onlineCount;
    }

    public void setOnlineCount(int onlineCount) {

        this.onlineCount = onlineCount;
    }
}
