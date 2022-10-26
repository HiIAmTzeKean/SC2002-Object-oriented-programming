package pyp.syntax;

public abstract class AnAbstract {
    private void doA() {
        /**
         * This line that the question provided is not valid because
         * print must take in a boolean argument.
         * This is also true for printf, but println is an exception
         */
        // System.out.print();
        System.out.print(true);
    }

    /**
     * Question was testing if abstract can be applied on private
     * methods. abstract can only be used on public, protected methods
     * which are not statically binded.
     * 
     * Note that private, static and final are statically binded
     * Method overloading is also static binding.
     * 
     * Other methods that are not these 3, and method overriding
     * are dynamically binded methods
     */
    // private abstract void doB(int x);
    protected abstract void doB();
    public abstract void doC();
}
