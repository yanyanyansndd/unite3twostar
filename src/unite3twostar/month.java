package unite3twostar;

public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//生成随机数
        int month = (int)(Math.random()*12 + 1);
        
        //根据随机数输出月份
		switch(month) 
        {
            case 1:
        	    System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
            	System.out.println("March");
                break;
            case 4:
            	System.out.println("April");
                break;
            case 5:
            	System.out.println("May");
                break;
            case 6:
            	System.out.println("June");
                break;
            case 7:
            	System.out.println("July");
                break;
            case 8:
            	System.out.println("August");
                break;
            case 9:
            	System.out.println("Suptember");
                break;
            case 10:
            	System.out.println("October");
                break;
            case 11:
            	System.out.println("Noverber");
                break;
            case 12:
            	System.out.println("December");
                break;
            default:
            	System.out.println("Error");
        }
	}

}
