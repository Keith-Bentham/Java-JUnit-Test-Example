import static org.junit.Assert.*;
import org.junit.Test;

public class CountTest {

	@Test
	public void test() {
		JUnitTest test = new JUnitTest();
		int result = test.count("axe");
		assertEquals(1, result);
	}
}
