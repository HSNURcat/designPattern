package com.edu.design.singleton;

public class SocketClient {
    private static SocketClient socketClient = null; //싱글톤은 자기 자신을 객체로 갖고 있어야 한다.

    private SocketClient() { //또한 싱글톤은 기본생성자를 private로 막아놔야 한다.

    }

    public static SocketClient getInstance() { //싱글톤은 getInstance라는 메소드를 static메소드 형태로 제공해야 한다.

        if(socketClient == null) { //socketClient가 null이면 socketClient생성
            socketClient = new SocketClient();
        }
        return socketClient; //socketClient가 존재하면, 리턴

    }

    public void connect() {
        System.out.println("connent");
    }
}
