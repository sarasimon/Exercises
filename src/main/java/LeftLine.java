public class LeftLine extends Line {
    public String sideLine(int lines, int i) {
        return buildLine(lines - i, " ") + buildLine(i, "*") + "\n";
    }
}
