import java.util.ArrayList;
import java.util.Scanner;

public class TailNumber{
	public static void main(String [] args){
		//Base values
		String tailNumber = "";
		String NATO = "1. NATO Alphabet";
		String ICAO = "2. ICAO Alphabet";
		String Able = "3. Revised Able Baker Alphabet";
		
		//Creates the Scanner object to take input data
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Please enter the tail number of your aircraft: ");
		tailNumber = in.nextLine();
				
		System.out.printf("You have put %s as your Tail Number.\n", tailNumber);
		
		//Converts to lowercase for Switches later
		tailNumber = tailNumber.toLowerCase(); 
		
		while(true){
			System.out.printf("Please Select one of the following Alphabets to convert to:\n%s\n%s\n%s\nResponse: ", NATO, ICAO, Able);
			int response = in.nextInt();
			
			if(response == 1 || response == 2 || response == 3){
				break;
			}
			else{
				System.out.println("Invalid response, please enter one of the number selections printed.");
			}
		}		
		
/** Convert the tailNumber to a Char array **/
		
		//Creates a char array that is variable for the tail number entered
		ArrayList<Character> charTailNumber = new ArrayList<Character>();
		
		for(int i = 0; i < tailNumber.length(); i++){
			charTailNumber.add(tailNumber.charAt(i));
		}
		
		
/** Prints the Char array for debugging **/
	/*
		for(int i = 0; i < charTailNumber.size(); i++){
			if(i == charTailNumber.size() - 1){
				System.out.printf("'%c'",charTailNumber.get(i));
			}
			else{
				System.out.printf("'%c',",charTailNumber.get(i));
			}
		}
		System.out.println(); //Used for creating a space
	*/

/** test for printing **/
		if(response == 1){
			
			//Reads the array charTailNumber and sends the data to NATO Class to print
			for(int i = 0; i < charTailNumber.size(); i++){
				
				if(i != charTailNumber.size() - 1){
					NATO(charTailNumber.get(i));
					System.out.printf(",");
				}
				else{
					NATO(charTailNumber.get(i));
				}
			}
			
			System.out.println(); //Used for creating a space
		}
	}
	
/** NATO Alphabet **/
	
	public static void NATO(char c){
		switch(c){
			case 'a':
				System.out.printf("Alpha");
				break;
			case 'b':
				System.out.printf("Bravo");
				break;
			case 'c':
				System.out.printf("Charlie");
				break;
			case 'd':
				System.out.printf("Delta");
				break;
			case 'e':
				System.out.printf("Echo");
				break;
			case 'f':
				System.out.printf("Foxtrot");
				break;
			case 'g':
				System.out.printf("Golf");
				break;
			case 'h':
				System.out.printf("Hotel");
				break;
			case 'i':
				System.out.printf("India");
				break;
			case 'j':
				System.out.printf("Juliet");
				break;
			case 'k':
				System.out.printf("Kilo");
				break;
			case 'l':
				System.out.printf("Lima");
				break;
			case 'm':
				System.out.printf("Mike");
				break;
			case 'n':
				System.out.printf("November");
				break;
			case 'o':
				System.out.printf("Oscar");
				break;
			case 'p':
				System.out.printf("Papa");
				break;
			case 'q':
				System.out.printf("Quebec");
				break;
			case 'r':
				System.out.printf("Rome");
				break;
			case 's':
				System.out.printf("Sierra");
				break;
			case 't':
				System.out.printf("Tango");
				break;
			case 'u':
				System.out.printf("Uniform");
				break;
			case 'v':
				System.out.printf("Victor");
				break;
			case 'w':
				System.out.printf("Whiskey");
				break;
			case 'x':
				System.out.printf("Xray");
				break;
			case 'y':
				System.out.printf("Yankee");
				break;
			case 'z':
				System.out.printf("Zulu");
				break;
			case '1':
				System.out.printf("WUN");
				break;
			case '2':
				System.out.printf("TOO");
				break;
			case '3':
				System.out.printf("TREE");
				break;
			case '4':
				System.out.printf("FOWER");
				break;
			case '5':
				System.out.printf("FIFE");
				break;
			case '6':
				System.out.printf("SIX");
				break;
			case '7':
				System.out.printf("SEVEN");
				break;
			case '8':
				System.out.printf("AIT");
				break;
			case '9':
				System.out.printf("NINER");
				break;
			case '0':
				System.out.printf("ZERO");
				break;
			default:
				System.out.printf("Error");
				break;
		}
	}
	
	/*public static String ICAO(char c){
		
	}
	
	public static String Able(char c){
		switch()
	}
	*/
}