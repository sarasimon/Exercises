import java.util.Scanner;

public class Diamond {

    private String output;

    public String rightTriangle(int lines) {
        output = "";
        for (int i = 1; i < lines; i++) {
            output += rightLine(lines,i);
        }
        output += buildLine(lines, "*");
        return output;
    }

    private String rightLine(int lines, int i){
        return buildLine(i, "*") + buildLine(lines - i, " ") + "\n";
    }

    public String leftTriangle(int lines) {
        output = "";
        for (int i = 1; i < lines; i++) {
            output += leftLine(lines, i);
        }
        output += buildLine(lines, "*");
        return output;
    }

    private String leftLine(int lines, int i){
        return buildLine(lines - i, " ") + buildLine(i, "*") + "\n";
    }

    public String isoscelesTriangle(int lines) {
        Scanner leftScanner = new Scanner(leftTriangle(lines));
        Scanner rightScanner = new Scanner(rightTriangle(lines));

        output = leftScanner.nextLine() + rightScanner.nextLine().substring(1);
        while (leftScanner.hasNextLine()) {
            output += "\n" + leftScanner.nextLine() + rightScanner.nextLine().substring(1);
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
