package com.company;

public class Deskphone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Powering On!");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now calling the phone number " + phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Hello...");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring...");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
