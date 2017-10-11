package com.github.alexv1993.literals.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by vendin on 11.10.2017.
 */


public class Literals {
    private int ID;

    private int i1 = 0x2f;
    private int i2 = 0X2F;
    private int i3 = 0177;
    private char c = 0xffff;
    byte b = 0x7f;
    short s = 0x7fff;
    long n1 = 200L;
    long n2 = 200l;
    long n3 = 200;

    float f1 = 1;
    float f2 = 1F;
    float f3 = 1f;

    double d1 = 1d;
    double d2 = 1D;

    public int getID() {
        return ID;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public void setI2(int i2) {
        this.i2 = i2;
    }

    public void setI3(int i3) {
        this.i3 = i3;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public void setS(short s) {
        this.s = s;
    }

    public void setN1(long n1) {
        this.n1 = n1;
    }

    public void setN2(long n2) {
        this.n2 = n2;
    }

    public void setN3(long n3) {
        this.n3 = n3;
    }

    public void setF1(float f1) {
        this.f1 = f1;
    }

    public void setF2(float f2) {
        this.f2 = f2;
    }

    public void setF3(float f3) {
        this.f3 = f3;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public int getI1() {
        return i1;
    }

    public int getI2() {
        return i2;
    }

    public int getI3() {
        return i3;
    }

    public char getC() {
        return c;
    }

    public byte getB() {
        return b;
    }

    public short getS() {
        return s;
    }

    public long getN1() {
        return n1;
    }

    public long getN2() {
        return n2;
    }

    public long getN3() {
        return n3;
    }

    public float getF1() {
        return f1;
    }

    public float getF2() {
        return f2;
    }

    public float getF3() {
        return f3;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }


}
