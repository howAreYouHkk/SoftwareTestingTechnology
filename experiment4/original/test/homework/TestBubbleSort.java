package homework;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestResult;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestBubbleSort {
	private int[] input;
	private int[] expected;
	private BubbleSort sort = null;
	
	public TestBubbleSort(int[] input,int[] expected) {
		this.input = input;
		this.expected = expected;
	}
	
	@Before
	public void setup() {
		sort = new BubbleSort();
	}
	
	@Parameters
	public static Collection<Object[]> getData() {
		int[] inp1={2,1,4,3,5}; int[] exp1={1,2,3,4,5};
		int[] inp2={5,4,7,8,2}; int[] exp2={2,4,5,7,8};
		int[] inp3={8,9,7,6,2}; int[] exp3={2,6,7,8,9};
		return Arrays.asList(new Object[][] {
			{inp1,exp1},
			{inp2,exp2},
			{inp3,exp3}
		});	
	}
	
	@Test
	public void testBubbleSort(){
		assertArrayEquals(this.expected,sort.BubbleSort(input));
	}
	
	@AfterClass
	public static void testResult() {
		System.out.println("end");
	}

}
