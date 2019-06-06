import java.awt.*;
public class FiscalYear1997outcome
{
public static void main(String[] args)
  {
   PieChartWriter c =  new PieChartWriter();
   c.setTitle("OUTLAYS"); 
   c.setSlice2(" Social security medicare : 38% ",38,Color.gray);
   c.setSlice1(" National defense: 20% ",20,Color.pink); 
   c.setSlice3(" Social programs: 18% ",18,Color.blue);
   c.setSlice4(" Interest on national debt: 15% ",15,Color.red);
   c.setSlice5(" Human and community development: 7% ",7,Color.green);
   c.setSlice6(" General government: 2% ",2,Color.black);
  }
}