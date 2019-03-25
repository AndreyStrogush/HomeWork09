import com.homework.model.MyLinkedList;
import com.homework.model.MyList;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyLinkedListTest {
    private final int TEST_CAPACITY = 5;
    MyList<Integer> myLinkedList;


    @Before
    public void initialList() {
        myLinkedList = new MyLinkedList<>();
        for (int i = 0; i < TEST_CAPACITY; i++) {
            myLinkedList.add(i);
        }
    }

    @Test
    public void testAdd() {
        Integer expected = 5;
        myLinkedList.add(5);
        Integer actual = myLinkedList.get(5);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        Integer expectedValue = 2;
        assertEquals(expectedValue, myLinkedList.get(2));
        myLinkedList.remove(2);
        expectedValue = 3;
        assertEquals(expectedValue, myLinkedList.get(2));
    }

    @Test
    public void testClear() {
        myLinkedList.clear();
        int expectedSize = 0;
        assertEquals(expectedSize, myLinkedList.size());
    }

    @Test
    public void testSize() {
        assertEquals(TEST_CAPACITY, myLinkedList.size());
    }

    @Test
    public void testGet() {
        Integer expected = 0;
        Integer actual = myLinkedList.get(0);
        assertEquals(expected, actual);
    }

}
