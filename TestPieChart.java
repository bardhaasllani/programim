import java.awt.*;
public class TestPieChart
{
public static void main(String[] args)
  {
   PieChartWriter c =  new PieChartWriter();
   c.setTitle("How I spent my day"); 
   c.setSlice1(" Sleep: 7 hours",7,Color.black); 
   c.setSlice2(" Recreation: 9 hours",9,Color.gray);
   c.setSlice3(" In class: 3 hours",3,Color.blue);
   c.setSlice4(" Homework: 5 hours",5,Color.red);
      
  }
}