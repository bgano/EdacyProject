/**
 * 
 * @author GANO
 *
 */
public class MainClass {

	public static void main(String args []) {
		//create an instance of Talent
		Talent talent1 = new Talent("Gano","Boubs",24,"Cohorte3","Java");
		//print the identity of atalent
		System.out.println("*** Identy of Talent ***");
		talent1.print();
		// create an instance of foreign Talent
		TalentForeign talent2 = new TalentForeign("Kande","Moussa",20,"Cohorte3","HTML","Mali");
		// print the identity of a foreign talent
		System.out.println("*** Identy of Foreign Talent ***");
		talent2.print();
		// create other instance of Talent
		Talent talent3 = new Talent("Diallo","Demba",18,"Cohorte3","Java-HTML");
		// array of talent
		Talent tab[] = new Talent[5];
		//create an instance of School
		School edacy = new School(tab);
		// add Talent in School edacy
		edacy.addTalent(talent1);
		edacy.addTalent(talent2);
		edacy.addTalent(talent3);
		//print all Talent in School
		edacy.print();
	}

}
