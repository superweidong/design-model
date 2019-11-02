package com.wei.model.designmodel.signleton;

public class SingletonEarly {

    private static final SingletonEarly singleton = new SingletonEarly();

    private SingletonEarly() {
    }

    public static SingletonEarly getInstance(){
        return singleton;
    }


}
