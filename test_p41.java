
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
	System.out.println("�Ͳ��F������"+ num +"�A�T�o�q��"+ gas +"�����l");
  }
  
  public void vShow()
  {
	System.out.println("�����O"+ num);
	System.out.println("�T�o�q�O"+ gas);
  }
  
  public void mShow()
  {
	System.out.println("���l������O�K");
  }
}