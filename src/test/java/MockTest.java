import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class MockTest {

    CollectionFilter filter = new CollectionFilter();
    Condition<Integer> greaterThanTwo = num -> num > 2;
    Condition<String> lengthGreaterThanThree = word -> word.length() > 3;

    @Test
    public void shouldFilterCollectionByCondition() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collection<Integer> actual = this.filter.filter(list, greaterThanTwo);
        List<Integer> expected  = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        assertArrayEquals(actual.toArray(), expected.toArray());
    }

    @Test
    public void shouldFilterStringCollectionByCondition() {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("hjdrf");
        Collection<String> actual = this.filter.filter(list, lengthGreaterThanThree);
        List<String> expected  = new ArrayList<>();
        expected.add("hjdrf");
        assertArrayEquals(actual.toArray(), expected.toArray());
    }

    public void shouldReturnEmptyCollection(){

    }

    public void shouldReturnUnfilteredCollectionWhenNoConditionMet(){

    }





}
