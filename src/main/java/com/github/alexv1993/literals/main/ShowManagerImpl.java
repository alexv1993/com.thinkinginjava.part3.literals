package com.github.alexv1993.literals.main;

/**
 * Created by vendin on 11.10.2017.
 */
public class ShowManagerImpl implements ShowManager {
    @Override
    public void show(int i) {
        System.out.println("i " + Long.toBinaryString(i));
    }

    @Override
    public void show(char i) {
        System.out.println("i " + Long.toBinaryString(i));
    }

    @Override
    public void show(byte i) {
        System.out.println("i " + Long.toBinaryString(i));
    }

    @Override
    public void show(short i) {
        System.out.println("i " + Long.toBinaryString(i));
    }

    @Override
    public void show(long i) {
        System.out.println("i " + i);
    }

    @Override
    public void show(float i) {
        System.out.println("i " + i);
    }

    @Override
    public void show(double i) {
        System.out.println("i " + i);
    }

}
