//creates a Cube from the shape interface
public class Cube implements Shape {

  private double sideLength;

  //constructs new Cube with given dimensions
  public Cube(double sideLength) {
    this.sideLength = sideLength;
  }

  //returns surface area of cube
  public double getSurfaceArea() {
    return sideLength * sideLength * 6;
  }

  //returns volume of cube
  public double getVolume() {
    return sideLength * sideLength * sideLength;
  }

}
