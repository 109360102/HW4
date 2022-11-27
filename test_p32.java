
public class test_p32
{
  public static void main(String[] args)
  {
	Vehicle11[] vc;
	vc = new Vehicle11[2];
	
	vc[0] = new Car11(1234,20.5);
	vc[1] = new Plane11(232);
	
	for(int i=0;i<vc.length;i++)
	{
	  if(vc[i] instanceof Car11)
		System.out.println("��"+ (i+1) +"�Ӫ���OCar���O");
	  else
		System.out.println("��"+ (i+1) +"�Ӫ��󤣬OCar���O");
	}
  }
}
abstract class Vehicle11
{
  protected int speed;
  
  public void setSpeed(int s)
  {
	speed = s;
	System.out.println("�N�t�׳]��"+ speed +"�F");
  }
  
  abstract void show();
}
class Car11 extends Vehicle11
{
  private int num;
  private double gas;
  
  public Car11(int n,double g)
  {
	num = n;
	gas = g;
	System.out.println("�Ͳ��F������"+ num +"�A�T�o�q��"+ gas +"�����l");
  }
  
  public void show()
  {
	System.out.println("�����O"+ num);
	System.out.println("�T�o�q�O"+ gas);
	System.out.println("�t�׬O"+ speed);
  }
}
class Plane11 extends Vehicle11
{
  private int flight;
  
  public Plane11(int f)
  {
	flight = f;
	System.out.println("�Ͳ��F"+ flight +"�Z��������");
  }
  
  public void show()
  {
	System.out.println("�������Z���O"+ flight);
	System.out.println("�t�׬O"+ speed);
  }
}