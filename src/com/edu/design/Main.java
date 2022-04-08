package com.edu.design;

import com.edu.design.adapter.*;
import com.edu.design.singleton.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        AClazz aClazz = new AClazz();
//        BClazz bClazz = new BClazz();
//
//        CClazz cClazz = new CClazz();
//        DClazz dClazz = new DClazz();
//
//        //싱클턴 패턴을 사용했을 때 AClazz에 들어있는 socketClient랑 BClazz에 들어있는 socketClient가 같은지 시험
//        SocketClient aClient = aClazz.getSocketClient();
//        SocketClient bClient = bClazz.getSocketClient();
//
//        System.out.println("두개의 객체가 동일한가?");
//        System.out.println(aClient.equals(bClient));
//
//        //싱클턴 패턴을 사용했을 때 AClazz에 들어있는 socketClient랑 BClazz에 들어있는 socketClient가 같은지 시험
//        SocketClient cClient = cClazz.getSocketClient();
//        SocketClient dClient = dClazz.getSocketClient();
//
//        System.out.println("두개의 객체가 동일한가?");
//        System.out.println(cClient.equals(dClient));

        HairDryer hairDryer = new HairDryer();//드라이기 생성
        connect(hairDryer);//connect메소드에(110V 콘센트에) 드라이기 넣음

        VacumCleaner vacumCleaner = new VacumCleaner();//220V 진공청소기 생성
        Electronic110V adapter = new SocketAdapter(vacumCleaner); //진공청소기 플러그에 <220V to 110V어댑터>를 꽂아서 110V플러그를 만듦
        connect(adapter);//110V어댑터가 꽂힌 플러그를 110V 콘센트에 넣음

        AirConditioner airConditioner = new AirConditioner();
        adapter = new SocketAdapter(airConditioner);
        connect(adapter);

    }

    //110V 콘센트
    public static void connect(Electronic110V electronic110V) {//110V 가전제품 연결하면
        electronic110V.powerOn();//110V 가전제품 powerOn
    }






}
