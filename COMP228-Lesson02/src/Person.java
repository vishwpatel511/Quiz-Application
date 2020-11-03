/**
 * 
 */

/**
 * @author vishw
 *
 */
import java.util.Scanner;
import java.util.Random;

public class Person {
	public int responce; 
	public int counter;
	public void simulateQuestion() {
		
		System.out.println("Where is Taaj Mahal?");
		System.out.println("1. Mumbai");
		System.out.println("2. Delhi");
		System.out.println("3. Ahmedabad");
		System.out.println("4. Chennai");
		System.out.println("Your response: ");
		Scanner userinput = new Scanner(System.in);
		responce = userinput.nextInt();
		checkAnswer(2);
		System.out.println("What is the name of Canada's PM?");
		System.out.println("1. Mike Anthony");
		System.out.println("2. Andrew Scheer");
		System.out.println("3. Justin Trudeau");
		System.out.println("4. Erin O'Toole");
		System.out.println("Your response: ");
		responce = userinput.nextInt();
		checkAnswer(3);
		System.out.println("What is the capital of Canada?");
		System.out.println("1. Ottawa");
		System.out.println("2. Toronto");
		System.out.println("3. Calgary");
		System.out.println("4. Moncton");
		System.out.println("Your response: ");
		responce = userinput.nextInt();
		checkAnswer(1);
		System.out.println("What is the smallest province of Canada?");
		System.out.println("1. New Brunswick");
		System.out.println("2. Ontario");
		System.out.println("3. Quebec");
		System.out.println("4. PEI");
		System.out.println("Your response: ");
		responce = userinput.nextInt();
		checkAnswer(4);
		System.out.println("Which is the widely spoken language?");
		System.out.println("1. French");
		System.out.println("2. Mexican");
		System.out.println("3. English");
		System.out.println("4. Spanish");
		System.out.println("Your response: ");
		responce = userinput.nextInt();
		checkAnswer(3);
		System.out.println("---------------------------------------------");
		System.out.println("Correct Answers: " + counter);
		System.out.println("Wrong Answers: " + (5 - counter));
		System.out.println("Percentage: " + (counter*100/5));
	}
	
	public void checkAnswer(int correctanswer) {
		if(responce == correctanswer) {
			counter = counter+1;
			
			CongMessage();
			
		}
		else {
			WrongMessage();
		}
	}
	
	public void CongMessage() {
		int Randomindex = 0;
		String[] arrayMessage = new String[] {"Excellent!", "Good Job!", "Nice Work!", "Great"};
		Random randGen = new Random();
		Randomindex = randGen.nextInt(4);
		System.out.println(arrayMessage[Randomindex]);
	}
	
	public void WrongMessage() {
		int Randomindex = 0;
		String[] arrayMessage = new String[] {"Sorry! Wrong Answer", "Oh no!", "Try again", "Not Correct!"};
		Random randGen = new Random();
		Randomindex = randGen.nextInt(4);
		System.out.println(arrayMessage[Randomindex]);
	}
	
	
}
