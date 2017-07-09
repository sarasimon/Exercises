public class Triangle {

    private String _output;

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
        System.out.println(output.trim());
    }

    private String buildLine(int size, String character) {
        _output = "";
        for (int i = 0; i < size; i++) {
            _output = _output + character;
        }
        return _output;
    }
}
