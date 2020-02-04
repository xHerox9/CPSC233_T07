
public class Expressions2 {
	public static boolean isLower(char aChar) {
		return 'a'<=aChar && aChar<='z';
	}
	public static double computePolynomial(double x) {
		double result= (2*x*x*x) + (3*(7-x)*(7-x)) -100;
		return result;
	}
	public static double division(int num1, int num2) {
		double x = num1;
		double y= num2;
		return x/y;
		}
	public static String convertToString(int fiveDigitNum) {
		int number =fiveDigitNum;
		String added= "";
		added = number % 10 + added;
		number = number / 10;
		added = number % 10 + added;
		number = number / 10;
		added = number % 10 + added;
		number = number / 10;
		added = number % 10 + added;
		number = number / 10;
		added = number % 10 + added;
		return added;
	}
}
