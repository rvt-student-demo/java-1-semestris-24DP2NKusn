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
}
