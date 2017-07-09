public class Triangle {

    private String output;

    public void printOneAsterisk() {
        output = "*";
        System.out.println(output);
    }

    public void printHoritzontalLine(int size) {
        for (int i = 0; i < size; i++) {
            output = output + "*";
        }
        System.out.println(output);
    }
}
