import java.util.Collection;
import java.util.HashSet;

public class SubclassBinding extends StaticBinding {

    public Collection sort(Collection c){
        System.out.println(("inside subclass collection method"));
        return c;
    }
    public Collection sort(HashSet c){
        System.out.println(("inside subclass hashset method"));
        return c;
    }
}
