//creates a class that makes a sphere from Shape
public class Sphere implements Shape {

  private double radius;

  //constructs new sphere with given radius
  public Sphere(double radius) {
    this.radius = radius;
  }

  //returns SA of sphere
  public double getSurfaceArea() {
    return 4 * Math.PI * radius * radius;
  }

  //returns volume of sphere
  public double getVolume() {
    return (4 / 3) * Math.PI * radius * radius * radius;
  }

}
