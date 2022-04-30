class bank
{
    int getinterest()
    {
        return 0;
    }
}

class SBI extends bank
{
    int getinterest()
    {
        return 10;
    }
}

class HDFC extends SBI
{
   int getinterest()
   {
       return 4;
   }
}

class overrid2 extends HDFC
{
    int getinterest()
    {
        return 15;
    }
    public static void main(String[] args)
    {
      overrid2 r=new overrid2();
      System.out.println("interest of overrid : " +r.getinterest()); 

      HDFC h=new HDFC();
      System.out.println("interest of hdfc : " +h.getinterest());

      SBI s=new SBI();
      System.out.println("interest of sbi : " +s.getinterest());

      bank b=new bank();
      System.out.println("interest of bank : " +b.getinterest());
    }

}