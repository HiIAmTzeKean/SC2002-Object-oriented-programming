package sc2002_lecture.exceptions;

public class FinallyDemo {
    /**
     * Sample method value can be change to the following values to test how the
     * Exception class will handle the exceptions [99,0,-99]
     * If an exception is not caught in a method, program will first check if there exist
     * a "finally" block and run the code within that block
     * it will exit the method and perform the same steps till a "catch" for the type of exception
     * raised is found
     * 
     * Note: if some subclass of exception is expected but not found, and Exception super class is
     * declared, the program will default to the default Exception class. This is similar to method
     * resolving
     */
    public static void main(String[] args) {
        /**
         * Note: if a method declares throws Exception, then to use the method, compiler will enforce the
         * need to "catch" the exception
         */
        try {
            sampleMethod(-99);
        }
        catch (Exception e) {
            System.out.println("Caught in main.");
        }
        // finally {}
    }
    /**
     * Note: if some subclass of exception is expected but not found, and Exception super class is
     * declared, the program will default to the default Exception class. This is similar to method
     * resolving
     */
    public static void sampleMethod(int n) throws Exception {
        try {
            if (n > 0)
                throw new Exception();
            else if (n < 0)
                throw new NegativeNumberException();
            else
                System.out.println("No Exception.");
            System.out.println("Still in sampleMethod.");
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught in sampleMethod.");
        }
        // catch (Exception e) {
        //     System.out.println("Caught in exception of sampleMethod.");
        // }
        finally {
            System.out.println("In finally block.");
        }
        System.out.println("After finally block.");
    }
}