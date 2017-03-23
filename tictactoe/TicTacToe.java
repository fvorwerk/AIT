import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

/**
  *
  * Beschreibung
  *
  * @version 0.1 vom 09.03.2017
  * @author Felix Vorwerk 
  */

public class TicTacToe extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  private JButton jButton9 = new JButton();
  private JButton jButton10 = new JButton();
  private JButton jButton11 = new JButton();
  // Ende Attribute
  
  int counter = 0;
  int[] auswahl = {8,8,8,8,8,8,8,8,8};
  int[] buttons = {8,8,8,8,8,8,8,8,8};
  
  
  public TicTacToe(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 265; 
    int frameHeight = 324;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(0, 0, 83, 81);
    jButton1.setText("Frei");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(88, 0, 83, 81);
    jButton2.setText("Frei");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(176, 0, 83, 81);
    jButton3.setText("Frei");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(0, 88, 83, 81);
    jButton4.setText("Frei");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(88, 88, 83, 81);
    jButton5.setText("Frei");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(176, 88, 83, 81);
    jButton6.setText("Frei");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(0, 176, 83, 81);
    jButton7.setText("Frei");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    cp.add(jButton7);
    jButton8.setBounds(88, 176, 83, 81);
    jButton8.setText("Frei");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    cp.add(jButton8);
    jButton9.setBounds(176, 176, 83, 81);
    jButton9.setText("Frei");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    cp.add(jButton9);
    jButton10.setBounds(0, 264, 83, 25);
    jButton10.setText("Array");
    jButton10.setMargin(new Insets(2, 2, 2, 2));
    jButton10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton10_ActionPerformed(evt);
      }
    });
    cp.add(jButton10);
    jButton11.setBounds(176, 264, 75, 25);
    jButton11.setText("Reset");
    jButton11.setMargin(new Insets(2, 2, 2, 2));
    jButton11.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton11_ActionPerformed(evt);
      }
    });
    cp.add(jButton11);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public TicTacToe
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new TicTacToe("TicTacToe");
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    jButton1.setFont(new Font("Dialog", Font.BOLD, 72));
    
    if (counter %2 == 0) {
      jButton1.setBackground(Color.RED);
      jButton1.setText("X");
      buttons[counter] = 0; 
      
    } else {
      jButton1.setBackground(Color.GREEN);
      jButton1.setText("O");
      buttons[counter] = 1; 
    } // end of if-else
    counter++;
    jButton1.setEnabled(false);
    
    
    // TODO hier Quelltext einf�gen
  } // end of jButton1_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    jButton2.setFont(new Font("Dialog", Font.BOLD, 72));
    
    if (counter %2 == 0) {
      jButton2.setBackground(Color.RED);
      jButton2.setText("X");
      buttons[1] = 0; 
      
    } else {
      jButton2.setBackground(Color.GREEN);
      jButton2.setText("O");
      buttons[1] = 1; 
    } // end of if-else
    counter++;
    jButton2.setEnabled(false);
    
    
    
    
    // TODO hier Quelltext einf�gen
  } // end of jButton2_ActionPerformed
  
  public void jButton3_ActionPerformed(ActionEvent evt) {
    jButton3.setFont(new Font("Dialog", Font.BOLD, 72));
    
    if (counter %2 == 0) {
      jButton3.setBackground(Color.RED);
      jButton3.setText("X");
      buttons[2] = 0; 
      
    } else {
      jButton3.setBackground(Color.GREEN);
      jButton3.setText("O");
      buttons[2] = 1; 
    } // end of if-else
    counter++;
    jButton3.setEnabled(false);
    // TODO hier Quelltext einf�gen
  } // end of jButton3_ActionPerformed
  
  public void jButton4_ActionPerformed(ActionEvent evt) {
    jButton4.setFont(new Font("Dialog", Font.BOLD, 72));
       counter++;
    setzen(jButton4, auswahl, counter, 3);
    if (auswerten(auswahl, counter) == 1) {
      //this.dispose(); 
      //new RedWins("Red Wins");
    } 
    if (auswerten(auswahl, counter) == 2) {
     // this.dispose();
     // new YellowWins("Yellow Wins"); 
    }
    if (auswerten(auswahl, counter) == 3) {
      //this.dispose();
      //new Draw("Draw");
    }
    
   
    // TODO hier Quelltext einf�gen
  } // end of jButton4_ActionPerformed
  
  public void jButton5_ActionPerformed(ActionEvent evt) {
    jButton5.setFont(new Font("Dialog", Font.BOLD, 72));
    
    if (counter %2 == 0) {
      jButton5.setBackground(Color.RED);
      jButton5.setText("X");
      buttons[4] = 0; 
      
    } else {
      jButton5.setBackground(Color.GREEN);
      jButton5.setText("O");
      buttons[4] = 1; 
    } // end of if-else
    counter++;
    jButton5.setEnabled(false);
    // TODO hier Quelltext einf�gen
  } // end of jButton5_ActionPerformed
  
  public void jButton6_ActionPerformed(ActionEvent evt) {
    jButton6.setFont(new Font("Dialog", Font.BOLD, 72));
    if (counter %2 == 0) {
      jButton6.setBackground(Color.RED);
      jButton6.setText("X");
      buttons[5] = 0; 
      
    } else {
      jButton6.setBackground(Color.GREEN);
      jButton6.setText("O");
      buttons[5] = 1; 
    } // end of if-else
    counter++;
    jButton6.setEnabled(false);
    // TODO hier Quelltext einf�gen
  } // end of jButton6_ActionPerformed
  
  public void jButton7_ActionPerformed(ActionEvent evt) {
    jButton7.setFont(new Font("Dialog", Font.BOLD, 72));
    if (counter %2 == 0) {
      jButton7.setBackground(Color.RED);
      jButton7.setText("X");
      buttons[6] = 0; 
      
    } else {
      jButton7.setBackground(Color.GREEN);
      jButton7.setText("O");
      buttons[6] = 1; 
    } // end of if-else
    counter++;
    jButton7.setEnabled(false);
    // TODO hier Quelltext einf�gen
  } // end of jButton7_ActionPerformed
  
  public void jButton8_ActionPerformed(ActionEvent evt) {
    jButton8.setFont(new Font("Dialog", Font.BOLD, 72));
    if (counter %2 == 0) {
      jButton8.setBackground(Color.RED);
      jButton8.setText("X");
      buttons[7] = 0; 
      
    } else {
      jButton8.setBackground(Color.GREEN);
      jButton8.setText("O");
      buttons[7] = 1; 
    } // end of if-else
    counter++;
    jButton8.setEnabled(false);
    // TODO hier Quelltext einf�gen
  } // end of jButton8_ActionPerformed
  
  public void jButton9_ActionPerformed(ActionEvent evt) {
    jButton9.setFont(new Font("Dialog", Font.BOLD, 72));
    if (counter %2 == 0) {
      jButton9.setBackground(Color.RED);
      jButton9.setText("X");
      buttons[8] = 0; 
      
    } else {
      jButton9.setBackground(Color.GREEN);
      jButton9.setText("O");
      buttons[8] = 1; 
    } // end of if-else
    counter++;
    jButton9.setEnabled(false);
    // TODO hier Quelltext einf�gen
  } // end of jButton9_ActionPerformed
  
  /*
  public static boolean farbe(int counter){
  
  
  } */ 
  public void jButton10_ActionPerformed(ActionEvent evt) {
    JOptionPane.showMessageDialog(this, Arrays.toString(buttons), "Array", JOptionPane.INFORMATION_MESSAGE);
    
    // TODO hier Quelltext einf�gen
  } // end of jButton10_ActionPerformed

  public void jButton11_ActionPerformed(ActionEvent evt) {
    this.dispose();
    new TicTacToe("TicTacToe");
    
     
    // TODO hier Quelltext einf�gen
  } // end of jButton11_ActionPerformed
  
  
  
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
  

  // Ende Methoden
} // end of class TicTacToe


