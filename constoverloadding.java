public class constoverloadding 
{
    int id;
    int roll;
    String sec="B";

    constoverloadding(int i,int r)
    {
      id=i;
      roll=r;
    }

    void dis()
    {
        System.out.println("id is :"+id +"\nroll is :" +roll +"\nsection is :"+sec);
    }

    public static void main(String[] args)
    {
        constoverloadding p1=new constoverloadding(3415,563);
        p1.dis();
    }  
}
