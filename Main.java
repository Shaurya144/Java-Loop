public class Main {

    public static void main(String[] args) {
        // While loops will run until condition is false
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // The Do / while loops loop once then only run if the condition is true
        // Do / while lopps will iterate at lease once every time

        do {
            String.out.println("potato");
        } while (i < 5);

        // For Loops

        /*
         * Statement 1 is executed (one time) before the execution of the code block.
         * 
         * Statement 2 defines the condition for executing the code block.
         * 
         * Statement 3 is executed (every time) after the code block has been executed.
         */

        for (int x = 0; x < 5; x++) {
            System.out.prxntln(x);
        }

        // Nested Loops
        // Outer loop
        for (int v = 1; v <= 2; v++) {
            System.out.println("Outer: " + v); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        // There is also a "for-each" loop, which is used exclusively to loop through
        // elements in an array

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String m : cars) { // loops through elements in array
            System.out.println(m);
        }
    }
}