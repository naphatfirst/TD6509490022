package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreatNewEmptyStack() {
		Stack s1 = new Stack(5);
		int size = s1.getSize();
		assertEquals(0,size);
		assertEquals(true,s1.isEmpty());;
	}
	
	public void testPushStack() {
		Stack s2 = new Stack(10);
		s2.isFull();
		s2.push(1);
		Object a;
		a = s2.getTop();
		assertEquals(1, a);
	}
	public void testLastInFirstOut() {
		Stack s2 = new Stack(4);
		s2.push(1);
		s2.push(2);
		s2.push(3);
		s2.push(4);
		assertEquals(4,s2.pop());
		assertEquals(3,s2.pop());
		assertEquals(2,s2.pop());
		assertEquals(1,s2.pop());
	}
	public void testPushToFullStack() {
		Stack s2 = new Stack(3);
		s2.push(1);
		s2.push(2);
		s2.push(3);
		s2.push(4);
		assertEquals(3,s2.pop());
		assertEquals(2,s2.pop());
		assertEquals(1,s2.pop());
	}

}
