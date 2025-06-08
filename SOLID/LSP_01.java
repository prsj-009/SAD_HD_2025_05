package SOLID;

/**
 * 👇 Rectangle class that works with width and height.
 * Originally, Square extended Rectangle and broke behavior when overriding methods.
 */
class Shape2D {
    protected int w, h;

    Shape2D(int w, int h) {
        this.w = w;
        this.h = h;
    }

    int area() {
        return w * h;
    }
}

/**
 * 👇 Instead of subclassing, Square now has its own structure.
 * This prevents accidental misuse of setters.
 */
class Box {
    private int side;

    Box(int s) {
        side = s;
    }

    int area() {
        return side * side;
    }
}

public class LSP_01 {
    public static void main(String[] args) {
        Shape2D r = new Shape2D(4, 5);
        Box sq = new Box(4);

        System.out.println("Rectangle: " + r.area());
        System.out.println("Square: " + sq.area());
    }
}
