package TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumTest {
	
	@Test
	public void PositiveTest()
	
	{
		
	Assert.assertTrue(PrimeNumberCheck.isPrime(13));
		
	}
	
    @Test
	public void NegativeTest()
	{
	Assert.assertFalse(PrimeNumberCheck.isPrime(10));	
	}
}
