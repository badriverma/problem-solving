package singleton;

public class SingletonImpl {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1);
		System.out.println(singleton2);
	}
}
