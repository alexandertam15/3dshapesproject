//demonstrates shapes classes
public class ShapesMain {

  public static void main(String args[]) {
    Shape[] shapes = new Shape[6];
    shapes[0] = new Cube(5.0);
    shapes[1] = new Sphere(5.0);
    shapes[2] = new Cone(5.0, 10.0);
    shapes[3] = new Cylinder(5.0, 10.0);
    shapes[4] = new RectangularPrism(3.0, 4.0, 5.0);
    shapes[5] = new TriangularPrism(3.0, 4.0, 5.0, 10.0, 10.0);

    for (int i = 0; i < shapes.length; i++) {
      System.out.println("surface area = " + shapes[i].getSurfaceArea() + ", volume = " + shapes[i].getVolume());
    }

  }

}
