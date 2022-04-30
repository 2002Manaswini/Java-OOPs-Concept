
class A 
{
    int a=10;
}

class B extends A
{
    int a=20;

    void dis()
    {
        System.out.println("value of b for class B : "+ a);
        System.out.println("value of b for class A : "+ super.a);
    }
}



public class superkey 
{
    public static void main(String[] args)
    {
      B b=new B();
      b.dis();
    }
}
