package com.company;

public class mobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public mobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Smartphone powering on!");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now calling the phone number " + phoneNumber);
        } else {
            System.out.println("smartphone is switched off!");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Smartphone: Hello!");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring...");
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
