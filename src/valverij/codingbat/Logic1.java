package valverij.codingbat;

/**
 * Solutions for problems from <a href='http://codingbat.com/java/Logic-1'>CodingBat Logic-1</a>
 */
public class Logic1 {
	
	/**
	 * When squirrels get together for a party, they like to have cigars. 
	 * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
	 * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
	 * Return true if the party with the given values is successful, or false otherwise. 
	 */
	public boolean cigarParty(int cigars, boolean isWeekend) {
		return cigars >= 40 && (cigars <= 60 || isWeekend);
	}
	
	/**
	 * You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, 
	 * in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded 
	 * as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). 
	 * With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
	 */
	public int dateFashion (int you, int date) {
		if (you <= 2 || date <= 2) {
			return 0;
		}
		else if (you >= 8 || date >= 8) {
			return 2;
		}			
		return 1;
	}
	
	/**
	 * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is 
	 * between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature 
	 * and a boolean isSummer, return true if the squirrels play and false otherwise. 
	 */
	public boolean squirrelPlay(int temp, boolean isSummer) {
		int upperLimit = isSummer ? 100 : 90;
		return temp >= 60 && temp <= upperLimit;
	}
	
	/**
	 * You are driving a little too fast, and a police officer stops you. Write code to compute the result, 
	 * encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. 
	 * If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. 
	 * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. 
	 */
	public int caughtSpeeding(int speed, boolean isBirthday) {
		int birthdayBuffer = isBirthday ? 5 : 0;
		if(speed <= 60 + birthdayBuffer) {
			return 0;
		}
		else if (speed > 60 + birthdayBuffer && speed <= 80 + birthdayBuffer) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
}
