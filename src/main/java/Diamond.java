import java.util.Scanner;

public class Diamond {

    public String rightTriangle(int lines) {
        String output = "";
        for (int i = 1; i < lines; i++) {
            output += buildLine(i, "*") + "\n";
        }
        output += buildLine(lines, "*");
        return output;
    }

    public String leftTriangle(int lines){
        String output = "";
        for (int i = 1; i < lines; i++) {
            output += buildLine(lines - i, " ") + buildLine(i, "*")+ "\n";
        }
        output += buildLine(lines, "*");
        return output;
    }

    public String isoscelesTriangle(int lines){
        String left = leftTriangle(lines);
        String right = rightTriangle(lines - 1);
        Scanner leftScanner = new Scanner(left);
        Scanner rightScanner = new Scanner(right);

        String result = leftScanner.nextLine();
        while (leftScanner.hasNextLine()){
            result += "\n" + leftScanner.nextLine() + rightScanner.nextLine();
        }
        return result;
    }

    private String buildLine(int size, String character) {
        String _output = "";
        for (int i = 0; i < size; i++) {
            _output += character;
        }
        return _output;
    }
}
