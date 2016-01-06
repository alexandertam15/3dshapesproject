//creates a rectangular prism from shape interface
public class RectangularPrism implements Shape {

  private double length;
  private double width;
  private double height;

  public RectangularPrism(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public double getSurfaceArea() {
    return 2 * (length * width + width * height + height * length);
  }

  public double getVolume() {
    return length * width * height;
  }

}
