
interface Calculate
{
	  double power(int x,int y);
}

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculate obj= ( int x,int y) -> Math.pow(x, y);
		System.out.println(obj.power(2, 3));

	}

}
