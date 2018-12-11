import java.math.*;
public abstract class Shape
{
  String color;
  Boolean filled;

  public Shape () { }

  public Shape (String color, Boolean filled)
  {
    this.color = color;
    this.filled = filled;
  }

  public String getColor ()
  {
    return color;
  }

  public void setColor (String color)
  {
    this.color = color;
  }

  public boolean isFilled ()
  {
    return filled;
  }

  public void setFilled (Boolean filled)
  {
    this.filled = filled;
  }

  abstract double getArea();

  abstract double getPerimeter();

  public String toString() { return " ";}
}
