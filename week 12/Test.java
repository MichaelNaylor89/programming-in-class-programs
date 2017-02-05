
public class Test {

	public static void main(String[] args) {
		
		Student st1 = new Student ("Rachel", 2345, 24, 87.39f, 34.98f);
		Student st2 = new Student ("Tracy", 3456, 32, 23.49f, 45.34f);
		Student st3 = new Student ("ling", 3453, 23.4f, 39.34f);
		
		st1.printInformation();
		st2.printInformation();
		st3.printInformation();
		
		Unit programmingUnit = new Unit (3445, "Programming", "McLean");
		programmingUnit.addStudent(st1);
		programmingUnit.addStudent(st2);
		programmingUnit.addStudent(st3);
		
		programmingUnit.printInformation();
		
		Unit CSF = new Unit (9844, "CSF");
		CSF.addStudent(st1);
		CSF.addStudent(st2);
		
		CSF.printInformation();
	}

}
