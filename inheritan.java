public class inheritan
{
    int std=9;

  static class inher extends inheritan
   {
       String name="Roshni";
   }
   public static void main(String[] args) 
   {
       inher i=new inher();
       System.out.println("Name is : " +i.name);
       System.out.println("Name is : " +i.std);

   }
}
