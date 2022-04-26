public class LabeledContinue {
    public static void main(String[] args) {

        // outer loop is labeled as first
        first: for (int i = 1; i < 6; ++i) {
            // inner loop
            for (int j = 1; j < 5; ++j) {
                if (i == 3 || j == 2)

                    // skips the current iteration of outer loop
                    continue first;
                System.out.println("i = " + i + "; j = " + j);
            }
        }
    }
}
