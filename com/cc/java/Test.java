package com.cc.java;

public class Test {

    // Aufagbe 8
    private boolean appStatus;
    public String inputField1;
    public String inputField2;
    protected int itemCount1;
    protected int itemCount2;
    private String item;

    

    

    public Test(boolean appStatus, String inputField1, String inputField2, int itemCount1, int itemCount2,
            String item) {
        this.appStatus = appStatus;
        this.inputField1 = inputField1;
        this.inputField2 = inputField2;
        this.itemCount1 = itemCount1;
        this.itemCount2 = itemCount2;
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    
}
