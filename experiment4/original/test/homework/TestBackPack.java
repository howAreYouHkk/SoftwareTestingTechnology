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

public class TestBackPack {
	BackPack back;
	private int m=10;
	private int n=3;
	private int w[]= {3,4,5};
	private int p[]= {4,5,6};
	private int[][] res = null;
	private int exp[][]= {
			              {0,0,0,0,0,0,0,0,0,0,0},
			              {0,0,0,4,4,4,4,4,4,4,4},
	                      {0,0,0,4,5,5,5,9,9,9,9},
	                      {0,0,0,4,5,6,6,9,10,11,11}
	                      };
	
	
	@Before 
	public void setUp() {
		back = new BackPack();
	}
	
	@Test
	public void testBackPack_Solution(){
		res = back.BackPack_Solution(m, n, w, p);
		assertArrayEquals(exp,res);
	}
	
	@AfterClass
	public static void testResult() {
		System.out.println("end");
	}

}
