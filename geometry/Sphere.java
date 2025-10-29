package geometry;
import static java.lang.Math.*;

public class Sphere {
  private final double radius;

  public Sphere(double radius) {
    if (radius < 0) {
      throw new IllegalArgumentException("Radius need positive value");
    }
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double getVolume() {
    return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
  }

  public double getSurfaceArea() {
    return 4 * Math.PI * Math.pow(this.radius, 2);
  }

  @Override
  public String toString() {
    return String.format("Sphere{radius=%.2f}",
                         this.radius);
  }
}
