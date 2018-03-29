import java.util.HashMap;
import java.util.Scanner;

public class User {
	public User() {
		Factory factory = makeChoice();
		factory.createRoom().display();
	}

	public Factory makeChoice() {
		System.out.println("Enter Your Choice:");
		System.out.println("Glass");
		System.out.println("Wood");
		System.out.println("Steel");

		HashMap<String, Factory> choice = new HashMap<String, Factory>();
		choice.put("glass", new GlassFactory());
		choice.put("steel", new SteelFactory());
		choice.put("wood", new WoodenFactory());
		
		return choice.get(new Scanner(System.in).nextLine().toLowerCase());

	}
}
