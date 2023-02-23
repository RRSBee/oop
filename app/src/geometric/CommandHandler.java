package geometric;

public class CommandHandler {

    String showCommand(String command, GeometryList GeomList) {
        if (GeomList.getSize() > 0) {
            return "---- Geometric shapes ----";
        }
        return "The list of geometric shapes is empty!\n";
    }

    String circleCommand(String command, GeometryList GeomList) {
        String[] tokenArray = command.split(" ");
        if (tokenArray.length == 4) {
            try {
                double x = Double.parseDouble(tokenArray[1]);
                double y = Double.parseDouble(tokenArray[2]);
                double r = Double.parseDouble(tokenArray[3]);
            } catch (NumberFormatException nfe) {
                return "E: All parameters must be of type int or double!\n";
            }
            return Integer.toString(tokenArray.length);
        }
        return "E: " + Integer.toString(tokenArray.length-1) + " parameters were given, 3 were expected.\n";
    }

    public String HandleCommand(String command, GeometryList GeomList) {
        if (command.equals("quit")) { return "quit"; }
        else if (command.equals("show")) { return showCommand(command, GeomList); }
        else if (command.startsWith("circle")) { return circleCommand(command, GeomList); }
        else { return "E: The entered command is not recognized by the console. Use the 'h' or 'help' command for the full list of commands!\n"; }

    }
}
