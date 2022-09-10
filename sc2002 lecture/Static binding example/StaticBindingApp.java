import java.util.Collection;
import java.util.HashSet;

public class StaticBindingApp {
    public static void main (String arg []) {
        // you can change the referene type to have a look at the different output
        // of the program
        // Since in static binding, the referene type is used instead of the object type
        // sort will take in the reference type
        Collection c = new HashSet<Integer>();
        
        // Java uses dyanmic binding by default
        // You can change the object class here to have a look at the changes
        // Since dynamic binding selects the method based on the actual object created
        // the sort method is binded to the object type that we use here
        StaticBinding et = new SubclassBinding();
        et.sort(c);
    }
}
