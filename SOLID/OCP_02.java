package SOLID;

/**
 * 👇 Originally, Shape was just a marker (empty) and logic used instanceof.
 * We refactor it to have an abstract method for area computation.
 */
abstract class DrawingShape {
    public abstract double computeArea();
}

/**
 * 👇 Each shape provides its own implementation.
 * Now we can add new shapes (e.g., Triangle) without touching Area logic.
 */
class Rectangle extends DrawingShape {
    double width, height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    public double computeArea() {
        return width * height;
    }
}

class Circle extends DrawingShape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

/**
 * 👇 Now open for extension via new shapes, closed for modification!
 */
class DrawingArea {
    public double measure(DrawingShape s) {
        return s.computeArea();
    }
}
