/**
 * Pokemon1.java
 * Created on: Oct 2, 2023
 * Last Modified on: Oct 2, 2023
 * Purpose: Proving understanding of Inheritance, objects, and how to print out different kinds of information in an efficient way
 * Description: Creating a Pokemon subclass that has the general information of a Pokemon, creating different kinds of pokemon species with subclasses, and handling all the different kinds of info with an ArrayList
 * Created by: Emmanuel Adeniyi
 */
import java.util.ArrayList;
import java.util.Arrays;
public class Pokemon1 {

	//making our data members private 
	private String name;
	private String type;
	private int dexNumber;
	private String region;
	public static void main(String[] args) {
		//creating an ArrayList for all our different kinds of pokemon, so we can put all our information together easily
		ArrayList<Pokemon1> pokemon = new ArrayList<>(Arrays.asList(new Rowlet(), new Typhlosion(), new Arcanine(), new Aegislash(), new Archeops()));

		//using a for loop to print all of the Arrays.asList values
		for(int i = 0; i < pokemon.size(); i++) {
			System.out.print(pokemon.get(i).toString());
		}
	}

	//default constructor, calls Pikachu the mascot by default
	public Pokemon1() {
		this("Pikachu","Electric",025,"Kanto");
	}

	//convenience constructor with all the parameters
	public Pokemon1(String name,String type, int dexNumber,String region) {
		setName(name);
		setType(type);
		setDexNumber(dexNumber);
		setRegion(region);
	}

	//accessors and mutators
	public void setName(String name) {

		//the character limit for a pokemon is 12 characters so that is the max that can be inputed
		if(name.length() <= 12) {
			this.name = name;
		}else {
			System.out.println("Pokemon name is 12 characters max");
		}

	}

	public void setType(String type) {
		this.type = type;
	}

	//as of the time of writing this code there are 1017 pokemon so a pokemon's dex number cannot exceed 1017
	public void setDexNumber(int dexNumber) {
		if(dexNumber >= 1 && dexNumber <= 1017) {
			this.dexNumber = dexNumber;
		}else {
			System.out.println("Pokemon does not exist");
		}
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getDexNumber() {
		return dexNumber;
	}

	public String getRegion() {
		return region;
	}

	//our toString method that we are overriding and will call with the super method
	@Override 
	public String toString() {
		return String.format("This pokemon is %s, it is from the %s region, it's type is %s, and it's national dex number is %d%n",name,region,type,dexNumber);
	}

}

//creating subclasses of pokemon (my personal favorites) using the super class
class Rowlet extends Pokemon1 {

	public Rowlet() {
		super("Rowlet","Grass/Flying",722,"Alola");
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
class Typhlosion extends Pokemon1{
	public Typhlosion() {
		super("Typhlosion","Fire",157,"Johto");
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
class Aegislash extends Pokemon1{
	public Aegislash() {
		super("Aegislash","Steel/Ghost",681,"Kalos");
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
class Arcanine extends Pokemon1{
	public Arcanine() {
		super("Arcanine","Fire",59,"Kanto");
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
class Archeops extends Pokemon1{
	public Archeops() {
		super("Archeops","Rock/Flying",567,"Unova");
	}
	@Override
	public String toString() {
		return super.toString();
	}
}