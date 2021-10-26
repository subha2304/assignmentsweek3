package Student;

public class students {
	public void getStudentsInfo(){
		String name = "subha";
		System.out.println("name:" + name);
	}
	public void getStudentsInfo(String name , int empId) {
		System.out.println("name:"+name);
		System.out.println("ID:"+ empId);
	}
	public void getStudentsInfo(String email , String phnNo) {
		System.out.println("email"+ email);
		System.out.println("phoneNum" + phnNo);
	}
public static void main(String[] args) {
	students info = new students();
	info.getStudentsInfo();
	info.getStudentsInfo("qwwe@gmail.com",1234567890);
	info.getStudentsInfo("subha", 12);
}
}
