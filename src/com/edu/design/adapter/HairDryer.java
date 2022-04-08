package com.edu.design.adapter;

public class HairDryer implements Electronic110V{ //110V드라이기

    @Override
    public void powerOn() {
        System.out.println("헤어드라이기 110V on");
    }

}
