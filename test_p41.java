
public class test_p41
{
  public static void main(String[] args)
  {
	Car13 car1 = new Car13(1234,20.5);
	car1.vShow();
	car1.mShow();
  }
}
interface iVehicle13
{
  void vShow();	
}

interface iMaterial
{
  void mShow();	
}

class Car13 implements iVehicle13,iMaterial
{
  private int num;
  private double gas;
  
  public Car13(int n,double g)
  {
	num = n;
	gas = g;
	System.out.println("生產了車號為"+ num +"，汽油量為"+ gas +"的車子");
  }
  
  public void vShow()
  {
	System.out.println("車號是"+ num);
	System.out.println("汽油量是"+ gas);
  }
  
  public void mShow()
  {
	System.out.println("車子的材質是鐵");
  }
}