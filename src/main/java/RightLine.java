public class RightLine extends Line {
    public String sideLine(int lines, int i) {
        return buildLine(i, "*") + buildLine(lines - i, " ") + "\n";
    }
}
