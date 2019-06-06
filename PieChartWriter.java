import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class PieChartWriter extends JPanel
{
  private int width=600; 
  private int height=300; 
  private int x = width/40;
  private int y = height/30; 
  private int diameter =height-height/3; 
  private String label1 ="",label2 ="",label3 ="",label4 ="",label5 ="",label6="";
  private Color ngjyra1,ngjyra2,ngjyra3,ngjyra4,ngjyra5,ngjy  ra6;
  private double amount1,amount2,amount3,amount4,amount5,amount6;
  private double totalStartAngle=0;
  private JFrame korniza = new JFrame();
  public PieChartWriter()
  {
  korniza.getContentPane().add(this);
  korniza.setSize(width,height);
  korniza.setVisible(true);
  }
  
  public void setTitle(String title)
  {
   korniza.setTitle(title);
  }
  
   public void paintComponent(Graphics g)
  {
  g.setColor(Color.white);
  g.fillRect(0,0,width,height);
  draw(ngjyra1,label1,0,calculateArcAngle(amount1),1,g);
  draw(ngjyra2,label2,calculatestartAngle(amount1),calculateArcAngle(amount2),2,g);
  draw(ngjyra3,label3,calculatestartAngle(amount2),calculateArcAngle(amount3),3,g);
  draw(ngjyra4,label4,calculatestartAngle(amount3),calculateArcAngle(amount4),4,g);
  draw(ngjyra5,label5,calculatestartAngle(amount4),calculateArcAngle(amount5),5,g);
  draw(ngjyra6,label6,calculatestartAngle(amount5),calculateArcAngle(amount6),6,g);

  }
  private void draw(Color ngjyra,String label,double startAngle,double arcAngle,int m,Graphics g){
  Graphics2D g2 = (Graphics2D) g; //ja bon casting ashtu qe me mujt me perdore fillArc qe merr parametra double
  g2.setPaint(ngjyra);
  g2.fill(new Arc2D.Double(x,y,diameter,diameter,startAngle,arcAngle, Arc2D.PIE));
  g.drawString(label,250,40+20*m);
  }
  private double total(){
  double totali=amount1+amount2+amount3+amount4+amount5+amount6;
  return totali;
  }
  
  private double calculateArcAngle(double amount){
  return (amount*360)/total();
  }
  
  private double calculatestartAngle(double amount){
   totalStartAngle = totalStartAngle + calculateArcAngle(amount); 
   return totalStartAngle;
  }

   public void setSlice1(String label,double amount,Color C){
  label1 =label;
  amount1 = amount;
  ngjyra1=C;
  this.repaint();
  }
  public void setSlice2(String label,double amount,Color C){
  label2 =label;
  amount2=amount;
  ngjyra2=C;
  this.repaint();
  }
  public void setSlice3(String label,double amount,Color C){
  label3 =label;
  amount3=amount;
  ngjyra3=C;
  this.repaint();
  }
   public void setSlice4(String label,double amount,Color C){
  label4 =label;
  amount4=amount;
  ngjyra4=C;
  this.repaint();
  } 
  public void setSlice5(String label,double amount,Color C){
  label5 =label;
  amount5=amount;
  ngjyra5=C;
  this.repaint();
  }
  public void setSlice6(String label,double amount,Color C){
  label6 =label;
  amount6=amount;
  ngjyra6=C;
  this.repaint();
  }
}