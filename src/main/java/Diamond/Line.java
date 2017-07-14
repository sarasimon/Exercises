package Diamond;

public abstract class Line {

    String buildLine(int size, String character) {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += character;
        }
        return output;
    }

    public abstract String sideLine(int lines, int i);
}
