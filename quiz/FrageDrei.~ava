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

public class FrageDrei extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JLabel jLabel1 = new JLabel();
  // Ende Attribute
  
  public FrageDrei(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 152;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(8, 8, 265, 49);
    jButton1.setText("TRUMP");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(8, 80, 265, 17);
    jButton2.setText("Hillary");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jLabel1.setBounds(8, 64, 275, 19);
    jLabel1.setText("oder");
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public FrageDrei
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new FrageDrei("FrageDrei");
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    new FrageDrei("Frage 3");
    this.dispose();
    
    // TODO hier Quelltext einfügen
  } // end of jButton1_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    new Falsch("Leider Falsch!");
    this.dispose();
    
    // TODO hier Quelltext einfügen
  } // end of jButton2_ActionPerformed
  
  // Ende Methoden
} // end of class FrageDrei
