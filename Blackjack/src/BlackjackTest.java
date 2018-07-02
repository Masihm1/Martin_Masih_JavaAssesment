
import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest
{
	@Test
	public void testBlackjackReturn1()
	{
		assertEquals(0, Blackjack.blackjackReturn(22, 23));
	}
	@Test
	public void testBlackjackReturn2()
	{
		assertEquals(20, Blackjack.blackjackReturn(20, 23));
	}
	@Test
	public void testBlackjackReturn3()
	{
		assertEquals(20, Blackjack.blackjackReturn(19, 20));
	}
	@Test 
	public void testBlackReturn4() 
	{
		assertEquals(0,Blackjack.blackjackReturn(-1,-2));
	}
	
}
