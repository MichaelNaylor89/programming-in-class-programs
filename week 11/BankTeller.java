
public class BankTeller {

	public static void main(String[] args) {
		
		int sterling = 138;
		int fifties, twenties, tens, fives, twos, ones;
		
		fifties = sterling / 50;
		int remainder = sterling % 50;
		
		twenties = remainder / 20;
		remainder = remainder % 20;
		
		tens = remainder / 10;
		remainder = remainder % 10;
		
		fives = remainder / 5;
		remainder = remainder % 5;
		
		twos = remainder / 2;
		remainder = remainder % 2;
		
		ones = remainder;
		
		System.out.println("Sterlinng to change = " + sterling);
		System.out.println(fifties + " X £50");
		System.out.println(twenties + " X £20");
		System.out.println(tens + " X £10");
		System.out.println(fives + " X £5");
		System.out.println(twos + " X £2");
		System.out.println(ones + " X £1");

	}

}
