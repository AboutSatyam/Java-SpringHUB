package newTopic;

public class Method {

	public static void main(String[] args) {
		System.out.println(" In Main Mehod ");
		greeding();
		greedUser();
		greedUserNow();
		System.out.println("After All Method Call\n");

		System.out.println("***************************************");
		greeding();
		greedUser();
		greedUserNow(); // we can call the method many time

	}

	public static void greeding() {
		System.out.println(" Good Morning");
		// return 0; // if void then retun do not require

	}

	public static void greedUser() {
		System.out.println(" Good Evening");
	}

	public static void greedUserNow() {
		System.out.println(" Good Night ");
	}
}
