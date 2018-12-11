import java.lang.*;
public class Rectangle extends Shape
{
  double width;
  double length;

  public Rectangle() {}

  public Rectangle (double width, double length)
  {
    this.width = width;
    this.length = length;
  }

  public Rectangle (double width, double length, String color, boolean filled)
  {
    this.width = width;
    this.length = length;
    this.color = color;
    this.filled = filled;
  }

  public double getWidth()
  {
    return width;
  }

  public void setWidth (double width)
  {
    this.width = width;
  }

  public double getLength()
  {
    return length;
  }

  public void setLength (double length)
  {
    this.length = length;
  }

  public double getArea()
  {
    return length * width;
  }

  public double getPerimeter ()
  {
    return length + width;
  }

  public String toString()
  {
    return "Shape: rectangle, width: "+this.width+", length: "+this.length+" , color "+this.color;
  }

}
