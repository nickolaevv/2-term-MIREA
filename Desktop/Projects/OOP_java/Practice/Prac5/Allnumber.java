import java.util.Random;

public class Allnumber
{
    public static void main (String[] args)
    {
      Random randomizer = new Random();
      int n = 5 + randomizer.nextInt(15);
      int underNumber = 0;
      int summary = 0;

      while (n > underNumber)
      {
        underNumber++;
        System.out.println(underNumber);
        summary = summary + underNumber;
      }
      System.out.println("N = "+n);
      System.out.println("Summary = "+summary);

    }
}
