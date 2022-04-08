package com.edu.design.adapter;

public class VacumCleaner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("청소기 220V on");
    }
}
