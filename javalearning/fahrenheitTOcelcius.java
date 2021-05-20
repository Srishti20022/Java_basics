package javalearning;
//Fahrenheit to Celcius conversion table where Fahrenheit is a multiple of 20
public class fahrenheitTOcelcius {

	public static void main(String[] args) {
		int c, f;
		System.out.println("Fahrenheit          Celcius");
		for (int i = 0; i < 16; i++) {
			f = (int) (20.0 * i);
			c = (int) ((5.0 / 9.0) * (f - 32));
			System.out.println(f + "                    " + c);

		}

	}

}
