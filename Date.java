public class Date{

	//State - Attributes
	private int day;
	private int month;
	private int year;

	//Constructor
	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public boolean equals(Date d){
		if(day == d.getDay() && month == d.getMonth() && year == d.getYear())
			return true;
		else
			return false;
	}

	public boolean isValid(){
		boolean valid = true;

		if(year < 2020 || year > 2021)
			valid = false;

		if(day < 1)
			valid = false;

		if(month == 9 || month == 4 || month == 6 || month == 11){
			if(day > 30)
				valid = false;
		}

		else if(month == 1 || month == 3 || month == 5 || month == 7
		|| month == 8 || month == 10 || month == 12){
			if(day > 31)
				valid = false;
		}

		else if(month == 2){
			if(year % 4 == 0){
				if(day > 29)
					valid = false;
			}
			if(day > 28)
				valid = false;
		}

		else
			valid = false;


		return valid;
	}

	public String toString(){
		String strDate = day + "/" + month + "/" + year;
		return strDate;
	}
}



