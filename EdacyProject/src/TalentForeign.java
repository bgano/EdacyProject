/**
 * 
 * @author GANO
 *
 */
public class TalentForeign extends Talent {
	//property of foreign Talent
	private String origin_country;
	//Constructor of foreign Talent
	public TalentForeign(String name, String first_name, int age, String level, String special_course,String origin_country) {
		super(name, first_name, age, level, special_course);
		this.origin_country = origin_country;
	}	
	public String getOriginCountry()
	{
		return this.origin_country;
	}
	//this method print the identity of a foreign talent
	public void print()
	{
		super.print();
		System.out.println("Origin country: " + getOriginCountry());
	}
}
