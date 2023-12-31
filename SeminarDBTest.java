import student.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SeminarDBTest extends TestCase{

    private SeminarDB seminarDB;
    private Seminar seminar;

    public void setUp() {
        seminarDB = new SeminarDB(10); // Initialize SeminarDB object with worldSize 10 before each test
        seminar = new Seminar(1, "Test", "Test Location", 100, (short) 1, (short) 1, 10, new String[]{"TestWord"}, "Test Desc"); // Initialize a Seminar object
    }

    public void testIdInsert() {
        // Assuming bstId doesn’t allow duplicate, inserting the same key twice should return false the second time
        assertTrue(seminarDB.IdInsert("key1", seminar)); // Test for successful insert
        assertFalse(seminarDB.IdInsert("key1", seminar)); // Test for duplicate key
        assertEquals(2, seminarDB.getIdNodeCount());
    }
    

    public void testWordInsert() {
        String[] keys = {"Word1", "Word2"};
        seminarDB.WordInsert(keys, seminar);
        assertEquals(2, seminarDB.getKeyNodeCount());
        
    }
    
    public void testCostInsert() {
        seminarDB.CostInsert("100", seminar);
        assertEquals(2, seminarDB.getCostNodeCount());
    }
    
    public void testDateInsert() {
        seminarDB.DateInsert("20230924", seminar);
        assertEquals(2, seminarDB.getDateNodeCount());
    }
    
    public void testIdPrint() {
        SeminarDB seminarDB = new SeminarDB(10); // Initialize SeminarDB object with worldSize 10
        Seminar seminar = new Seminar(1, "Test", "Test Location", 100, (short) 1, (short) 1, 10, new String[]{"TestWord"}, "Test Desc"); // Initialize a Seminar object
        
        // Capture the output to the console
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        // Call IdPrint method
        seminarDB.IdPrint("key1", seminar);
        
        // Assert whether the printed content is as expected
        assertEquals("This tree is empty\n", outContent.toString());
        
        // Optionally, reset System.out to its original state after we are done
        System.setOut(System.out);
    }
    
    // Similar tests can be written for CostInsert and DateInsert depending on how you want to validate them
}
