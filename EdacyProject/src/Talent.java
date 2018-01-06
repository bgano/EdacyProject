/**
 * 
 * @author GANO
 *
 */
public class Talent {
	//property of Talent
	private String name;
	private String first_name;
	private int age;
	private String level;
	private String special_course;
	//Constructor of Talent
	public Talent(String name,String first_name,int age,String level,String special_course)
	{
		this.name = name;
		this.first_name = first_name;
		this.age = age;
		this.level = level;
		this.special_course = special_course;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getFirstName()
	{
		return this.first_name;
	}
	
	public int 	getAge()
	{
		return this.age;
	}
	
	public String getLevel()
	{
		return this.level;
	}
	
	public String getSpecializationCourse()
	{
		return this.special_course;
	}
	
	//this method print the identity of a talent
	public void print()
	{
		System.out.println("Name: " + getName());
		System.out.println("First Name: " + getFirstName());
		System.out.println("Age: " + getAge());
		System.out.println("Level: " + getLevel());
		System.out.println("Specialization course: " + getSpecializationCourse());
	}
}