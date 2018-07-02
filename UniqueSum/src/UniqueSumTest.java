
import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueSumTest {

	@Test
	public void testSumReturn1()
	{
		assertEquals(6, UniqueSum.sumReturn(1, 2, 3));
	}
	
	@Test
	public void testSumReturn2()
	{
		assertEquals(0, UniqueSum.sumReturn(1, 1, 1));
	}
	
	@Test 
	public void testSumRetrun2()
	
	{
		assertEquals(2, UniqueSum.sumReturn(1, 1, 2)); 
	}
	
	}

