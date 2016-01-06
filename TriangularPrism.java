//creates a triangular prism from shape interface
public class TriangularPrism implements Shape {

  private double a;
  private double b;
  private double c;
  private double height;
  private double semiperimeter = (a + b + c) / 2;

  public TriangularPrism(double a, double b, double c, double height, double semiperimeter) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.height = height;
    this.semiperimeter = semiperimeter;
  }

  public double getSurfaceArea() {
    return a * height + b * height + c * height + 2 * Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
  }

  public double getVolume() {
    return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c)) * height;
  }

}
