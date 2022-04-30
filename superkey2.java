class animal 
{
    void eat()
    {
        System.out.println("Animals are Eating ! ");
    }
}

class dog extends animal
{
  void eat()
  {
    System.out.println(" dog is Eating ! ");
  }

  void dis()
  {
      super.eat();
  }
}

public class superkey2 
{
    public static void main(String[] args)
    {
        dog d=new dog();
        d.dis();
    }
}
