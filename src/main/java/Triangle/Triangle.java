package Triangle;

public class Triangle {

    public void printOneAsterisk() {
        print("*");
    }

    public void printHorizontalLine(int size) {
        print(buildLine(size, "*"));
    }

    public void printVerticalLine(int size) {
        print(buildLine(size, "*\n"));
    }

    public void printRightTriangle(int lines) {
        for (int i = 1; i <= lines; i++) {
            printHorizontalLine(i);
        }
    }

    private void print(String output) {
        System.out.println(output);
    }

    private String buildLine(int size, String character) {
        String _output = "";
        for (int i = 0; i < size; i++) {
            _output = _output + character;
        }
        return _output;
    }
}
