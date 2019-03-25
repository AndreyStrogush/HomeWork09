import com.homework.model.MyStack;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyStackTest {
    private final int TEST_CAPACITY = 5;
    MyStack<Integer> myStack;

    @Before
    public void initialStack() {
        myStack = new MyStack<>();
        for (int i = 0; i < TEST_CAPACITY; i++) {
            myStack.push(i);
        }
    }

    @Test
    public void testPush() {
        myStack.push(5);
        Integer expectedValue = 5;
        assertEquals(expectedValue, myStack.peek());
    }

    @Test
    public void testRemove() {
        Integer expected = 4;
        myStack.remove(TEST_CAPACITY);
        Integer actual = myStack.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void testClear() {
        Integer expected = 0;
        myStack.clear();
        Integer actual = myStack.size();
        assertEquals(expected, actual);
    }

    @Test
    public void testSize() {
        Integer expected = 4;
        Integer actual = myStack.size();
        assertEquals(expected, actual);
    }

    @Test
    public void testPeek() {
        Integer expected = 4;
        Integer actual = myStack.peek();
        assertEquals(expected, actual);
    }

    @Test
    public void testPop() {
        Integer expected = 4;
        Integer actual = myStack.pop();
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveElementAt() {
        myStack.remove(1);
        Integer expectedValue = 3;
        assertEquals(expectedValue, myStack.elementAt(1));
    }

}
