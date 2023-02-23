package geometric;

import java.util.Scanner;

public class MainUI {
    public void InitMessage() {
        System.out.println("Enter 'h' or 'help' for the full list of commands.");
        System.out.println("Geometry Console Interface (GCI) 2023");
    }

    public void ExitMessage() {
        System.out.println("Bye!");
    }

    public String fetchUserInput(Scanner scanner, String prepend) {
        System.out.print("> ");
		String userInput = scanner.nextLine();
		return userInput;
    }
}
