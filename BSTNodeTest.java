import student.TestCase;

public class BSTNodeTest extends TestCase{

    private BSTNode node;
    private Seminar seminar;

    public void setUp() {
        seminar = new Seminar(); // Assuming a suitable constructor or method to create a Seminar object.
        node = new BSTNode("key1", seminar);
    }
    

    public void testCreateNode() {
        assertNotNull(node);
        assertEquals("key1", node.getKey());
        assertEquals(seminar, node.getSeminar());
        assertNull(node.getLeft());
        assertNull(node.getRight());
    }
    

    public void testLeftUtil() {
        BSTNode leftNode = new BSTNode("key0", seminar);
        node.setLeft(leftNode);
        
        assertNotNull(node.getLeft());
        assertEquals("key0", node.getLeft().getKey());
    }
    

    public void testRightUtil() {
        BSTNode rightNode = new BSTNode("key2", seminar);
        node.setRight(rightNode);
        
        assertNotNull(node.getRight());
        assertEquals("key2", node.getRight().getKey());
    }
}
