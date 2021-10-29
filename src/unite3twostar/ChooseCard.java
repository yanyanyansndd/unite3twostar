package unite3twostar;

public class ChooseCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        int n1 = (int)(Math.random()*13);
        String b[] = {"Clubs","Diamonds","Hearts","Spades"};
        int n2 = (int)(Math.random()*4);
        System.out.println("The card you picked is " + a[n1] + " of " + b[n2]);
	}

}
