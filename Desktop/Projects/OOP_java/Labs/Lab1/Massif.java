import java.util.Random;

public class Massif
{
    public static void main (String[] args)
    {
      Random randomizer = new Random();
      int n = 5 + randomizer.nextInt(15);
      int[] massif = new int[n];
      int massifSum = 0;

      for (int count = 0; count < n; count++)
      {
        massif[count] = 1 + randomizer.nextInt(10);
        massifSum = massifSum + massif[count];
        System.out.println ("massif ["+count+"] = " +massif[count]);
      }

      System.out.println ("Summay of massif elements equals " + massifSum+ "\n");
    }
}
