package selenium;

public class Justify {

	public static void main(String[] args) {
		String text= new String("Kutty");
		String text1 = new String("Kutty");
		if (text==text1) {
			System.out.println("same text");
			
		}else {
			System.out.println("diff text");
		//	
		}
	}

}
//it give "diff text" as output because new operator compares the memory location.
