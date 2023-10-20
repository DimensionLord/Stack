package ru.devray.day6;

public class AccessDemo {
    //private public <default> protected

    private int i1 = 0; //r   w
    private int i2 = 0;

    //getter setter

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public int getI2() {
        return i2;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }


//    //r
//    protected int getI1() {
//        return i1;
//    }
//
//    //w
//    private void setI1(int newValue) {
//        i1 = newValue;
//    }

}
