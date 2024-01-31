package Project1;
import java.lang.Math;
public class Point {
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Standard setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Standard getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Set the coordinates of the point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift a point by a given amount along the x-axis
    public void shiftX(double n) {
        this.x += n;
    }

    // Shift a point by a given amount along the y-axis
    public void shiftY(double n) {
        this.y += n;
    }

    // Find the distance to point p2
    public double distance(Point p2) {
        double dx = this.x - p2.getX();
        double dy = this.y - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Rotate the point by a specified (radian) angle around the origin
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }


    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void printCoordinates() {
        System.out.println("Coordinates: (" + this.x + ", " + this.y + ")");
    }

    public static void main(String[] args) {
        Point point = new Point(3.0, 4.0);
        point.printCoordinates();

        point.shiftX(2.0);
        point.shiftY(-1.0);
        point.printCoordinates();

        Point anotherPoint = new Point(1.0, 1.0);
        System.out.println("Distance between points: " + point.distance(anotherPoint));

        point.rotate(Math.PI / 2);
        point.printCoordinates();
    }
}

