//even or odd number

//static -> class variable

public class evenodd 
{
  public static void main(String[] args)
  {
    evod(5);
    evod(10);
  }

  static void evod(int num)
  {
      if(num%2==0)
         System.out.println(num + " is even number.");
      else
         System.out.println(num + " is odd number.");
         
  }  
}
