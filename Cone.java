//creates a Cone from shape interface
public class Cone implements Shape {

  private double baseRadius;
  private double height;

  public Cone(double baseRadius, double height) {
    this.baseRadius = baseRadius;
    this.height = height;
  }

  public double getSurfaceArea() {
    return Math.PI * baseRadius * (baseRadius + Math.sqrt(baseRadius * baseRadius + height * height));
  }

  public double getVolume() {
    return Math.PI * baseRadius * baseRadius * height / 3;
  }

}
