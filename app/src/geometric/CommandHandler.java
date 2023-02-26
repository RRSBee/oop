package geometric;

public class CommandHandler {

    String showCommand(String command, GeometryList GeomList) {
        String resultString = "";
        int listSize = GeomList.getSize();
        if (listSize > 0) {
            resultString += "---- Geometric shapes ----\n";
            for (int i = 0; i < listSize; i++) {
                resultString += Integer.toString(i) + ": " + GeomList.getGeometricShapes()[0].getShapeInfo() + "\n";
            }
            return (resultString+"\n");
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
            return ui.getCreatedCircleShapeMsg(); // WORK IN PROGRESS...
        }
        return "E: " + Integer.toString(tokenArray.length-1) + " parameters were given, 3 were expected.\n";
    }

    String rectangleCommand(String command, MainUI ui, GeometryList GeomList) {
        double x, y, w, h;
        String[] tokenArray = command.split(" ");
        if (tokenArray.length == 5){
            try {
                x = Double.parseDouble(tokenArray[1]);
                y = Double.parseDouble(tokenArray[2]);
                w = Double.parseDouble(tokenArray[3]);
                h = Double.parseDouble(tokenArray[4]);
            } catch (NumberFormatException nfe) {
                return (ui.getFormatExcDoubleIntErr());
            }
            RectangleShape shape = new RectangleShape(x, y, w, h);
            GeomList.addShape(shape);
            return Integer.toString(tokenArray.length);
        }
        return "E: " + Integer.toString(tokenArray.length-1) + " parameters were given, 4 were expected.\n";
    }

    public String HandleCommand(String command, MainUI ui, GeometryList GeomList) {
        if (command.equals("quit")) { return "quit"; }
        else if (command.equals("show")) { return showCommand(command, GeomList); }
        else if (command.startsWith("circle")) { return circleCommand(command, ui, GeomList); }
        else if (command.startsWith("rectangle")) {return rectangleCommand(command, ui, GeomList);} 
        else if (command.equals("move")) { return null;} //MOVE AN OBJECT
        else if (command.equals("remove")) { return null;} //DELETES AN OBJECT
        else if (command.equals("sort")) { return null;} //SORTS OBJECTS IN ARRAY
        else { return ui.getNotRecognizedErr; }

    }
}
