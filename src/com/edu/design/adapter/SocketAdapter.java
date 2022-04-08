package com.edu.design.adapter;

public class SocketAdapter implements Electronic110V{//자기 자신의 모습이 110V여야 110V콘센트에 들어갈 수 있음

    private Electronic220V electronic220V;//자기 자신이 연결시켜줘야 할 220V 플러그 홈 모양을 갖고 있어야 함

    public SocketAdapter(Electronic220V electronic220V) { //220V가전제품 플러그가 들어왔을때
        this.electronic220V = electronic220V; //어댑터의 220V플러그 홈과 가전제품의 220V플러그가 결합
    }

    @Override
    public void powerOn() {
        electronic220V.connect();//전원 연결됨
    }
}
