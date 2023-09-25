/**
 * Project 1
 */

/**
* The SeminarDB class provides functionalities to manage and operate on 
 * a database of seminars. It utilizes a hash table to efficiently manage 
 * records, and a memory manager to handle storage of large data.
 * The class allows for the insertion, deletion, and search of seminars 
 * based on a unique key.
 *
 * @author {Stephen Ye, Ansh Patel}
 * @version {08/28/23}
 */

// On my honor:
// - I have not used source code obtained from another current or
// former student, or any other unauthorized source, either
// modified or unmodified.
//
// - All source code and documentation used in my program is
// either my original work, or was derived by me from the
// source code published in the textbook for this course.
//
// - I have not discussed coding details about this project with
// anyone other than my partner (in the case of a joint
// submission), instructor, ACM/UPE tutors or the TAs assigned
// to this course. I understand that I may discuss the concepts
// of this program with other students, and that another student
// may help me debug my program so long as neither of us writes
// anything during the discussion or modifies any computer file
// during the discussion. I have violated neither the spirit nor
// letter of this restriction.
public class SeminarDB {

	private Seminar rootSem;
    private BST bstId;
    private BST bstCost;
    private BST bstDate;
    private BST bstKey;
    private BinTree locationTree;
    private int worldSize;

    /**
     * Constructs a new SeminarDB with specified memory size and hash size.
     * @param memorySize The size of memory allocated for the memory manager.
     * @param hashSize The size of the hash table.
     */
    public SeminarDB(int worldSize) {
    	short a = 0;
    	
    	rootSem = new Seminar(0, "", "", 0, a, a, 0, new String[] {""}, "");

    	bstId = new BST("root", rootSem, false);
    	bstCost = new BST("root", rootSem, true);
    	bstDate = new BST("root", rootSem, true);
    	bstKey = new BST("root", rootSem, false);
    	
    	this.worldSize = worldSize;
    }

    public boolean IdInsert(String key, Seminar sem)
    {
    	if(bstId.insert(key, sem))
    	{
    		return true;
    	}
    	return false;
    	
    }
    
    public int getIdNodeCount()
    {
    	return bstId.getNodeCount();
    }
    

    public void CostInsert(String key, Seminar sem)
    {
    	bstCost.insert(key, sem);
    	
    }
    
    public int getCostNodeCount()
    {
    	return bstCost.getNodeCount();
    }
    
    public void DateInsert(String key, Seminar sem)
    {
    	bstDate.insert(key, sem);
    }
    
    public int getDateNodeCount()
    {
    	return bstDate.getNodeCount();
    }
    
    public void WordInsert(String[] keys, Seminar sem)
    {
    	StringBuilder builder = new StringBuilder();
        
        for(String str : keys) {
            builder.append(str);
        }
        String allKeys = builder.toString();
    	bstKey.insert(allKeys, sem);
    }
    
    public int getKeyNodeCount()
    {
    	return bstKey.getNodeCount();
    }
  
}