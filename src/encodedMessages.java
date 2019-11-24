import java.util.Scanner;
public class encodedMessages {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String message = "";
		int checkSum = 0;
		
		System.out.println("Please enter your message to be coded. No spaces! ");
		String input = scnr.next();
		input = input.toUpperCase();
		
		char[] ch = input.toCharArray();
		
		for (int i = 0; i < ch.length - 1; i++) {
			ch[i] = ch[(int)i];
			checkSum = checkSum + ch[i];
			message = (message + (int)ch[i] + "-");
		}
		
		message = (message + (int)ch[ch.length - 1]);
		checkSum = (checkSum + ((int)ch[ch.length- 1]));
	    
		System.out.println("Your encoded message is: " + message);
		System.out.println("Your message sum is: " + checkSum);
	}
}
