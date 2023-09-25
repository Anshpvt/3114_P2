import student.TestCase;

/**
 * @author {Your Name Here}
 * @version {Put Something Here}
 */
public class SemSearchTest extends TestCase {
	
	private SemSearch semSearch;
    /**
     * Sets up the tests that follow. In general, used for initialization
     */
    public void setUp() {
        semSearch = new SemSearch();
    }


    /**
     * Test with the first argument not being a power of 2.
     */
    public void testMainInvalidWorldSize() {
        String[] args = {"3", "someString"};
        SemSearch.main(args);
        // assert the output, it should be "invalid world size"
        String expected = "invalid world size\n";
        assertEquals(expected, systemOut().getHistory());
    }

    /**
     * Test with the first argument being a power of 2 and valid second argument.
     */
    public void testMainValidArgs() {
        String[] args = {"4", "empty.txt"};
        SemSearch.main(args);
        
        assertEquals("", systemOut().getHistory());
    }
    
    /**
     * Test with the first argument not being a power of 2.
     */
    public void testMainInvalidInputs() {
        String[] args = {"4", "someString", "uh oh"};
        SemSearch.main(args);
        // assert the output, it should be "invalid world size"
        String expected = "invalid inputs\n";
        assertEquals(expected, systemOut().getHistory());
    }
}
