package enumexample;

public class TestWeek {

	public static void main(String[] args) {
		Week day1 = new Week(Day.Friday);
		day1.whatToDo();
		
		Week day2 = new Week();
		day2.whatToDo(Day.Saturday);
	}
}
