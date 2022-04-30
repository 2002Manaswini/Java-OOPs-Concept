public class statickey
{
    int length;
    int breadth;
    int height=3;

    void get(int l,int b)
    {
        length=l;
        breadth=b;
    }

    void ar()
    {
        System.out.println("Area : "+length*breadth*height);
    }
    
    public static void main(String[] args)
    {
        statickey s1=new statickey();
        s1.get(4, 3);
        s1.ar();
    }

}
