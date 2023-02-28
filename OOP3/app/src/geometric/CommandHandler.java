package geometric;

public class CommandHandler {

    String showCommand(String command, GeometryList GeomList) {
        String resultString = "";
        int listSize = GeomList.getSize();
        if (listSize > 0) {
            resultString += "---- Geometric shapes ----\n";
            for (int i = 0; i < listSize; i++) {
                resultString += Integer.toString(i) + ": " + GeomList.getAllGeometricShapes()[i].getShapeInfo() + "\n";
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
            return ui.getCreatedCircleShapeMsg();
        }
        return "[!] " + Integer.toString(tokenArray.length-1) + " parameters were given, 3 were expected.\n";
    }

    String rectangleCommand(String command, MainUI ui, GeometryList GeomList) {
        double x, y, w, h;
        String[] tokenArray = command.split(" ");
        if (tokenArray.length == 5) {
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
            return ui.getCreatedRectangleShapeMsg();
        }
        return "[!] " + Integer.toString(tokenArray.length-1) + " parameters were given, 4 were expected.\n";
    }

    String moveCommand(String command, MainUI ui, GeometryList geomList) {
        int i;
        double dx, dy;
        String[] tokenArray = command.split(" ");
        if (tokenArray.length == 4) {
            try {
                i = Integer.parseInt(tokenArray[1]);
                dx = Double.parseDouble(tokenArray[2]);
                dy = Double.parseDouble(tokenArray[3]);
            } catch (NumberFormatException nfe) {
                return (ui.getFormatExcDoubleIntErr());
            }
            geomList.getGeometricShapeByIndex(i).moveShape(dx, dy);
            return "Shape (index: " + i + ") has been moved. dx=" + dx + " dy=" + dy;
        }
        return "[!] " + Integer.toString(tokenArray.length-1) + " parameters were given, 4 were expected.\n";
    }

    String removeCommand(String command, MainUI ui, GeometryList geomList) {
        int i;
        String[] tokenArray = command.split(" ");
        if (tokenArray.length == 2) {
            try {
                i = Integer.parseInt(tokenArray[1]);
            } catch (NumberFormatException nfe) {
                return (ui.getFormatExcDoubleIntErr());
            }
            geomList.removeShape(i);
            return "Successfully removed shape (index: " + i + ")\n";
        }
        return ui.failedToRemoveShape;
    }

    String sortCommand(String command, MainUI ui, GeometryList geomList) {
        String[] tokenArray = command.split(" ");
        char flag = '0';
        if (tokenArray.length <= 2) {
            if (tokenArray.length == 1 || tokenArray[1].equals("x")) { flag = 'x'; }
            else if (tokenArray.length == 2 && tokenArray[1].equals("y")) { flag = 'y'; }
            geomList.sort(flag);
        }
        return "";
    }

    public String HandleCommand(String command, MainUI ui, GeometryList geomList) {
        if (command.equals("quit")) { return "quit"; }
        else if (command.equals("show")) { return showCommand(command, geomList); }
        else if (command.startsWith("circle")) { return circleCommand(command, ui, geomList); }
        else if (command.startsWith("rectangle")) {return rectangleCommand(command, ui, geomList);} 
        else if (command.startsWith("move")) { return moveCommand(command, ui, geomList); }
        else if (command.startsWith("remove")) { return removeCommand(command, ui, geomList); }
        else if (command.startsWith("sort")) { return sortCommand(command, ui, geomList); }
        else { return ui.getNotRecognizedErr; }
    }
}
