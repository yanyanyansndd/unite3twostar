package unite3twostar;

import java.util.Scanner;

public class TwoRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();
        
        System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();
        
        if((x2+width2/2)==(x1+width1/2) && (x2-width2/2)==(x1-width1/2)
        		&& (y2+height2/2)==(y1+height1/2) && (y2-height2/2)==(y1-height1/2))
        	System.out.println("r2 competely overlaps r1");
        else if((x2+width2/2)<=(x1+width1/2) && (x2-width2/2)>=(x1-width1/2)
        		&& (y2+height2/2)<=(y1+height1/2) && (y2-height2/2)>=(y1-height1/2))
        	System.out.println("r2 is inside r1");
        else if((x2+width2/2)>=(x1+width1/2) && (x2-width2/2)<=(x1-width1/2)
        		&& (y2+height2/2)>=(y1+height1/2) && (y2-height2/2)<=(y1-height1/2))
        	System.out.println("r1 is inside r2");
        else if((x2+width2/2)<(x1-width1/2) || (x2-width2/2)>(x1+width1/2))
        	System.out.println("r2 does not overlap r1");
        else if((y2-height2/2)>(y1+height1/2) || (y2+height2/2)<(y1-height1/2))
        	System.out.println("r2 does not overlap r1");
        else
        	System.out.println("r2 overlaps r1");
	}

}
