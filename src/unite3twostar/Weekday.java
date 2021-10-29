package unite3twostar;

import java.util.Scanner;
public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g.,2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();
        
        switch (month) {
            case 1:
            	month = 13;
                year--;
                break;
            case 2:
        	    month = 14;
                year--;
                break;
        }
        int j = year / 100;
        int k = year % 100;
        int h = (day + 26*(month +1)/10 + k + k/4 + j/4 + 5*j)%7;
        String dayOfWeek = null;
        switch(h) {
            case 0:
        	    dayOfWeek = "Saturday";
        	    break;
            case 1:
            	dayOfWeek = "Sunday";
            	break;
            case 2:
            	dayOfWeek = "Monday";
            	break;
            case 3:
            	dayOfWeek = "Tuesday";
            	break;
            case 4:
            	dayOfWeek = "Wednesday";
            	break;
            case 5:
            	dayOfWeek = "Thursday";
            	break;
            case 6:
            	dayOfWeek = "Friday";
            	break;
        
        }
        System.out.println("Day of the week is "+dayOfWeek);
    }

}
