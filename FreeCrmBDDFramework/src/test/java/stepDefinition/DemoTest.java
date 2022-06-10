package stepDefinition;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sourabhpan11@gmail.com";
		
		String str2 =str.replaceAll("[a-z]", "");
		
		String str3 =str.replaceAll("[0-9]", "");
		
		System.out.println(str2);
		
		System.out.println(str3);
	}

}
