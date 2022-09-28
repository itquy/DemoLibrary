package com.thanhquy.plustwonumber;

public class PlusNumber implements IPlusNumber{
    private int n1, n2;

    @Override
    public void setNumber(int num1, int num2) {
        n1 = num1;
        n2 = num2;
    }

    @Override
    public int getResult() {
        return n1 + n2;
    }

//    @Override
//    public void setNumber(int num1, int num2) {
//        this.n1 = num1;
//        this.n2 = num2;
//    }
//
//    @Override
//    public int getResult() {
//        return this.n1 + this.n2;
//    }
}
