package unite3twostar;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        if(a+b>c && a+c>b && b+c>a)
        	System.out.println(a+b+c);
        else
        	System.out.println("输入不合法");
	}

}
