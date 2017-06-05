import java.util.Calendar;
public class DateUtility {
	private static int year =	Calendar.getInstance().get(Calendar.YEAR);
	private static int month = Calendar.getInstance().get(Calendar.MONTH);
	private static int date = Calendar.getInstance().get(Calendar.DATE);
	
	public static String displayCalendar(int month, int year){
		
		
		String month1=Integer.toString(month);
		String year1=Integer.toString(year);
		return "the month is "+ month1 + " and the year is "+ year1;
		
	}
	
	public static int getLastDayOfMonth (int month, int year){
		int days = 30;
		switch(month){
			
			case 1 :case 3 : case 5: case 7: case 8: case 10: case 12:
				days= 31;
				return days;
				
			case 2:
				if (isLeapYear(year)==true){
					days=29;
					return days;
					
				}else{
					days=29;
					return days;
					
				}
			default:
				return days;
				
		}
	} 
	
	public static String toString(int month, int day, int year, String delimiter){
		String month2=Integer.toString(month);
		String day2=Integer.toString(day);
		String year2=Integer.toString(year);
		return month2+delimiter+day2+delimiter+year2;
	} //prints the date as mm/dd/yyyy
	
	
	public static boolean isLeapYear(int year)
	{
			//returns t/f if the year is a leap year
			// leap years are all years divisible by 4 but not 100
			// years that are divisible by 400 are leap years, too
			// is it divisible by 4?
			// Note that the year is not passed as an argument. It could be but 
			// I choose to use the class level private variable for my method.
			boolean bLeapYear = false;
			bLeapYear = (year % 4 == 0);
			// is it divisible by 4 and not 100
			bLeapYear = bLeapYear && (year % 100 != 0);
			// is it divisible by 4 and not 100 unless it's divisible by 400
			bLeapYear = bLeapYear || (year % 400 == 0);
			return bLeapYear;
	}
	
	public static int age (int birth_month, int birth_date, int birth_year){
		int age=0;	
		if (birth_month <= month) 
		{
			if (birth_month==month&& birth_date<=date){
				age=(year-birth_year);
				return age; 
			}else{
				age=(year-1-birth_year);
				return age;
			}
		} else {
			age=(year-1-birth_year);
			return age;
		}
		
		
		}
	
}
