/**
 * Represents a rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
  * Creates a rectangle.
  *
  * @param w the width
  * @param h the height
  */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
  * Returns the area of this rectangle.
  *
  * @return the area
  */
  public double area() {
    return width * height;
  }

  /**
  * Scales the rectangle.
  *
  * @param factor the scale factor
  */
  public void scale(double factor) {
    width *= factor;
    height *= factor;
  }

  /**
  * Checks whether this rectangle is larger than another rectangle.
  *
  * @param other the other rectangle
  * @return whether this rectangle has a larger area
  */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
