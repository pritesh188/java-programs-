class Student{
	String name;
	int age;
	

public void studentInfo() {
	System.out.println(this.name);
	System.out.println(this.age);
}

Student(String name,int age){
	this.name=name;
	this.age=age;
}


}
public class constructor {

	public static void main(String[] args) {
		Student s1=new Student("pritesh",22);
		Student s2=new Student("shashank_noob",22);
		
		s1.studentInfo();
		s2.studentInfo();

	}

}
