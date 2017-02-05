
import java.util.ArrayList;

public class Unit {
	
	int ID;
	String name;
	String lecturer;
	
	//Arraylist max 59% assignment
	ArrayList<Student> listOfStudent = new ArrayList<Student>();
	
	Unit (int ID, String name, String lecturer)
	{
		this.ID = ID;
		this.name = name;
		this.lecturer = lecturer;
	}
	
	Unit (int ID, String name)
	{
		this.ID = ID;
		this.name = name;
		this.lecturer = "none assigned";
	}
	
	void addStudent (Student std)
	{
		
		listOfStudent.add(std);
		
	}
	
	void printInformation()
	{
		System.out.println("Unit name: " + name);
		System.out.println("Unit ID: " + ID);
		System.out.println("Unit lecturer: " + lecturer);
		System.out.println("Number of Students: " + listOfStudent.size());
		for (Student eachStudent : listOfStudent)
		{
			eachStudent.printInformation();
		}
		System.out.println("Overall average mark: " + calculateAverage());
	}
	
	
	float calculateAverage()
	{
		float totalMark1 = 0.0f;
		float totalMark2 = 0.0f;
		
		for (Student eachStudent : listOfStudent)
		{
			totalMark1 += eachStudent.mark1;
			totalMark2 += eachStudent.mark2;
		}
		
		float averageMark1 = totalMark1 / listOfStudent.size();
		float averageMark2 = totalMark2 / listOfStudent.size();
			
		float overallMark = (averageMark1 + averageMark2) / 2;
		
		return overallMark;
	}
	
}
