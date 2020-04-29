interface Check
{
	public boolean isCorrect(String un,String pwd);
}


public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="osho@2020";
		String password="12345";
		Check obj=(un,pwd) ->
		{
			if(un.equals("osho@2020") && pwd.equals("12345"))
			{
				return true;
			}
			else
				return false;
		};
		
		System.out.println(obj.isCorrect(username, password));
		

	}

}
