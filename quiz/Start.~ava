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

public class Start extends Frame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JButton jButton1 = new JButton();
  // Ende Attribute
  
  public Start(String title) { 
    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 300; 
    int frameHeight = 146;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    
    jLabel1.setBounds(8, 8, 275, 25);
    jLabel1.setText("Spielername eingeben:");
    cp.add(jLabel1);
    jTextField1.setBounds(8, 40, 265, 25);
    cp.add(jTextField1);
    jButton1.setBounds(8, 72, 265, 25);
    jButton1.setText("Weiter");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Start
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Start("Start");
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    String spielerName = jTextField1.getText();
    jTextField1.selectAll();
    
    if (spielerName != null && !spielerName.isEmpty()) {
      new FrageEins("Frage 1");
      this.dispose();
      
      
    } else {
      new Start("Start");
      this.dispose();
    } // end of if-else
    
    
    
    // TODO hier Quelltext einfügen
  } // end of jButton1_ActionPerformed
  
  // Ende Methoden
} // end of class Start
