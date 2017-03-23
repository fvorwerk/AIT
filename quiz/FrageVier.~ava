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

public class FrageVier extends Frame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  // Ende Attribute
  
  public FrageVier(String title) { 
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
    jLabel1.setText("&&& || €");
    jLabel1.setFont(new Font("Dialog", Font.BOLD, 24));
    cp.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public FrageVier
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new FrageVier("FrageVier");
  } // end of main
  
  // Ende Methoden
} // end of class FrageVier
