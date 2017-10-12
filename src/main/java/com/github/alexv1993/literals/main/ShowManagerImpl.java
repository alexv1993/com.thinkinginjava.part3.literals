package com.github.alexv1993.literals.main;


/**
 * Created by vendin on 11.10.2017.
 */
public class ShowManagerImpl<T> implements ShowManager<T> {
    @Override
    public void show(T i) {
        System.out.println("i " + i);
    }
}
