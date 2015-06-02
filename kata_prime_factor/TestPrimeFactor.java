import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class TestPrimeFactor {
	
	private PrimeFactor pf;

	@Before
	public void setUp() throws Exception {
		pf = new PrimeFactor();
	}

	@After
	public void tearDown() throws Exception {
	}
	

	@Test
	public void test_invalid_prime_number() {
		assertEquals(Arrays.asList(), pf.getFactors(1));
	}
	
	@Test
	public void test_2_return_2() {
		assertEquals(Arrays.asList(2),pf.getFactors(2));	
	}
	
	@Test
	public void test_3_return_3() {		
		assertEquals(Arrays.asList(3),pf.getFactors(3));	
	}
	
	@Test
	public void test_4_return_2_2() {		
		assertEquals(Arrays.asList(2,2),pf.getFactors(4));	
	}
	
	@Test
	public void test_6_return_2_3() {		
		assertEquals(Arrays.asList(2,3),pf.getFactors(6));	
	}
	
	@Test
	public void test_8_return_2_2_2() {		
		assertEquals(Arrays.asList(2,2,2),pf.getFactors(8));	
	}
	
	@Test
	public void test_9_return_3_3() {		
		assertEquals(Arrays.asList(3,3),pf.getFactors(9));	
	}

}
