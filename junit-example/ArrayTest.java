import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArrayTest {
	@Test
	public void creatingArray() {
		Array array = new Array();
		array.createArray(3);
		assertEquals(array.giveArray().length,3);
	}
	@Test 
	public void pushingElement() {
		Array array = new Array();
		array.createArray(4);
		array.push(2);
		array.push(6);
		assertEquals(array.giveArray()[0],2);
		assertEquals(array.giveArray()[1],6);
	}

}