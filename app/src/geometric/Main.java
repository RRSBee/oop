package geometric;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GeometryList geomList = new GeometryList();
		CommandHandler handler = new CommandHandler();
		MainUI ui = new MainUI();
		ui.PrintInitMessage();

		while (true) {
			String command = ui.fetchUserInput(scanner, "> ");
			String response = handler.HandleCommand(command, ui, geomList);
			if (response == "quit") {
				ui.PrintExitMessage();
				System.exit(0);
			} else {
				System.out.println(response);
			}
		}
    }
}
