package com.example.chat;

import java.util.Date;

public class ChatMessage {
    //muutujad
    private String messageText;
    private String messageUser;
    private long messageTime;

    //konstruktor
    public ChatMessage(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        messageTime = new Date().getTime();
    }
    //Tühi konstruktor
    public ChatMessage(){}
    //getterid
    public String getMessageText() {return messageText;}
    public String getMessageUser() {return messageUser;}
    public long getMessageTime() {return messageTime;}
    //setterid
    public void setMessageText(String messageText) {this.messageText = messageText;}
    public void setMessageUser(String messageUser) {this.messageUser = messageUser;}
    public void setMessageTime(long messageTime) {this.messageTime = messageTime;}
}
