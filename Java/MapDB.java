import java.awt.Color;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashMap;


public class MapDB {

   public static void main(String[] args) {
   Map <String, String> studentMap = new HashMap<String, String>();
   Scanner input = new Scanner(System.in);
       String userInput, name, grade;
       boolean repeat = true;
       /** Scanner above is for user to read the name options/ prompt
          the user for input and it repeats
       **/
       
       while(repeat)
       {
           System.out.println("1. Add Student");
           System.out.println("2. Remove Student");
           System.out.println("3. Display");
           System.out.println("4. Quit");
           //these are the options presented to the user in the prompt
           System.out.print("Enter 1, 2, 3, or 4: ");
           userInput = input.nextLine();
           
            switch(userInput)
            {
            //Option 1 = Add student
            case "1":
               //prompt for student to be added
               System.out.println("Enter name: ");
               name = input.nextLine();
               //adds name and grade
               System.out.println("Enter grade: ");
               grade = input.nextLine();
               //adds student and grade to map
               studentMap.put(name, grade);
               break;
               //Option 2= remove added student
            case "2":
               //prompt for student to be removed
               System.out.println("Enter student name to be removed: ");
               name = input.nextLine();
               //removes the student
               studentMap.remove(name);
               break;
               //Option 3 is map display
           case "3":
               System.out.println();
               // create sorted treemap to display options
               Map<String, String> treeMap = new TreeMap<String, String>(studentMap);
               //displays map
               for(Map.Entry<String, String> m:treeMap.entrySet())
               {
                   System.out.println(m.getKey() + ": "+m.getValue());
               }
               break;
               /** Option 4 will end the program or prompt the user to
                  enter another option if selected. **/
           case "4":               
               repeat = false; //set to false
               System.out.println("Program terminated..");//ends program
               break;           
           
           default:
               System.out.println("Error. Enter options 1-4: ");
               //default message that will prompt user for options 1-4
           }
           System.out.println();
       }
       input.close();
   }
}