// we have method run() in the child class which has been declared also in the parent class.

class Vehicle
{  
   void run()
    {
        System.out.println("Vehicle is running");
    }  
}  
  
class overrid1 extends Vehicle
  {  
    void run()
    {
        System.out.println("Bike is running safely");
    }  
    
    public static void main(String args[])
    {  
      overrid1 v = new overrid1(); 
      v.run(); 

      Vehicle v1=new Vehicle();
      v1.run();
    }  
}  