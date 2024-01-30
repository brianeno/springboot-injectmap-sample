package com.brianeno.injectmap.service;

public abstract class BaseService {

    public abstract String printAndGetGreeting(String value);

    protected void print(final String message) {
        System.out.println(message);
    }
}
