import java.util.Scanner;
public class Project4 {
	

	public static void main(String[] args) {
		
		//Variables outside of Scanner
		String y = "Yes";
		int yesCounter = 0;
		int noCounter = 0;
		
		//Creates Scanner
		Scanner Keyboard = new Scanner(System.in);
		
		//Program Begins
		System.out.println("Answer yes or no to the following questions");
		
		System.out.println("My dedication to work, exercise, diet and friendship is waning");
		String Question1 = Keyboard.nextLine();
		
		//Adds +1 to yes counter or +1 to no counter if different
		if(Question1.equalsIgnoreCase(y)) {
			yesCounter = yesCounter + 1;
		}
		else {
				noCounter = noCounter + 1;
			}
		
		System.out.println("I know what will make me feel better, but I just can’t push myself to do it and I’ll"
				+ " “Yes, but” any suggestions that people make.");
		String Question2 = Keyboard.nextLine();
		
		if(Question2.equalsIgnoreCase(y)) {
			yesCounter = yesCounter + 1;
		}
		else {
				noCounter = noCounter + 1;
			}
		
		System.out.println("I try to get away from people as soon as I can");
		String Question3 = Keyboard.nextLine();
		
		if(Question3.equalsIgnoreCase(y)) {
			yesCounter = yesCounter + 1;
		}
		else {
				noCounter = noCounter + 1;
			}
		if(yesCounter == 0) {
			System.out.println("More exhausted than stressed out");
		}
		else if(yesCounter == 1) {
			System.out.println("Beggining to stress out");
		}
		else if(yesCounter == 2) {
			System.out.println("Possibly stressed out");
		}
		else if(yesCounter == 3) {
			System.out.println("Probably stressed out");
		}	
			
		/*0 to 3: More exhausted than stressed out
		4 to 6: Beginning to stress out
		7 to 9: Possibly stressed out
		10 to 12: Probably stressed out*/
		
	}
}