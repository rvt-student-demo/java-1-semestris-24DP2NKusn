package rvt;

public class Chapter50 {
    
}


class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this(side, side, side);
    }

    public double volume() {
        return this.width * this.height * this.length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    private double faceArea() { return this.width * this.height; }
    private double topArea() { return this.width * this.length; }
    private double sideArea() { return this.height * this.length; }



}
