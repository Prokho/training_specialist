package org.example;

public class Scene {


    private Shape[] shapes;
    private int shapeCounter;

    public Scene() {
        shapes = new Shape[100];
        shapeCounter = 0;
    }


    public void draw(){
        for(Shape element: shapes){
            System.out.println("Элемент: " + element);
        }
    }

    public void add(Shape s){

        if(shapeCounter >= shapes.length){
            Shape[] newShapes = new Shape[shapes.length*2];
            System.arraycopy(shapes, 0, newShapes, 0, shapes.length);
            shapes = newShapes;
        }

        shapes[shapeCounter] = s;
        shapeCounter++;
        System.out.println("Добавлена фигура: " + s.getClass().getSimpleName());
    }


}
