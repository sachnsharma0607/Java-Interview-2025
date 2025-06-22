
public class StringEqualTest {

	public static void main(String[] args) {
		
		String s1=new String("Sachin");
		String s2=new String("Sachin");
		if(s1==s2)
		{
			System.out.println("== true");
		}
		else
		{
			System.out.println("== false");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("equals true");
		}
		else
		{
			System.out.println("equals false");
		}
	}
}
