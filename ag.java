 class add 
{
    String city,state;

    add(String c,String s)
    {
        this.city=c;
        this.state=s;
    }
}

public class ag
{
    String name;
    int roll;
    add ad;
  
    ag(String n,int r,add a)
    {
       this.name=n;
       this.roll=r;
       this.ad=a;
    }

    void dis()
    {
      System.out.println("name :"+name+" roll :"+roll);

      System.out.println(ad.city+ " "+ad.state);

      System.out.println("\n");
    }

    public static void main(String[] args)
    {
        add a1=new add("bbsr","odisha");
        add a2=new add("patna","bihar");

        ag s1=new ag("roshni",563,a1);
        ag s2=new ag("pummy",261,a2);

        s1.dis();
        s2.dis();


    }

}


