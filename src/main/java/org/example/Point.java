package org.example;

class Point extends Shape {


    private int x;
    private int y;

    public Point(int x, int y, String color) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void draw() {
        System.out.println("Рисую точку: цвет=" + color + ", координаты=(" + x + "," + y + ")");
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + ", color='" + color + "'}";
    }


}
