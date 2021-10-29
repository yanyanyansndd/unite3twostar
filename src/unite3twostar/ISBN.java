package unite3twostar;

import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        //输入前9位ISBN
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int i = input.nextInt();
        int d1 = (i / 100000000) * 1;
        int d2 = ((i / 10000000) % 10) * 2;
        int d3 = ((i / 1000000) % 10) * 3;
        int d4 = ((i / 100000) % 10) * 4;
        int d5 = ((i / 10000) % 10) * 5;
        int d6 = ((i / 1000) % 10) * 6;
        int d7 = ((i / 100) % 10) * 7;
        int d8 = ((i / 10) % 10) * 8;
        int d9 = (i % 10) * 9;
        //计算第10位
        int d10 = (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9) % 11;
        //判断第10位
        if(d10 == 10)
        	System.out.print("The ISBN-10 number is "+ d1 + i + "X");
        else
        	System.out.print("The ISBN-10 number is "+ d1 + i + d10);
	}

}
