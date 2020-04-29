interface Space
{
	public String insertSpace(String s);
}
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String x="Ghaziabad";
	
		Space obj=(String s) -> {
			String y="";
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				y+=ch+" ";
			}
			y.trim();
			return y;
			
		};
		
		System.out.print(obj.insertSpace("Ghaziabad"));

	}

}
