package com.epam.learn.entity;

public class Bus {
    final static int COUNTER;

    static {
        System.out.println("Bus static block");
        COUNTER = Integer.parseInt("177");
        System.out.println("counter = " + COUNTER);
    }

    private int id = 1;

    {
        System.out.println("Bus constructor");
        ++id;
        System.out.println("id = " + id);
    }

    public Bus(int id) {
        this.id = id;
    }

    public Bus() {
    }

    @Override
    public String toString() {
        String sb = "Bus{" + "id=" + id +
                '}';
        return sb;
    }
}