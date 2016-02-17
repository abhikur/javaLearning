import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OperationsTest {
	@Test
	public void hcf() {
		Operations operation = new Operations();
		assertEquals(2, operation.hcf(4,18));
	}
	@Test
	public void lcm() {
		Operations operation = new Operations();
		assertEquals(8, operation.lcm(4,8));	
	}
	@Test
	public void areaOfCircle() {
		Operations operation = new Operations();
		assertEquals(154, Math.round(operation.areaOfCircle(7)));	
	}
}