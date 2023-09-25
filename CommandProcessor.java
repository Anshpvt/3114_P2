import java.io.File;
import java.util.Scanner;
/**
 * Project 1
 */

/**
 * The CommandProcessor class handles the 
 * reading and execution of commands from a given file. 
 * It interacts with the SeminarDB to 
 * insert, delete, search, or print seminar records.
 * Each command corresponds to a specific
 *  operation to be executed on the SeminarDB.
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


public class CommandProcessor {


	private SeminarDB database;
	private Seminar sem;

    /**
     * Constructs a new CommandProcessor that uses the provided database and
     * processes commands from the given file path.
     *
     * @param db The seminar database to use.
     * @param filePath Path to the file containing commands.
     */
    public CommandProcessor(int worldSize, String filePath) {
    	database = new SeminarDB(worldSize);
        processCommands(filePath);
        
    }


    /**
     * Reads and processes commands from the provided file path. Supported
     * commands include "insert", "delete", "search", and "print". 
     * Each command results in a specific operation 
     * being executed on the SeminarDB.
     *
     * @param filePath Path to the file containing commands.
     */
    void processCommands(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {

            while (scanner.hasNext()) {
                String command = scanner.next();

                switch (command) {
                    case "insert":
                        int id = scanner.nextInt();
                        String idStr = String.valueOf(id);
                        scanner.nextLine(); // Consume the rest of the line
                                            // after reading integer
                        String title = scanner.nextLine();
                        String date = scanner.next();
                        int length = scanner.nextInt();
                        short x = scanner.nextShort();
                        short y = scanner.nextShort();
                        int cost = scanner.nextInt();
                        String costStr = String.valueOf(cost);
                        scanner.nextLine();
                        String[] keywords = scanner.nextLine().trim().split(
                            "\\s+");
                        for (int i = 0; i < keywords.length; i++) {
                            keywords[i] = (keywords[i].trim());
                        }
                        String desc = scanner.nextLine().trim();
                        Seminar sem = new Seminar(id, title, date, length, x, y, cost,
                            keywords, desc);
                        
                        if (database.IdInsert(idStr, sem))
                        {
                        	database.CostInsert(costStr, sem);
                            database.DateInsert(date, sem);
                            database.WordInsert(keywords, sem);
                        }
                        
                        break;

                    case "delete":
                        id = scanner.nextInt();
//                        
                        break;

                    case "search":
                        String type = scanner.next();
                        String key = scanner.next();
                        
                        if (type.equals("location")) {
//                            
                        }
                        else if (type.equals("ID")) {
//                            
                        }
                        else if (type.equals("date")) {
//                          
                        }
                        else if (type.equals("keyword")) {
//                          
                        }
                        else if (type.equals("cost")) {
//                          
                        }
//                        
                        break;

                    case "print":
                        String printWhich = scanner.next();
                        if (printWhich.equals("location")) {
//                            
                        }
                        else if (printWhich.equals("ID")) {
//                            
                        }
                        else if (printWhich.equals("date")) {
//                          
                        }
                        else if (printWhich.equals("keyword")) {
//                          
                        }
                        else if (printWhich.equals("cost")) {
//                          
                        }
                        break;

                    default:
                        System.out.println("Unrecognized command: " + command);
                        break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error processing commands: " + e.getMessage());
        }
    }
}