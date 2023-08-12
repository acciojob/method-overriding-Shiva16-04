package com.driver;

public class B extends A{
    public String meth(){
        System.out.println(super.meth());
        return "Method is overridden in Extendend class B";
    }
}
