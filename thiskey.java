//this key for current class instance variable

public class thiskey
{
  String name; 
  int roll;
  int age;  

  thiskey(String name,int roll,int age)
  {
      this.name=name;
      this.roll=roll;
      this.age=age;
  }

  void dis()
  {
      System.out.println("name : "+name + ", roll : "+roll + ", age : "+age);
  }
  public static void main(String[] args)
  {
      thiskey t1=new thiskey("roshni", 563, 20);
      t1.dis();
      thiskey t2=new thiskey("pummy", 261, 21);
      t2.dis();
  }
}
