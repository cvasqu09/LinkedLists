import org.junit.Test;
import org.junit.Assert;

public class LinkedListOperationsTest {
	LinkedList l = new LinkedList();

	@Test
	public void testAddToHeadSingleNode() {
		l.addToHead(2);
		Assert.assertEquals(2, l.getHead().getVal(), 0);
	}
	
	@Test
	public void testAddToHeadMultipleNodes(){
		l.addToHead(3);
		l.addToHead(4);
		l.addToHead(5);
		Assert.assertEquals(5, l.getHead().getVal(), 0);
	}
	
	@Test
	public void testAddToTailSingleNode(){
		l.addToTail(2);
		Assert.assertEquals(2, l.getTail().getVal(), 0);
	}

	@Test
	public void testAddToTailMultipleNodes(){
		l.addToTail(2);
		l.addToTail(3);
		l.addToTail(4);
		Assert.assertEquals(4, l.getTail().getVal(), 0);
	}
	
	@Test
	public void testGetValueNoElements(){
		Assert.assertEquals(-1, l.getValue(0));
	}
	
	@Test
	public void testGetValueMultipleElements(){
		l.addToTail(3);
		l.addToTail(4);
		l.addToTail(5);
		Assert.assertEquals(4, l.getValue(1));
	}
	
	@Test
	public void testGetValueOutOfRange(){
		l.addToTail(3);
		Assert.assertEquals(-1, l.getValue(100));
	}
	
	@Test
	public void testQuickSortValid(){
		l.addToTail(5);
		l.addToTail(4);
		l.addToTail(3);
		l.quicksort(0, 2);
		// Assert everything is in order
		Assert.assertEquals(3, l.getHead().getVal(), 0);
		Assert.assertEquals(4, l.getValue(1), 0);
		Assert.assertEquals(5, l.getValue(2), 0);
	}
	
	@Test
	public void testQuickSortIndicesOutOfRange(){
		l.addToHead(2);
		l.addToHead(1);
		l.addToHead(3);
		l.quicksort(-2, 3);
		Assert.assertEquals(3, l.getHead().getVal(), 0);
		Assert.assertEquals(1, l.getValue(1), 0);
		Assert.assertEquals(2, l.getValue(2), 0);
	}
	
	@Test
	public void testSwapValid(){
		l.addToTail(2);
		l.addToTail(3);
		l.addToTail(4);
		l.swap(l.getNode(0), l.getNode(2));
	}

	

}
