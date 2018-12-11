public class BookTest
{
    public static void main (String[] args)
    {
      Book Orwell = new Book("1984", "George Orwell");
      Book Bradbury = new Book ("Fahrenheit 451", "Ray Bradbury", "dystopian");
      Book Haxley = new Book ("Brave New World", "Aldous Haxley", "dystopian", 1932, 1);

      System.out.print ("\n");
      //
      Orwell.LightDisplay();
      Bradbury.MiddleDisplay();
      Haxley.FullDisplay();
      System.out.print ("\nSetting new info\n\n");

      Orwell.SetLightInfo("Animal Farm", "George Orwell");
      Orwell.LightDisplay();

      Bradbury.SetMiddInfo("Dandelion Wine", "Rad Bradbury", "realism");
      Bradbury.MiddleDisplay();

      Haxley.SetFullInfo("The Doors of Perception", "Aldous Haxley", "essai", 1954, 1);
      Haxley.FullDisplay();



      System.out.print ("\n");
    }
}
