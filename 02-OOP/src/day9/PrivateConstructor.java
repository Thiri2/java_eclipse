package day9;

public class PrivateConstructor {
	
	public static void main(String[] args) {
		DatabaseConfig obj1 = DatabaseConfig.getInstance();
		System.out.println("db name Object 1 : " + obj1.db_name);
		DatabaseConfig obj2 = DatabaseConfig.getInstance();
		System.out.println("db name Object 2 : " + obj2.db_name);
		
		obj2.db_name = "banking_db";
		System.out.println("DB of obj1 : " + obj1.db_name);
		System.out.println("DB of obj2 : " + obj2.db_name);
	}	
}

class DatabaseConfig {
	//static field to store only one obj
	String db_name = "employee_db";
	private static DatabaseConfig config; //already null
	//private constructor
	private DatabaseConfig() {
		
	}
	//static method to return obj
	static DatabaseConfig getInstance() {
		if(config == null) 
			config = new DatabaseConfig();
		return config;	
	}
}
	
//	public static void main(String[] args) {
//		Animal obj = new Animal(); 
//		//complie-time-error
//	}

//class Animal {
//	private Animal() { 
//		
//	}
//}
//class Dog extends Animal {
//	//error, cant inherit too
//	//so we use singleton class
//}
