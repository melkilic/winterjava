package assignment05;

public class LonelyMonkey {
	/* There is a lonely monkey in the island
     * He needs to eat 4 bananas every day
     * There are just 165 bananas in that island
     * Create following variables and find how many day monkey can survive.
     * Use do while loop, increment and decrement and if statements
	int numbersOfBananas = 165, 
	survivalDays = 1;
	boolean monkeyAlive = true;
     */
	 public static void main(String[] args) {
		int numberOfBananas = 165;
		int survivalDays = 0;
		boolean monkeyAlive = true;
		
		do {
			numberOfBananas -= 4;
			survivalDays++;
		} while (numberOfBananas > 1); 
			System.out.println("The survival days of the monkey is " + survivalDays);
		
	}
}