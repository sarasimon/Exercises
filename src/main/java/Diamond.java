import java.util.Scanner;

public class Diamond {

    public String rightTriangle(int lines) {
        return sideTriangle(lines, new RightLine());
    }

    public String leftTriangle(int lines) {
        return sideTriangle(lines, new LeftLine());
    }

    private String sideTriangle(int lines, Line line) {
        String output = "";
        for (int i = 1; i < lines; i++) {
            output += line.sideLine(lines, i);
        }
        output += line.buildLine(lines, "*");
        return output;
    }

    public String isoscelesTriangle(int lines) {
        Scanner leftScanner = new Scanner(leftTriangle(lines));
        Scanner rightScanner = new Scanner(rightTriangle(lines));

        String output = leftScanner.nextLine() + rightScanner.nextLine().substring(1);
        while (leftScanner.hasNextLine()) {
            output += "\n" + leftScanner.nextLine() + rightScanner.nextLine().substring(1);
        }
        return output;
    }

    public String diamondTriangle(int lines) {
        String topIsosceles = isoscelesTriangle(lines);
        String bottomIsosceles = new StringBuilder(isoscelesTriangle(lines)).reverse().toString();

        return topIsosceles.substring(0, topIsosceles.lastIndexOf("\n")) + "\n" + bottomIsosceles;
    }
}
