package com.codigofacilito.clase03;

public class ChatNotAnswerException extends Exception {
    private String user;

    public ChatNotAnswerException(String user){
        this.user = user;
    }

    public String getUser(){
        return user;
    }
}
