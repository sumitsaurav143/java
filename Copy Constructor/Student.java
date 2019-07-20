class Student
{
	int roll;
	String name;
	Student(int i,String n)
	{
		roll=i;
		name=n;
	}
	Student(Student x)
	{
		roll=x.roll;
		name=x.name;
	}
	void display()
	{
		System.out.println(roll+" "+name);
	}
	public static void main(String a[])
	{
		Student s1=new Student(1,"sumit");
		Student s2=new Student(s1);
		s1.display();
		s2.display();
	}
}