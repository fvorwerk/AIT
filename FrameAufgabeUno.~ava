import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 09.02.2017
  * @author 
  */

public class FrameAufgabeUno extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JButton jButton1 = new JButton();
  // Ende Attribute
  
  public FrameAufgabeUno(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 173;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTextField1.setBounds(8, 8, 265, 33);
    jTextField1.setFont(new Font("Papyrus", Font.BOLD + Font.ITALIC, 22));
    cp.add(jTextField1);
    jTextField2.setBounds(8, 48, 265, 33);
    jTextField2.setFont(new Font("Papyrus", Font.BOLD + Font.ITALIC, 22));
    cp.add(jTextField2);
    jButton1.setBounds(8, 88, 265, 41);
    jButton1.setText("Tauschen!");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.setFont(new Font("Lobster", Font.BOLD, 20));
    
    cp.add(jButton1);
    cp.setBackground(Color.BLUE);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public FrameAufgabeUno
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new FrameAufgabeUno("FrameAufgabeUno");
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    
    Container cp = getContentPane();
    cp.setBackground(getRandomColor());
    jButton1.setBackground(getRandomColor());
    jButton1.setForeground(getRandomColor());
    
    
    
    
    String text1 = jTextField1.getText();
    jTextField1.selectAll();
    String text2 = jTextField2.getText();
    jTextField2.selectAll();
    jTextField1.setText(text2);
    jTextField2.setText(text1);
    
    jTextField1.setForeground(getRandomColor());
    jTextField2.setForeground(getRandomColor());
    jTextField1.setBackground(getRandomColor());
    jTextField2.setBackground(getRandomColor());
    
    jButton1.setBorder(new javax.swing.border.LineBorder(getRandomColor(), 5, true));
    
    
    // TODO hier Quelltext einfügen
  } // end of jButton1_ActionPerformed
  
  
  public static Color getRandomColor() {
    Random rand = new Random();
    
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    
    Color randomColor = new Color(r, g, b);
    
    return randomColor;
  }
  
  // Ende Methoden
} // end of class FrameAufgabeUno
