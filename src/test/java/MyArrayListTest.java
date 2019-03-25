import com.homework.model.MyArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    private final int DEFAULT_CAPACITY = 10;
    private final int TEST_CAPACITY = 5;
    private MyArrayList<Integer> myArrayList;
    private Object[] elementData;

    @Before
    public void initialArray() {
        myArrayList = new MyArrayList<>();
        elementData = new Object[DEFAULT_CAPACITY];
        for (int i = 0; i < TEST_CAPACITY; i++) {
            elementData[i] = i;
        }

        for (int i = 0; i < TEST_CAPACITY; i++) {
            myArrayList.add(i);
        }
    }

    @Test
    public void testAdd() {
        elementData[5] = 5;
        myArrayList.add(5);
        assertEquals(elementData[5], myArrayList.get(5));
    }

    @Test
    public void testRemove() {
        Object expected = elementData[3];
        myArrayList.remove(2);
        Object actual = myArrayList.get(2);
        assertEquals(expected, actual);
    }

    @Test
    public void testClear() {
        Integer expected = 0;
        myArrayList.clear();
        Integer actual = myArrayList.size();
        assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        assertEquals(TEST_CAPACITY, myArrayList.size());
    }

    @Test
    public void testGet() {
        Integer expectedValue = 5;
        assertEquals(expectedValue, myArrayList.get(5));
    }

}
