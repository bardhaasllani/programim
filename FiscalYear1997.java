import java.awt.*;
public class FiscalYear1997
{
public static void main(String[] args)
  {
   PieChartWriter c =  new PieChartWriter();
   c.setTitle("INCOME"); 
   c.setSlice1(" Personal income taxes: 46% ",46,Color.pink); 
   c.setSlice2(" Social security and medicare taxes: 34% ",34,Color.gray);
   c.setSlice3(" Corporate income taxes: 11% ",11,Color.blue);
   c.setSlice4(" Excise and customs taxes: 8% ",5,Color.red);
   c.setSlice5(" Borrowing to cover deficit: 1% ",1,Color.green);
      
  }
}