package com.edu.design.singleton;

public class CClazz {
    private  SocketClient socketClient;

    public CClazz() {//default생성자로 객체를 새로 생성
        this.socketClient = SocketClient.getInstance();
        //this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
