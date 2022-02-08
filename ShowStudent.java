import java.io.*; //imports the I/O package

//Author Jeff Miller
//Date 10/24/2021
//BINS Assignment 7 Q1
//
//This class shows the results of the default constructor and also the values set in this class
public class ShowStudent 
{

	public static void main(String[] args) 
	{
		
		int studentID = 1122; //variable objects
		int creditHours = 3;
		double pointsEarned = 10;
		double gradePA;
		
		Student myStudent = new Student(); //instantiates a new class called myStudent using the Student class
		
		myStudent.computeGPA(); //computes GPA
		System.out.println("Student ID: " + myStudent.getStudentID()); //prints the default constructor data to the console
		System.out.println("Credit Hours: " + myStudent.getCreditHours());
		System.out.println("Points Earned: " + myStudent.getPointsEarned());
		System.out.println("GPA: " + myStudent.getGradePA());
		
		myStudent.setStudentID(1122); //sets new data
		myStudent.setCreditHours(3);
		myStudent.setPointsEarned(10);
		//myStudent.setGradePA(); //not needed, compute GPA sets the value
		
		myStudent.computeGPA(); //computes GPA with new data
		String studentInfo = "***********************************************" + "\n\n" //creates a convenient string for easy data dump to file
							+ "Student ID: " + myStudent.getStudentID() + "\n"
							+ "Credit Hours: " + myStudent.getCreditHours() + "\n"
							+ "Points Earned: " + myStudent.getPointsEarned() + "\n"
							+ "GPA: " + myStudent.getGradePA() + "\n";
		
		System.out.println(studentInfo); //prints info to the console
		
		String filename = "studentInfo.txt"; //file name
		try //writes to a file
		{
			FileWriter fw = new FileWriter(filename, true);
			fw.write(studentInfo);
			fw.close();
		}
		catch(Exception io)
		{
		}
			
		

	}

}
