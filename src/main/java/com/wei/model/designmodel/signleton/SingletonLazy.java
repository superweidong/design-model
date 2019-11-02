package com.wei.model.designmodel.signleton;

import java.util.Objects;

public class SingletonLazy {

    private static volatile SingletonLazy singletonLazy;

    private SingletonLazy() {
    }

    public synchronized static SingletonLazy getInstance(){
        if (Objects.isNull(singletonLazy)){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

}
