package eul;

public class euler_math {

	public static void main(String[] args) {
		System.out.println("Below is the sum of all values between 0 and 1000 that are multiples of 3 or 5.");
		int x = 0;
		int value = 0;
		
		while(x < 1000)
		{
			value += isdivisible(x);
			x++;
		}
		System.out.println(value);
	}

	
	public static int isdivisible(int x){
		if (x%3 == 0 || x%5 == 0)
		{
			return x; // Return the value that is divisible by 3 or 5.
		}
		else
		{
		return 0; // the value is not a multiple of 3 or 5 so send back zero.
		}
	}
}
