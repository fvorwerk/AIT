import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 09.02.2017
  * @author 
  */

public class Falsch extends Frame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  // Ende Attribute
  
  public Falsch(String title) { 
    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 300; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    
    jLabel1.setBounds(8, 8, 275, 41);
    jLabel1.setText("Leider Flasch!");
    cp.add(jLabel1);
    jButton1.setBounds(8, 64, 265, 49);
    jButton1.setText("Och menno! Nochmal!");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(8, 120, 265, 17);
    jButton2.setText("Bye Bye Miss American Pie!");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Falsch
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Falsch("Falsch");
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    new FrageEins("Frage 1");
    this.dispose();
    
    // TODO hier Quelltext einfügen
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    this.dispose();
    
    // TODO hier Quelltext einfügen
  } // end of jButton2_ActionPerformed

  // Ende Methoden
} // end of class Falsch
