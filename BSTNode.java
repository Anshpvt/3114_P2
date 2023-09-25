/**
 * Project 2
 */

/**
 * Represents a Record that contains a unique identifier (key) 
 * and associated Seminar data. This class provides methods to 
 * access the key, seminar data, and check if the record is a 
 * tombstone.
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
public class BSTNode{

	private String key;
	private Seminar seminar;
	private BSTNode left, right;

    public BSTNode(String key, Seminar sem) {
        this.key = key;
        this.seminar = sem;
        this.left = null;
        this.right = null;
    }


    /**
     * Retrieves the key of this record.
     * @return The key of the record.
     */
    public String getKey() {
        return key;
    }
    
    public void setKey(String k)
    {
    	this.key = k;
    }

    /**
     * Retrieves the Seminar object associated with this record.
     * @return The Seminar object of the record.
     */
    public Seminar getSeminar() {
        return seminar;
    }
    
    public void setSeminar(Seminar sem)
    {
    	this.seminar = sem;
    }
    
    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

}