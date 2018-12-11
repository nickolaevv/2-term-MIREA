public class Info
{
    public static void main (String[] args)
    {
      Book Orwell = new Book("1984", "George Orwell");
      Book Bradbury = new Book ("Fahrenheit 451", "Ray Bradbury", "dystopian");
      Book Haxley = new Book ("Brave New World", "Aldous Haxley", "dystopian", 1932, 1);

      Orwell.LightDisplay();
      Bradbury.MiddleDisplay();
      Haxley.FullDisplay();
    }
}
