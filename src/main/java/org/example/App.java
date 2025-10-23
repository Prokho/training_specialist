package org.example;

public class App {
    public static void main(String[] args) {

        System.out.println("=== ПРОГРАММА ДЛЯ РИСОВАНИЯ ФИГУР ===\n");

        // Создаем сцену
        Scene scene = new Scene();

        // Создаем различные фигуры
        System.out.println("Создаем фигуры...");

        // Точки
        Point point1 = new Point(10, 20, "красный");


        // Окружности
        Circle circle1 = new Circle(100, 100, 25, "желтый");


        // Добавляем фигуры на сцену
        System.out.println("\nДобавляем фигуры на сцену...");
        scene.add(point1);
        scene.add(circle1);

    }
}