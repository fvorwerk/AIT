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

public class Jrahmsosse extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JButton jButton1 = new JButton();
  private JLabel jLabel2 = new JLabel();
  // Ende Attribute
  
  public Jrahmsosse(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 215;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(8, 8, 471, 70);
    jLabel1.setText("");
    
    jLabel1.setFont(new Font("Lobster", Font.BOLD, 36));
    cp.add(jLabel1);
    
    jTextField1.setBounds(8, 96, 265, 33);
    cp.add(jTextField1);
    jTextField1.setText("");
    jButton1.setBounds(8, 136, 265, 33);
    jButton1.setText("Auf geht's!");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    
    jButton1.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 2));
    jButton1.setFont(new Font("Lobster", Font.ITALIC, 16));
    
    cp.add(jButton1);
    jLabel2.setBounds(8, 80, 265, 17);
    jLabel2.setText("gib den Namen einer Person ein, die du nicht magst:");
    jLabel2.setFont(new Font("Dialog", Font.PLAIN, 11));
    jLabel2.setBackground(Color.WHITE);
    jLabel2.setOpaque(true);
    cp.add(jLabel2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Jrahmsosse
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Jrahmsosse("Jrahmsosse");
    
    
    
    
    
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    Container cp = getContentPane();
    cp.setBackground(getRandomColor());
    jButton1.setBackground(getRandomColor());
    jButton1.setForeground(getRandomColor());
    
    jLabel1.setForeground(getRandomColor());
    
    
    String text = jTextField1.getText();
    jTextField1.selectAll();
    jLabel1.setText( text +  " ist dumm!");
    
    
    
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
} // end of class Jrahmsosse
