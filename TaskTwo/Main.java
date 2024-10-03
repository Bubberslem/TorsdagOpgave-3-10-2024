import java.util.Scanner;

public class Main { //2.a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //2.c
		
		System.out.println("Please type your name"); //2.b
        String name = scanner.nextLine();  //2.d
		
		System.out.println("Hello " + name); //2.e
		System.out.println("Please type your age"); 
		
		int age = Integer.parseInt(scanner.nextLine()); //2.f
		System.out.println("You are "+ age + " years old"); //2.g
		
		int yearsToRetire = 67 - age; //2.h
		System.out.println("You have " + yearsToRetire + " years until retirement."); //2.i

		scanner.close();
	}
}