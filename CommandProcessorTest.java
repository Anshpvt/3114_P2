import student.TestCase;

public class CommandProcessorTest extends TestCase{

    private CommandProcessor tester;

    public void setUp() {
        
        tester = new CommandProcessor(128, "testIn.txt");
    }
    
    //public void testInsertCommand() {
      //  assertTrue(systemOut().getHistory().contains("Successfully inserted record with ID 1\n"
     //   		+ "ID: 1, Title: Overview of HCI Research at VT\n"
     //   		+ "Date: 0610051600, Length: 90, X: -1, Y: 10, Cost: 45\n"
     //   		+ "Description: This seminar will present an overview of HCI research at VT\n"
    //    		+ "Keywords: HCI, Computer_Science, VT, Virginia_Tech\n"));
    //}

    public void testDeleteCommand() {
    	assertTrue(systemOut().getHistory().contains("delete called:"));
    }

    public void testSearchCommand() {
//    	assertTrue(systemOut().getHistory().contains("ID Searched:"));
//    	assertTrue(systemOut().getHistory().contains("Keyword Searched:"));
//    	assertTrue(systemOut().getHistory().contains("Cost Searched:"));
    	assertTrue(systemOut().getHistory().contains("Location Searched:"));
//    	assertTrue(systemOut().getHistory().contains("Date Searched:"));
    }

    public void testPrintCommand() {
    	assertTrue(systemOut().getHistory().contains("ID Tree:"));
    	assertTrue(systemOut().getHistory().contains("Keyword Tree:"));
//    	assertTrue(systemOut().getHistory().contains("Cost Tree:"));
//    	assertTrue(systemOut().getHistory().contains("Location Tree:"));
    	assertTrue(systemOut().getHistory().contains("Date Tree:"));
    }
    
    public void testInvalidCommand() {
    	assertTrue(systemOut().getHistory().contains("Unrecognized command: wtf"));
    }
    
}
