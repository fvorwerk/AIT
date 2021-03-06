import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Draw extends JFrame {
  
  private JLabel jLabel1 = new JLabel();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  
  
  public Draw(String title) { 
    
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 330; 
    int frameHeight = 220; 
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    
    jLabel1.setBounds(0, 0, 298, 65);
    jLabel1.setText("gleichstand");
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    
    jLabel1.setOpaque(false);
    jLabel1.setFont(new Font("Lovelo Black", Font.PLAIN, 36));
    cp.add(jLabel1);
    jButton1.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
    jButton1.setBounds(16, 80, 281, 41);
    jButton1.setText("nochmal");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    jButton1.setFocusPainted(false);
    
    jButton1.setFont(new Font("Lovelo Black", Font.BOLD, 16));
    cp.add(jButton1);
    jButton2.setBounds(16, 128, 281, 41);
    jButton2.setText("schlie�en");
    jButton2.setBorder(new javax.swing.border.LineBorder(Color.WHITE, 2));
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    jButton2.setFocusPainted(false);
    
    jButton2.setFont(new Font("Lovelo Black", Font.BOLD, 16));
    
    cp.add(jButton2);
    setVisible(true);
  } 
  
  public static void main(String[] args) {
    new Draw("Draw");
  } 
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    new TicTacToe("Tic-Tac-Toe");
    this.dispose();
  } 
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    System.exit(0);
  } 
} 
