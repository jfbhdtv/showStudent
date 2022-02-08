//Author Jeff Miller
//Date 10/24/2021
//BINS Assignment 7 Q1
//
//This class sets up a credit, point, and GPA calculator
public class Student
{
	private int studentID;//variable objects
	private int creditHours;
	private double pointsEarned;
	private double gradePA;
	

	
	//constructor
	Student()
	{
		studentID = 9999;
		creditHours = 3;
		pointsEarned = 12;
	}
	
	//setters (set methods)
	public void setStudentID(int ID)
	{
		studentID = ID;
	}
	public void setCreditHours(int Hours)
	{
		creditHours = Hours;
	}
	public void setPointsEarned(double Points)
	{
		pointsEarned = Points;
	}
		public void computeGPA() //computes GPA
	{
		gradePA = pointsEarned/creditHours;
	}
	public void setGradePA(double GPA)
	{
		gradePA = GPA;
	}
	
	
	//getters (get methods)
	public int getStudentID()
	{
		return studentID;
	}
	public int getCreditHours()
	{
		return creditHours;
	}
	public double getPointsEarned()
	{
		return pointsEarned;
	}
	public double getGradePA()
	{
		return gradePA;
	}
		
}

