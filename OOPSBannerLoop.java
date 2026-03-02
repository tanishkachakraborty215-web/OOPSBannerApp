public class OOPSBannerLoop {
    public static void main(String[] args) {

        String[][] letters = {
            {" *** ", " *** ", " **** ", " **** "},
            {"*   *", "*   *", "*   *", "*     "},
            {"*   *", "*   *", "****  ", " ***  "},
            {"*   *", "*   *", "*     ", "    * "},
            {" *** ", " *** ", "*     ", "****  "}
        };

        for (String[] row : letters) {
            System.out.println(String.join("  ", row));
        }
    }
}