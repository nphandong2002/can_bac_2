package com.example.can_bac_2;

public class DataResponde {
    private String msg;
    private float x1;
    private float x2;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }
    public DataResponde(){

    }
    public DataResponde(String msg, float x1 , float x2){
        this.msg = msg;
        this.x1 = x1;
        this.x2 = x2;
    }

}
