package geometric;

import java.util.Scanner;

public class MainUI {
    final String helpMsg = "Enter 'h' or 'help' for the full list of commands.";
    final String IntroMsg = "Geometry Console Interface (GCI) 2023";
    final String quitMsg = "Bye";
    final String showListEmptyMsg = "The list of geometric shapes is empty!";
    final String formatExcDoubleIntErr = "E: All parameters must be of type int or double!";
    final String getNotRecognizedErr = "E: The entered command is not recognized by the console. Use the 'h' or 'help' command for the full list of commands.";

    public void PrintInitMessage() {
        System.out.println(helpMsg);
        System.out.println(IntroMsg);
    }
    public void PrintExitMessage() {
        System.out.println(quitMsg);
    }
    public String getShowListEmptyMsg() {
        return (showListEmptyMsg);
    }
    public String getFormatExcDoubleIntErr() {
        return (formatExcDoubleIntErr+'\n');
    }
    public String getNotRecognizedErr() {
        return (getNotRecognizedErr+'\n');
    }

    public String fetchUserInput(Scanner scanner, String prepend) {
        System.out.print(prepend);
		String userInput = scanner.nextLine();
		return userInput;
    }
}
