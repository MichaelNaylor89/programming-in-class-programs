
public class Student {
	
	String name = "no-name";//default value
	int ID;
	int age = 18;//default value
	float mark1;
	float mark2;
	
	Student (String name, int ID, int age, float mark1, float mark2)
	{
		this.name = name;
		this.ID = ID ;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	Student (int ID, int age, float mark1, float mark2)
	{
		this.ID = ID ;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	Student (String name, int ID, float mark1, float mark2)
	{
		this.name = name;
		this.ID = ID ;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	Student (int ID, float mark1, float mark2)
	{
		this.ID = ID ;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	
	void printInformation ()
	{
	
		System.out.println(	"Student Name: " + name + 
							"\n Student ID: " + ID + 
							"\n Student Age: " + age +
							"\n Mark 1: " + mark1 + 
							"\n Mark 2: " + mark2 + "\n"			);//end of println
	
	}
}
