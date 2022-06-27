package basics;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String student = "sravan,mba";
		if(student.endsWith("msc")) 
			if(student.contains("sravs"))
				System.out.println("student name is sravs");
			else if (student.contains("shannu"))
				System.out.println("student name is shannu");
			else {
				System.out.println(student);
				
			}
		}
	}

