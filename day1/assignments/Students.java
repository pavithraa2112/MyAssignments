package week3.day1.assignments;

public class Students {
public void getStudentInfo(int a) {
	System.out.println("ID:"+a);

}

public void getStudentInfo(int b,String c) {
	System.out.println("ID:"+b +" Name:"+ c);

}

public void getStudentInfo(String d,String e ) {
	System.out.println("Email:"+d +"Phone:"+ e);

}
public static void main(String[] args) {
	Students s = new Students();
	s.getStudentInfo(201);
	s.getStudentInfo(201,"Pavithraa");
	s.getStudentInfo("pavi2112@gmail,com", "9876543210");
}

}
