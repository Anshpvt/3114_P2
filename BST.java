
public class BST{

	private BSTNode root;
	private int nodeCount;
	private boolean allowDup;
	
	public BST(String key, Seminar sem, boolean allowDup)
	{
		this.root = new BSTNode(key, sem);
        this.nodeCount = 1; // as we have one node initially which is the root
        this.allowDup = allowDup;
		
	}
	
	public int getNodeCount()
	{
		return nodeCount;
	}
	public boolean insert(String key, Seminar seminar) {
        int ogCount = nodeCount;
        root = insertRec(root, key, seminar);
        if (ogCount < nodeCount) // Check if a new node was added
        {
            System.out.println("smthg was inserted");
            return true;
        }
        else
        {
            return false;
        }
    }

    private BSTNode insertRec(BSTNode root, String key, Seminar seminar) {
        if (root == null) {
            nodeCount++; // Increase the nodeCount as a new node is being added
            return new BSTNode(key, seminar); // create a new node and return it
        }

        int cmp = key.compareTo(root.getKey());
        if (cmp < 0) {
            root.setLeft(insertRec(root.getLeft(), key, seminar)); // go left
        } else if (cmp > 0) {
            root.setRight(insertRec(root.getRight(), key, seminar)); // go right
        } else {
            if (allowDup) {
                // if duplicates are allowed, then create a new node and add it
                // For simplicity, let's add duplicates to the right
                root.setRight(insertRec(root.getRight(), key, seminar));
            } else {
                // if duplicates are not allowed, just update the seminar
                root.setSeminar(seminar);
            }
        }

        return root;
    }
	
//	public find()
//	{
//		
//	}
//	
//	public remove()
//	{
//		
//	}
//	
//	public print()
//	{
//		
//	}
}
