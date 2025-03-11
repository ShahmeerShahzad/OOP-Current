public class Date {
	private int day;
	private int month;
	private int year;
	
	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	Date(Date other) {
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}

	public void showDate() {
		System.out.printf("Day: %s, Month: %s, Year: %s \n", day, month, year);
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}