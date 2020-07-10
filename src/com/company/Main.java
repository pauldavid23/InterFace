package com.company;

public class Main {

    public static void main(String[] args) {
            ITelephone theSmartpone;
            theSmartpone = new Deskphone(87000);
            theSmartpone.powerOn();
            theSmartpone.dial(87000);
            theSmartpone.callPhone(87000);
            theSmartpone.answer();

            mobilePhone Samsung = new mobilePhone(911111);
            Samsung.powerOn();
            Samsung.dial(911111);
            Samsung.callPhone(911111);
            Samsung.answer();
    }
}
