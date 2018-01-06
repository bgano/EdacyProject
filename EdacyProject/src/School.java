/**
 * 
 * @author GANO
 *
 */
public class School {
	//property of School Class
	private Talent[] arrayTalent;
	public static int effective;
	//Constructor
	public School(Talent[] arrayTab)
	{
		this.arrayTalent = arrayTab;
		effective = 0;
	}
	//this method  add talent in a school
	public void addTalent(Talent arg_talent)
	{
		if(effective < arrayTalent.length )
		{
			this.arrayTalent[effective] = arg_talent;
			effective++;
		}
	}
	// print Talent in the School
	public void print()
	{
		System.out.println("*** This School have "+effective+" Talents ***");
		for(int i=0; i<effective;i++)
		{
			System.out.println("*** Talent N^"+(i+1));
			arrayTalent[i].print();
		}
	}
}
