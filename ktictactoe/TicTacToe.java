import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Arrays;

public class TicTacToe extends JFrame {
  
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  private JButton jButton9 = new JButton();
  
  int counter = 0;
  int[] auswahl = {4,4,4,4,4,4,4,4,4};
  private JLabel jLabel1 = new JLabel();
  
  private JLabel jLabel2 = new JLabel();
  
    
  
  public TicTacToe(String title) { 
    
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 327; 
    int frameHeight = 349;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    
    jButton1.setBounds(8, 8, 97, 97);
    jButton1.setText("");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
  
    
    jButton1.setSelected(false);
    jButton1.setRolloverEnabled(true);
    jButton1.setFocusPainted(false);
    
    jButton1.setForeground(Color.BLACK);
    jButton1.setFont(new Font("Arial Narrow", Font.PLAIN, 72));
    cp.add(jButton1);
    jButton2.setBounds(112, 8, 97, 97);
    jButton2.setText("");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
   

    jButton2.setSelected(false);
    jButton2.setRolloverEnabled(true);
    jButton2.setFocusPainted(false);
    jButton2.setFont(new Font("Arial Narrow", Font.PLAIN, 72));
    jButton2.setForeground(Color.BLACK);
    cp.add(jButton2);
    jButton3.setBounds(216, 8, 97, 97);
    jButton3.setText("");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
  

    jButton3.setFocusPainted(false);
    jButton3.setFont(new Font("Arial Narrow", Font.PLAIN, 72));
    cp.add(jButton3);
    jButton4.setBounds(8, 112, 97, 97);
    jButton4.setText("");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });


    jButton4.setFocusPainted(false);
    jButton4.setFont(new Font("Arial Narrow", Font.PLAIN, 72));
    cp.add(jButton4);
    jButton5.setBounds(112, 112, 97, 97);
    jButton5.setText("");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
   

    jButton5.setFocusPainted(false);
    jButton5.setFont(new Font("Arial Narrow", Font.PLAIN, 72));
    cp.add(jButton5);
    jButton6.setBounds(216, 112, 97, 97);
    jButton6.setText("");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    

    jButton6.setFocusPainted(false);
    jButton6.setFont(new Font("Arial Narrow", Font.PLAIN, 72));
    cp.add(jButton6);
    jButton7.setBounds(8, 216, 97, 97);
    jButton7.setText("");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });


    jButton7.setFocusPainted(false);
    jButton7.setFont(new Font("Arial Narrow", Font.PLAIN, 72));

    cp.add(jButton7);
    jButton8.setBounds(112, 216, 97, 97);
    jButton8.setText("");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
  

    jButton8.setFocusPainted(false);
    jButton8.setFont(new Font("Arial Narrow", Font.PLAIN, 72));
    cp.add(jButton8);
    jButton9.setBounds(216, 216, 97, 97);
    jButton9.setText("");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    

    jButton9.setFocusPainted(false);
    jButton9.setForeground(new Color(0x34495e));
    jButton9.setFont(new Font("Arial Narrow", Font.PLAIN, 72));

    cp.add(jButton9);
    cp.setBackground(Color.WHITE);
    
    
    
    setVisible(true);
  } 
  
  public static void main(String[] args) {
    new TicTacToe("TicTacToe");
  } 
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    counter++;
    setzen(jButton1, auswahl, counter, 0);
    if (auswerten(auswahl, counter) == 1) {
      this.dispose(); 
      new RedWins("Red Wins");
    } 
    if (auswerten(auswahl, counter) == 2) {
      this.dispose();
      new YellowWins("Yellow Wins");
    }
    if (auswerten(auswahl, counter) == 3) {
      this.dispose();
      new Draw("Draw");
    } 
  }
    
  public void jButton2_ActionPerformed(ActionEvent evt) {
    counter++;
    setzen(jButton2, auswahl, counter, 1);
    
    if (auswerten(auswahl, counter) == 1) {
      this.dispose(); 
      new RedWins("Red Wins");
    } 
    if (auswerten(auswahl, counter) == 2) {
      this.dispose();
      new YellowWins("Yellow Wins");
    }
    if (auswerten(auswahl, counter) == 3) {
      this.dispose();
      new Draw("Draw");
    } 
  } 
    
  public void jButton3_ActionPerformed(ActionEvent evt) {
    counter++;
    setzen(jButton3, auswahl, counter, 2);
    if (auswerten(auswahl, counter) == 1) {
      this.dispose(); 
      new RedWins("Red Wins");
    } 
    if (auswerten(auswahl, counter) == 2) {
      this.dispose();
      new YellowWins("Yellow Wins");
    }
    if (auswerten(auswahl, counter) == 3) {
      this.dispose();
      new Draw("Draw");
    } 
  }
  public void jButton4_ActionPerformed(ActionEvent evt) {
    counter++;
    setzen(jButton4, auswahl, counter, 3);
    if (auswerten(auswahl, counter) == 1) {
      this.dispose(); 
      new RedWins("Red Wins");
    } 
    if (auswerten(auswahl, counter) == 2) {
      this.dispose();
      new YellowWins("Yellow Wins");
    }
    if (auswerten(auswahl, counter) == 3) {
      this.dispose();
      new Draw("Draw");
    } 
  } 
    
  public void jButton5_ActionPerformed(ActionEvent evt) {
    counter++;
    setzen(jButton5, auswahl, counter, 4);
    if (auswerten(auswahl, counter) == 1) {
      this.dispose(); 
      new RedWins("Red Wins");
    } 
    if (auswerten(auswahl, counter) == 2) {
      this.dispose();
      new YellowWins("Yellow Wins");
    }
    if (auswerten(auswahl, counter) == 3) {
      this.dispose();
      new Draw("Draw");
    } 
  } 
    
  public void jButton6_ActionPerformed(ActionEvent evt) {
    counter++;
    setzen(jButton6, auswahl, counter, 5);
    if (auswerten(auswahl, counter) == 1) {
      this.dispose(); 
      new RedWins("Red Wins");
    } 
    if (auswerten(auswahl, counter) == 2) {
      this.dispose();
      new YellowWins("Yellow Wins");
    }
    if (auswerten(auswahl, counter) == 3) {
      this.dispose();
      new Draw("Draw");
    } 
  }
    
  public void jButton7_ActionPerformed(ActionEvent evt) {
    counter++;
    setzen(jButton7, auswahl, counter, 6);
    if (auswerten(auswahl, counter) == 1) {
      this.dispose(); 
      new RedWins("Red Wins");
    } 
    if (auswerten(auswahl, counter) == 2) {
      this.dispose();
      new YellowWins("Yellow Wins");
    }
    if (auswerten(auswahl, counter) == 3) {
      this.dispose();
      new Draw("Draw");
    } 
  }
    
  public void jButton8_ActionPerformed(ActionEvent evt) {
    counter++;
    setzen(jButton8, auswahl, counter, 7);
    if (auswerten(auswahl, counter) == 1) {
      this.dispose(); 
      new RedWins("Red Wins");
    } 
    if (auswerten(auswahl, counter) == 2) {
      this.dispose();
      new YellowWins("Yellow Wins");
    }
    if (auswerten(auswahl, counter) == 3) {
      this.dispose();
      new Draw("Draw");
    } 
  } 
    
  public void jButton9_ActionPerformed(ActionEvent evt) {
    counter++;
    setzen(jButton9, auswahl, counter, 8);
    if (auswerten(auswahl, counter) == 1) {
      this.dispose(); 
      new RedWins("Red Wins");
    } 
    if (auswerten(auswahl, counter) == 2) {
      this.dispose();
      new YellowWins("Yellow Wins");
    }
    if (auswerten(auswahl, counter) == 3) {
      this.dispose();
      new Draw("Draw");
    } 
  }
    
  public void setzen( JButton button,int[] auswahl, int counter, int position){
    if (counter%2 == 0) {
      button.setBackground(Color.RED);
      button.setText("X");
      auswahl[position]=0;
    } else{
      button.setBackground(Color.GREEN);
      button.setText("O");
      auswahl[position]=1;
    } 
    button.setEnabled(false);
  }
  public int auswerten(int[] auswahl, int counter){
    //erste Reihe
    if (auswahl[0] == 0 && auswahl[1] == 0 && auswahl[2] == 0) {
      return 1;
    } 
    if (auswahl[0] == 1 && auswahl[1] == 1 && auswahl[2] == 1) {
      return 2;
    } 
    //zweite Reihe
    if (auswahl[3] == 0 && auswahl[4] == 0 && auswahl[5] == 0) {
      return 1;
    } 
    if (auswahl[3] == 1 && auswahl[4] == 1 && auswahl[5] == 1) {
      return 2;
    } 
    //dritte Reihe
    if (auswahl[6] == 0 && auswahl[7] == 0 && auswahl[8] == 0) {
      return 1;
    } 
    if (auswahl[6] == 1 && auswahl[7] == 1 && auswahl[8] == 1) {
      return 2;
    } 
    //erste Spalte
    if (auswahl[0] == 0 && auswahl[3] == 0 && auswahl[6] == 0) {
      return 1;
    } 
    if (auswahl[0] == 1 && auswahl[3] == 1 && auswahl[6] == 1) {
      return 2;
    } 
    //zweite Spalte
    if (auswahl[1] == 0 && auswahl[4] == 0 && auswahl[7] == 0) {
      return 1;
    } 
    if (auswahl[1] == 1 && auswahl[4] == 1 && auswahl[7] == 1) {
      return 2;
    } 
    //dritte Spalte
    if (auswahl[2] == 0 && auswahl[5] == 0 && auswahl[8] == 0) {
      return 1;
    } 
    if (auswahl[2] == 1 && auswahl[5] == 1 && auswahl[8] == 1) {
      return 2;
    }
    //diagonal r->l
    if (auswahl[2] == 0 && auswahl[4] == 0 && auswahl[6] == 0) {
      return 1;
    } 
    if (auswahl[2] == 1&& auswahl[4] == 1&& auswahl[6] == 1) {
      return 2;
    }
    //diagonal l->r
    if (auswahl[0]  == 0&& auswahl[4] == 0 && auswahl[8] == 0) {
      return 1;
    } 
    if (auswahl[0] == 1 && auswahl[4] == 1 && auswahl[8] == 1) {
      return 2;
    }
    //unentschieden
    else if (counter==9) {
      return 3;
    } 
    else {
      return 10;
    } 
  }
}
  