public class Square extends Rectangle
{
  double side;

  public  Square () {}

  public  Square (double side)
  {
    this.side = side;
  }

  public  Square (double side, String color, boolean filled)
  {
    this.side = side;
    this.color = color;
    this.filled = filled;
  }

  public double getSide ()
  {
    return side;
  }

  public void setSide (double side)
  {
    this.side = side;
  }

  public void setWidth ()
  {
    this.side = side;
  }

  public void setLength ()
  {
    this.side = side;
  }

  public String toString()
  {
    return "Shape: square, width: "+this.side+", length: "+this.side+" , color"+this.color;
  }
}
