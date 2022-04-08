package com.edu.design.singleton;

public class BClazz {

    private  SocketClient socketClient;

    public BClazz() {//SocketClient클래스의 getInstance메소드를 통해 socketClient받아옴
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
