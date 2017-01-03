import org.junit.Test;
import org.junit.Assert;

public class LinkedListOperationsTest {
	LinkedList l = new LinkedList();

	@Test
	public void testAddToHeadSingleNode() {
		l.addToHead(2);
		Assert.assertEquals(2, l.getHead(), 0);
	}
	
	@Test
	public void testAddToHeadMultipleNodes(){
		l.addToHead(3);
		l.addToHead(4);
		l.addToHead(5);
		Assert.assertEquals(5, l.getHead(), 0);
	}
	
	@Test
	public void testAddToTailSingleNode(){
		l.addToTail(2);
		Assert.assertEquals(2, l.getTail(), 0);
	}

	@Test
	public void testAddToTailMultipleNodes(){
		l.addToTail(2);
		l.addToTail(3);
		l.addToTail(4);
		Assert.assertEquals(4, l.getTail(), 0);
	}

	

}
