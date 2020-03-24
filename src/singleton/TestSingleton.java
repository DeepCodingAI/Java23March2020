package singleton;

public class TestSingleton {

	public static void main(String[] args) { 
		DatabaseInstance instance = DatabaseInstance.getInstance1();
        instance.connectToDatabase();
        DatabaseInstance instance2 = DatabaseInstance.getInstance2();
        instance2.connectToDatabase();
	}

}
