import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionFilter {

    public <T> Collection<T> filter(Collection<T> collection, Condition<T> condition) {
        // return collection.stream().filter(item -> condition.test(item)).collect(Collectors.toList());
        List<T> filteredList = new ArrayList<>();
        Iterator<T> iterator = collection.iterator();
        while(iterator.hasNext()){
            T element = iterator.next();
            if(condition.test(element)){
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}
