import java.util.Collection;
import java.util.HashSet;

public class StaticBinding {

    // Here we only have overloading of the sort method
    // Note: There is no overriding, so during run time there will only be static
    // binidng
    //
    // It will be different if we have other subclass called SubclassBinding
    // and we overload the same sort method, then we will see that the sort method will
    // be binded to the subclass instead of the base class
    public Collection sort(Collection c){
        System.out.println(("inside collection method"));
        return c;
    }
    public Collection sort(HashSet c){
        System.out.println(("inside hashset method"));
        return c;
    }
}
