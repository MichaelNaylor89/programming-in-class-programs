
public class SmallChange {

	public static void main(String[] args) {
		
		double sterlingWithPence = 129.89;
		
		int sterling = (int)sterlingWithPence;
		int fifties, twenties, tens, fives, twos, ones;
		
		int p50, p20, p10, p5, p2, pennies;
		
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
		
		System.out.println("Sterling to change = " + sterlingWithPence);
		System.out.println(fifties + " X £50");
		System.out.println(twenties + " X £20");
		System.out.println(tens + " X £10");
		System.out.println(fives + " X £5");
		System.out.println(twos + " X £2");
		System.out.println(ones + " X £1");
		
		int pence = (int)Math.round((sterlingWithPence - sterling) * 100);
		
		p50 = pence / 50;
		remainder = pence % 50;
		
		p20 = remainder / 20;
		remainder = remainder % 20;
		
		p10 = remainder / 10;
		remainder = remainder % 10;
		
		p5 = remainder / 5;
		remainder = remainder % 5;
		
		p2 = remainder / 2;
		remainder = remainder % 2;
		
		pennies = remainder;
		
		System.out.println(p50 + " X 50p");
		System.out.println(p20 + " X 20p");
		System.out.println(p10 + " X 10p");
		System.out.println(p5 + " X 5p");
		System.out.println(p2 + " X 2p");
		System.out.println(pennies + " X 1p");
	}

}
