
public class co
{
    int id;
    int roll;
    int age;
    
    co(int i,int r)
    {
	  id=i;
	  roll=r;
    }
    
    co(int i,int r,int a)
    {
      id=i;
      roll=r;
      age=a;
    }
    
    void dis()
    {
        System.out.println("id :" +id + " roll :" +roll + " age :" +age);
    }
    
	public static void main(String[] args)
	{
	   co m1=new co(1176,12);
	   co m2=new co(1134,10,20);
	   m1.dis();
	   m2.dis();
	}
}
