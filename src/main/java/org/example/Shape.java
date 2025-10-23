package org.example;

abstract class Shape {

    public String color;

    public Shape(String color){
        this.color = color;

    }


    public String getColor() {
        return color;
    }

    public abstract void draw();



}
