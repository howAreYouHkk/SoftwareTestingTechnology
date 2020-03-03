package experiment;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class test1 {
	
	private int expected;
	private int input;
	
	homework1 ch = null;
	
	public test1(int input, int expected){
		this.input = input;
		this.expected = expected;
	}

	
	@Before
	public void setUp() {
		ch = new homework1();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
			
		return Arrays.asList(new Object[][]{
			{0,1},
			{18,1},
			{29,0},
			{93,1},
			{94,0},
			{-1,0},
			{66,0}//¼ì²éÄÜ·ñÅÐ¶Ï³ö´í
			});
	}
	
	@Test
	public void testCheck() {
		assertEquals(this.expected,ch.check(input));
	}

}
