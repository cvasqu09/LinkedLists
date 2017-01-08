import org.junit.Test;
import org.junit.Assert;

public class LinkedListOperationsTest {
	LinkedList l = new LinkedList();

	@Test
	public void testAddToHead_singleNode() {
		l.addToHead(2);
		Assert.assertEquals(2, l.getHead().getVal(), 0);
	}
	
	@Test
	public void testAddToHead_multipleNodes(){
		l.addToHead(3);
		l.addToHead(4);
		l.addToHead(5);
		Assert.assertEquals(5, l.getHead().getVal(), 0);
	}
	
	@Test
	public void testAddToTail_singleNode(){
		l.addToTail(2);
		Assert.assertEquals(2, l.getTail().getVal(), 0);
	}

	@Test
	public void testAddToTail_multipleNodes(){
		l.addToTail(2);
		l.addToTail(3);
		l.addToTail(4);
		Assert.assertEquals(4, l.getTail().getVal(), 0);
	}
	
	@Test
	public void testGetValue_noElements(){
		Assert.assertEquals(-1, l.getValueAt(0));
	}
	
	@Test
	public void testGetValue_multipleElements(){
		l.addToTail(3);
		l.addToTail(4);
		l.addToTail(5);
		Assert.assertEquals(4, l.getValueAt(1));
	}
	
	@Test
	public void testGetValue_outOfRange(){
		l.addToTail(3);
		Assert.assertEquals(-1, l.getValueAt(100));
	}
	
	@Test
	public void testQuickSort_valid(){
		l.addToTail(5);
		l.addToTail(4);
		l.addToTail(3);
		l.quicksort(0, 2);
		// Assert everything is in order
		Assert.assertEquals(3, l.getHead().getVal(), 0);
		Assert.assertEquals(4, l.getValueAt(1), 0);
		Assert.assertEquals(5, l.getValueAt(2), 0);
	}
	
	@Test
	public void testQuickSort_indicesOutOfRange(){
		l.addToHead(2);
		l.addToHead(1);
		l.addToHead(3);
		l.quicksort(-2, 3);
		Assert.assertEquals(3, l.getHead().getVal(), 0);
		Assert.assertEquals(1, l.getValueAt(1), 0);
		Assert.assertEquals(2, l.getValueAt(2), 0);
	}
	
	@Test
	public void testSwap_valid(){
		l.addToTail(2);
		l.addToTail(3);
		l.addToTail(4);
		l.swap(l.getNode(0), l.getNode(2));
		Assert.assertEquals(4, l.getHead().getVal(), 0);
		Assert.assertEquals(2, l.getTail().getVal());
	}
	
	@Test(expected = IllegalStateException.class)
	public void testRemoveVal_nullList(){
		l.removeVal(4);
	}
	
	@Test
	public void testRemoveVal_singleElement(){
		l.addToHead(2);
		l.removeVal(2);
		Assert.assertEquals(0, l.getNumElements(), 0);
	}

	

}
