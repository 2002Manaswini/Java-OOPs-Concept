public class singleinher
{
   int len;
   int br;

   static class rectangle extends singleinher
   {
       int area;
       void findarea()
       {
           area=len*br;
       }

       void dis()
       {
        System.out.println("area :" + area);
       }
   }

   public static void main(String[] args)
   {
       rectangle r=new rectangle();
       r.len=20;
       r.br=30;
       r.findarea();
       r.dis();
   }
}