
import java.text.NumberFormat;
import java.util.Random;
public class NumberUtility
{

public static String Percent(double majority) {	
	NumberFormat percent = NumberFormat.getPercentInstance();
	String majorityString = percent.format(majority); //returns 50%
	return majorityString;
}

public static String Currency (double price){
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	String priceString = currency.format(price); //returns $11.58
	return priceString;
}

public static String Decimal (double number, int afterDecimal ){
	NumberFormat numberFormat = NumberFormat.getNumberInstance();
	numberFormat.setMaximumFractionDigits(afterDecimal);
	String milesString = numberFormat.format(number);
	return milesString;
}

public static String Decimal (double miles){
	NumberFormat number = NumberFormat.getNumberInstance();
	number.setMaximumFractionDigits(2);
	String milesString = number.format(miles);
	return milesString;
}

public static double Maximum(double a, double b){	
	return Math.max(a, b);
}

public static double Minimum(double a, double b){	
	return Math.min(a, b);
}

public static double RandomNum (double a, double b){
	Random rn = new Random();
	double n = b - a + 1;
	double i = rn.nextDouble() % n;
	double randomNum =  a + i;
	return randomNum;
}


}