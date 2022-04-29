//copy constructor

public class copyconstructor
{
   int length;
   int breadth;
   
   copyconstructor(int l,int b)
   {
       length=l;
       breadth=b;
   }

   copyconstructor(copyconstructor c)
   {
    length= c.length;
    breadth=c.breadth;
   }

   void dis()
   {
       System.out.println(" area : "+length*breadth);
   }

   public static void main(String[] args)
   {
       copyconstructor c1=new copyconstructor(4,5);
       copyconstructor c2=new copyconstructor(c1);
       c1.dis();
       c2.dis();
       
   }
}
