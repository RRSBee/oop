package geometric;

public class CommandHandler {

    String showCommand(String command, GeometryList GeomList) {
        if (GeomList.getSize() > 0) {
            return "---- Geometric shapes ----";
        }
        return "The list of geometric shapes is empty!\n";
    }

    String circleCommand(String command, MainUI ui, GeometryList GeomList) {
        double x, y, r;
        String[] tokenArray = command.split(" ");
        if (tokenArray.length == 4) {
            try {
                x = Double.parseDouble(tokenArray[1]);
                y = Double.parseDouble(tokenArray[2]);
                r = Double.parseDouble(tokenArray[3]);
            } catch (NumberFormatException nfe) {
                return (ui.getFormatExcDoubleIntErr());
            }
            CircleShape shape = new CircleShape(x, y, r);
            GeomList.addShape(shape);
            return Integer.toString(tokenArray.length); // WORK IN PROGRESS...
        }
        return "E: " + Integer.toString(tokenArray.length-1) + " parameters were given, 3 were expected.\n";
    }

    public String HandleCommand(String command, MainUI ui, GeometryList GeomList) {
        if (command.equals("quit")) { return "quit"; }
        else if (command.equals("show")) { return showCommand(command, GeomList); }
        else if (command.startsWith("circle")) { return circleCommand(command, ui, GeomList); }
        else { return ui.getNotRecognizedErr; }

    }
}
