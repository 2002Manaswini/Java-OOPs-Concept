import java.util.Scanner;

public class adding
{
    public static void main(String[] args)
    {
       try (Scanner s = new Scanner(System.in))
        {
        System.out.println("Enter the number1 :");
           int num1=s.nextInt();
           
           System.out.println("Enter the number2 :");
           int num2=s.nextInt();
           
           addition(num1,num2);
        }
    }
    
    public static void addition(int num1,int num2)
    {
        int sum=num1+num2;
        
        System.out.println("sum of " +num1 +"and " +num2 + " is : " +sum);
    }
}
//using scanner for methods 