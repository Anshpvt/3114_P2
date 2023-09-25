import student.TestCase;

public class BSTTest extends TestCase{

    private BST dupTree;
    private BST nonDupTree;
    private Seminar seminar;

    public void setUp() {
        seminar = new Seminar(); // Assume a suitable method to create a Seminar object.
        dupTree = new BST("key1", seminar, true); // Initially, don't allow duplicates.
        nonDupTree = new BST("key1", seminar, false);
        
    }

    public void testInsertUnique() {
    	dupTree.insert("key2", seminar); // inserting unique key, should be added.
        assertEquals( 2, dupTree.getNodeCount()); // Assuming you have a getter for nodeCount.
        dupTree.insert("key0", seminar); // inserting unique key, should be added.
        assertEquals( 3, dupTree.getNodeCount());
    }

    public void testInsertDuplicateNotAllowed() {
    	nonDupTree.insert("key1", seminar); // inserting duplicate key, shouldn't be added as allowDup is false.
        assertEquals(1, dupTree.getNodeCount());
    }
    
    public void testInsertDuplicateAllowed() {
    	dupTree.insert("key1", seminar); // inserting duplicate key, shouldn't be added as allowDup is false.
        assertEquals(2, dupTree.getNodeCount());
    }
}


