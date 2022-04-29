class A 
{
   A get()
   {
       return this;
   }

   void dis()
   {
       System.out.println("This is coariant return type example .");
   }
}

class B extends A
{
  B get()
  {
      return this;
  }

  void dis()
  {
      System.out.println("This is an example. ");
  }
}

class cov1 
{
   public static void main (String[] args)
   {
      A a=new A();
      B b=new B();
      a.get().dis();
      b.get().dis();  //covariant return type
   } 
}
