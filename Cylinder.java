//creates a cylinder from shape interface
public class Cylinder implements Shape {

  private double radius;
  private double height;

  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  public double getSurfaceArea() {
    return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
  }

  public double getVolume() {
    return Math.PI * radius * radius * height;
  }

}
