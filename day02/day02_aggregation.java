//Aggrgation in Java
class details                                   //Common class used by gold,diamond ,silver
{
   float netweight,wastage,purity;
   int price;
   Boolean availability;
   details(float netweight,float wastage,float purity,int price,boolean availability)
   {
      this.netweight=netweight;
      this.wastage=wastage;
      this.purity=purity;
      this.price=price;
      this.availability=availability;
   }
   
}
class gold
{
   String gname;
   details dr;
   gold(String gname,details dr)
   {
        this.gname=gname;
        this.dr=dr;
   }
}
class diamond
{
   String dname;
   details dr;
   diamond(String dname,details dr)
   {
      this.dname=dname;
      this.dr=dr;
   }
}
class silver
{
   String sname;
   details dr;
   silver(String sname,details dr)
   {
         this.sname=sname;
         this.dr=dr;
   }
}
public class day02_aggregation{
   public static void main(String[] args) {
      details dr=new details(500.00f,2.40f, 24.0f, 5000, true);
      diamond d=new diamond("black pearl", dr);
      silver s=new silver("Silver",dr);
      gold g=new gold("antic ",dr);
      System.out.println("Diamond= "+d.dname);
      System.out.println("gold= "+g.gname);
      System.out.println("silver= "+s.sname);
      System.out.println("wastage= "+d.dr.wastage);
      System.out.println("purity= "+g.dr.purity);
      System.out.println("price= "+s.dr.price);
      System.out.println("Availability = "+dr.availability);
      
   }
}