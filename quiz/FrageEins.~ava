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

public class FrageEins extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  // Ende Attribute
  
  public FrageEins(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 128;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(8, 8, 275, 33);
    jLabel1.setText("Kann ich ihm vertrauen?");
    cp.add(jLabel1);
    jButton1.setBounds(8, 48, 129, 25);
    jButton1.setText("Ja");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(152, 48, 121, 25);
    jButton2.setText("Nein");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public FrageEins
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new FrageEins("FrageEins");
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    new Falsch("Leider Falsch!");
    this.dispose();
    
    // TODO hier Quelltext einfügen
  } // end of jButton1_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    new FrageZwei("Frage 2");
    this.dispose();
    
    // TODO hier Quelltext einfügen
  } // end of jButton2_ActionPerformed
  
  // Ende Methoden
} // end of class FrageEins
