package unite3twostar;

import java.util.Scanner;

public class PointInTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double s = Math.abs(x)*100/2 + Math.abs(y)*200/2 + Math.abs((x+2*y-200)/Math.sqrt(5))*Math.sqrt(100*100+200*200)/2;
        if(s == 100*200/2)
        	System.out.println("The point is in the triangle");
        else
        	System.out.println("The point is not in the triangle");
	}

}
