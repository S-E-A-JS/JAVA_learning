public class HW12 {
    public static void main(String[] args) {
        printTriangle();
    }

    public static void printTriangle() {
        String forAsterikses = "";
        char asterisk = '*';
        char space = ' ';
        for (int i = 0; i < 10; i++) {
            String forSpaces = "";
            for (int j = 0 + i; j < 10; j++) {
                forSpaces += space ;
            }
            forAsterikses += asterisk;

            System.out.println(forSpaces + forAsterikses);
        }
    }
}
