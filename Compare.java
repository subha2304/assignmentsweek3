package week3;

public class Compare {

	public static void main(String[] args) {
		String one = "I am Learning java";
		String two = "I am learning java";
		if(one.equals(two)) {
			System.out.println("same");
			
		}
			else {
				System.out.println("diff");
			}
		if(one.equalsIgnoreCase(two)) {
			System.out.println("same");
			
		}
			else {
				System.out.println("diff");
			}
		if(one==two) {
			System.out.println("same");
			
		}
			else {
				System.out.println("diff");
			}
	}

}
