// Write programs for implementation of try, catch and finally block.

public class Q16 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e); 
        } finally {
            System.out.println("This is the finally block. It always runs.");
        }

        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This is the finally block in second example.");
        }

        try {
            int number = 5;
            System.out.println("Number: " + number); 
        } catch (Exception e) {
            System.out.println("This will not be executed as there is no exception.");
        } finally {
            System.out.println("This is the finally block in third example.");
        }
    }
};