package com.java.ds;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.java.ds.StackDS;

public class StackDSTest {
	StackDS stack;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Before
	public void setUp() throws Exception {
		stack = new StackDS(3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPushAddOneItem() {
		assertTrue(stack.push(1));
	}
	
	@Test
	public void testPushAddOneItemExpectSizeOne()  {
		pushItem(1);
		assertEquals(1,stack.getSize());
	}
	
	@Test
	public void testPushAddTwoItemExpectSizeTwo()  {
		pushItem(1,2);
		assertEquals(2,stack.getSize());
	}
	
	@Test
	public void testPushItemWhenStackIsFullExpectFalse()  {
		pushItem(1,2,3);
		assertFalse(stack.push(4));
	}
	
	@Test
	public void testCheckTopItemWhenOneItemPushed()  {
		pushItem(1);
		try {
			assertEquals(1,stack.peek());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCheckTopItemWhenStackEmptyExpectException() throws IndexOutOfBoundsException  {
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Stack Empty");
		stack.peek();
	}
	
	@Test
	public void testCheckTopItemWhenTwoItemPushed()  {
		pushItem(1,2);
		assertEquals(2, stack.peek());
	}
	
	@Test
	public void testCheckTopItemWhenThreeItemPushed()  {
		pushItem(1,2,3);
		assertEquals(3, stack.peek());
	}
	
	@Test
	public void testPopItemWhenOneItemPushed()  {
		pushItem(1);
		assertEquals(1,stack.pop());
	}
	
	@Test
	public void testPopItemWhenStackEmpty()  {
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Stack Empty");
		stack.pop();
	}
	
	@Test
	public void testSizeWhenOnePopItemWhenTwoItemPushed()  {
		pushItem(1,2);
		assertEquals(2, stack.pop());
		assertEquals(1,stack.getSize());
	}
	
	@Test
	public void testPopTwiceWithThreePush()  {
		pushItem(1,2,3);
		assertEquals(3, stack.pop());
		assertEquals(2,stack.pop());
	}
	
	@Test
	public void testIsStackEmptyWithEmptyStack()  {
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testIsStackEmptyWithOneItemPushed()  {
		pushItem(1);
		assertFalse(stack.isEmpty());
	}
	
	@Test
	public void testIsStackEmptyWithTwoItemPushedAndOneItemPop()  {
		pushItem(1,2);
		stack.pop();
		assertFalse(stack.isEmpty());
	}
	
	

	private void pushItem(int... items) {
		for(int num: items)
			stack.push(num);
	}

}
