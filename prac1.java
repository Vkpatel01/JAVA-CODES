class Student{
	private int roll;
	private int marks;
	private double per;
	void setData(){
		roll=21;
		marks=75;
		per=75.5;

	}
	void display(){
		System.out.println(roll);
		System.out.println(marks);
		System.out.println(per);

	}

}

class prac1{
	public static void main(String []args){
		Student s1=new Student();
		s1.setData();
		s1.display();


	}
}