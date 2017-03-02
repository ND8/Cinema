package movie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum implements SecondInterface {

		//create a scanner for user to inout data
		//get user name 
		//get age
		//select appropriate movie
		//day of the week 
		//select how many seats
		//chose ticket type
		//print everything on screen
		// ticketPrice    Standard - £8   OOP - £6    Students - £6     Child - £4
		//run as java application :)
		
		
	String name;
	int age;
	int day;
	int number;
	
		
		public void getName(){
		
			System.out.println("WELCOME TO THE CINEMA. \n please ENTER your full NAME ");
			name = scan.nextLine();
			System.out.println("Hello" + " " + name);
			getAge();
		}
		
		public void getAge(){
			
			System.out.println("please enter your AGE ");
			age = scan.nextInt();
			System.out.println("you entered your AGE as " + age);
			if (age>=12) 
				System.out.println("you are eligable to watch all viewings ");
			else if (age<=11) {
				System.out.println("your age only permits you to watch the justice league movie "); 
			}
			getMovie();
			
		}
		
		
		public void getMovie(){
			System.out.println("please select a MOVIE ");
			
			if (age>=12) {
				for(int i=0;i<movielist.length;i++)
					System.out.println(movielist[i]); 
				}
			else if (age<=11) {
				for(int i=0;i<movielist.length;i++)
					System.out.println(movielist[3]);
				
			}
			
			number = scan.nextInt();
			System.out.println("you selected the movie " + movielist[number - 1].substring(3, movielist[number-1].length()));
			getMovieDate();
			
		}
		
		
	   public void getMovieDate(){
	   	
	   			System.out.println("please select which day you would like to watch "  + movielist[number - 1].substring(3, movielist[number-1].length()));
	   	
	   				for(int i=0;i<date.length;i++){
	   						System.out.println(date[i]);
	   	}
	   				day = scan.nextInt();
	   				
	   	
	   				if(day==3) {
	   					for(int i=0;i<date.length;i++);
	   					System.out.println("your movie is available for viewing on orange " + date[2].substring(3, date[2].length()));
	   	}
	   				
	   				else if (day != 3) {
	   					//for(int i=0;i<date.length;i++)
	   						System.out.println("your movie is available for viewing on this day");
	   		
	   		 
	   	}
	   
	   	getSeats();
	   	
	  
	   }
	   	
		public void getSeats(){
			System.out.println("please chose how many SEATS you would like for the movie");
			String seats = scan.next();
			System.out.println("Thank you " + name + "\n you have selected " + seats + " seat(s) for the movie " + movielist[number - 1].substring(3, movielist[number-1].length()));
			
			
		}
	
	
	
    public static void main(String[] args) {
        
    	Sum s = new Sum();
    	s.getName();
    	//s.getAge();
    	//s.getMovie
    	//s.getMovieDate();
    	//s.getSeats();
    	
    	
    	Scanner scanner = new Scanner(System.in);
        
    	try {
            double sum = 0.0d;

            int input = -1;

            while (input != 0) {
                System.out.println("Please make your choice then followed by the quantity of the specific ticket: ");
                	for (Product product : Product.values()) {
                		System.out.println(product);
                }
                System.out.println("0 - Exit, finished purchasing tickets ");

                input = readNumberInput(scanner);

                if (input == 0) {
                    break;
                }

                if (input != -1) {
                    Product product = Product.getByNumber(input);

                    if (product == null) {
                        System.out.println("The entered product number was not correct. Please try again.");
                    } else {
                        System.out.println("Enter quantity of ticket [" + product.productTitle + "]:");

                        input = readNumberInput(scanner);

                        if (input > 0) {
                            sum += product.price * input;
                        }
                    }
                }
            }

            System.out.println("Total sum of all the chosen tickets(s) is: " + String.format("£%.2f", sum));
        } finally {
        	System.out.println("thank you & ENJOY the movie at our Cinema");
            scanner.close();
        }
    }

    /**
     * Reads a number from a scanner instance and catches input.
     */
    private static int readNumberInput(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            String inputString = scanner.next();
            System.out.println("Input [" + inputString + "] was not correct. Please choose a number.");
            return -1;
        }
    }
}
	

