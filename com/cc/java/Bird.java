package com.cc.java;

public class Bird implements Flyable, IFeathers{

    @Override
    public String fly() {
        return "Birds fly" +","+ 
        "in every direction";
    }

    @Override
    public String hasfeathers() {
        return "I've a lot of feathers";
    }

    // @Override
    // public String fly() {
    //     return "I'm a bird, I can fly";
    // }
    
}
