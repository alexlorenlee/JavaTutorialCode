
public class StringInteger {

	public static void main(String[] args) {

		String s = "age: 47";
		s = s.replaceAll("\\D+","");
		
		int n = Integer.parseInt(s);
		
		System.out.println(n + 2);
		
	}

}
