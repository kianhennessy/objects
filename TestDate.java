public class TestDate{
	public static void main(String[] args){

		Date date1 = new Date(29, 3, 2020);
		Date date2 = new Date(7, 6, 2020);
		Date date3 = new Date(29, 3, 2020);

		System.out.println("Date1: " + date1.toString());
		System.out.println("Date2: " + date2.toString());
		System.out.println("Date3: " + date3.toString());

		System.out.println("Date1 day is " + date1.getDay());
		System.out.println("Date2 month is " + date2.getMonth());
		System.out.println("Date3 year is " + date1.getYear());

		System.out.println("Is Date1 a valid date? " + date1.isValid());

		if(date1.equals(date2))
			System.out.println("Date1 and Date2 are equal.");
		else
			System.out.println("Date1 and Date2 are not equal.");

		if(date1.equals(date3))
			System.out.println("Date1 and Date3 are equal.");
		else
			System.out.println("Date1 and Date3 are not equal.");
		}
	}



