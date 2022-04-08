package com.edu.design.singleton;

public class AClazz {//Class는 "예약어"이기 때문에 "클래스"라는 이름을 표기하고 싶을때, Clazz로 표기하기도 한다.

    private  SocketClient socketClient;

    public AClazz() {//SocketClient클래스의 getInstance메소드를 통해 socketClient받아옴
        this.socketClient = SocketClient.getInstance();
    }
    
    public SocketClient getSocketClient() {
        return socketClient;
    }
}
