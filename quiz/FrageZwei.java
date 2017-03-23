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

public class FrageZwei extends Frame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  // Ende Attribute
  
  public FrageZwei(String title) { 
    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 300; 
    int frameHeight = 108;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    
    jButton1.setBounds(8, 24, 129, 25);
    jButton1.setText("Rythmus");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(152, 24, 121, 25);
    jButton2.setText("Solo");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public FrageZwei
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new FrageZwei("FrageZwei");
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
} // end of class FrageZwei
