//parcon -> parameterized constructors
//it includes parameters inside the constructors.

public class parcon
{
    int id;
    int roll;

    parcon(int i,int r)
    {
       id=i;
       roll=r;
    }

    void dis()
    {
        System.out.println("id is :"+id +" and roll is :" +roll );
    }

    public static void main(String[] args)
    {
        parcon p=new parcon(3415,563);
        p.dis();
    }  
}
