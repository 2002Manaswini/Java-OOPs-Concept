//area of rectangle

public class rectangle
{
  int len,br;

  void getlen(int l,int b)
  {
      len=l;
      br=b;
  }

  void getar()
  {
      System.out.println("area is :"+len*br);
  }

  public static void main(String[] args)
  {
      rectangle r1=new rectangle();
      r1.getlen(5, 6);
      r1.getar();
  }
}
