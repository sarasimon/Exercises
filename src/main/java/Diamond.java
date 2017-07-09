import java.util.Scanner;

public class Diamond {

    private String output;

    public String rightTriangle(int lines) {
        output = "";
        for (int i = 1; i < lines; i++) {
            output += buildLine(i, "*") + "\n";
        }
        output += buildLine(lines, "*");
        return output;
    }

    public String leftTriangle(int lines) {
        output = "";
        for (int i = 1; i < lines; i++) {
            output += buildLine(lines - i, " ") + buildLine(i, "*") + "\n";
        }
        output += buildLine(lines, "*");
        return output;
    }

    public String isoscelesTriangle(int lines) {
        Scanner leftScanner = new Scanner(leftTriangle(lines));
        Scanner rightScanner = new Scanner(rightTriangle(lines - 1));

        output = leftScanner.nextLine();
        while (leftScanner.hasNextLine()) {
            output += "\n" + leftScanner.nextLine() + rightScanner.nextLine();
        }
        return output;
    }

    public String diamondTriangle(int lines) {
        return new StringBuilder(isoscelesTriangle(lines)).reverse().reverse().toString();
    }

    private String buildLine(int size, String character) {
        String _output = "";
        for (int i = 0; i < size; i++) {
            _output += character;
        }
        return _output;
    }
}
