package singleton;

public class DatabaseInstance {

	private static DatabaseInstance databseInstance1 = null;
	private static DatabaseInstance databseInstance2 = null;
	
	private DatabaseInstance() {}
	
	public static DatabaseInstance getInstance1() {
		databseInstance1 = new DatabaseInstance();
		return databseInstance1;
	}
	public static DatabaseInstance getInstance2() {
		databseInstance2 = new DatabaseInstance();
		return databseInstance2;
	}
	public void connectToDatabase() {
		System.out.println("Database is connected");
	}
		
}
