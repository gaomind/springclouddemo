package com.ptteng;

import com.sun.org.apache.xml.internal.serializer.SerializerTrace;

import java.io.Serializable;

/**
 * Created by ${MIND-ZR} on 2018/1/6.
 */

public class Car implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id ;
    private String color;
    private String size;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
