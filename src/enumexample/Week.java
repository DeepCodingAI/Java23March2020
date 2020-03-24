package enumexample;

public class Week {

	Day day;
	public Week() {}
	
	public Week(Day day) {
		this.day = day;
	}
	public void whatToDo() {
		switch(day)
		{
		case Monday:
			System.out.println("Home Work is Due");
			break;
		case Tuesday:
			System.out.println("Codelab is Due");
			break;
		case Wednesday:
			System.out.println("Reading data structure book is Due");
			break;
		case Thursday:
			System.out.println("Prepare for Quiz");
			break;
		case Friday:
			System.out.println("Practice git/github");
			break;
		case Saturday:
			System.out.println("Practice git and work on Algorithm");
			break;
		case Sunday:
			System.out.println("Home Work is Due");
			break;
		default:
			System.out.println("Out of Days. No more days left");
			break;	
			 
		}
	}
	public void whatToDo(Day day) {
		switch(day)
		{
		case Monday:
			System.out.println("Home Work is Due");
			break;
		case Tuesday:
			System.out.println("Codelab is Due");
			break;
		case Wednesday:
			System.out.println("Reading data structure book is Due");
			break;
		case Thursday:
			System.out.println("Prepare for Quiz");
			break;
		case Friday:
			System.out.println("Practice git/github");
			break;
		case Saturday:
			System.out.println("Practice git and work on Algorithm");
			break;
		case Sunday:
			System.out.println("Home Work is Due");
			break;
		default:
			System.out.println("Out of Days. No more days left");
			break;	
			 
		}
	}
}
