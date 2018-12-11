import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;
class Versus extends JFrame
{
  int milanScore = 0;
  int madridScore = 0;
  JButton milan = new JButton("AC Milan");
  JButton madrid = new JButton("Real Madrid");
  JLabel result = new JLabel("Result: "+milanScore+'X'+madridScore);
  JLabel lastSoccer = new JLabel ("Last Soccer: ");
  JLabel winner = new JLabel ("Winner: ");

  public Versus ()
  {
    super("Versus");
    setLayout(new GridLayout());
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add (milan);
    add (madrid);
    add (result);
    add (lastSoccer);
    add (winner);

    milan.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
          milanScore++;
          result.setText("Result: "+milanScore+'X'+madridScore);
          lastSoccer.setText ("Last Soccer: AC Milan");
          if (milanScore == madridScore)
              winner.setText("Winner: Draw");
          else if (milanScore > madridScore)
              winner.setText("Winner: Milan Ac");
          else  winner.setText("Winner: Real Madrid");

      }
    });

    madrid.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
          madridScore++;
          result.setText("Result: "+milanScore+'X'+madridScore);
          lastSoccer.setText ("Last Soccer: Real Madrid");
          if (milanScore == madridScore)
              winner.setText("Winner: Draw");
          else if (milanScore > madridScore)
              winner.setText("Winner: Milan Ac");
          else  winner.setText("Winner: Real Madrid");
      }
    });
  }

    public static void main(String[]args)
  {
    new Versus().setVisible(true);
  }
}
