import java.util.*;

/**
 * Class Stackmain
 */
public class Stackmain {
  public static void main(String[] args) {
    //create the objects
    StackInt stackInt = new StackInt();
    Scanner scanner = new Scanner(System.in);
    
    //declare variables
    String userChoice = "";
    boolean userExit = false;
    
    //do this while the user wants to continue
    while (userExit != true)  {
      //get the user input
      System.out.print("Enter what you would like to do. For a list of commands, type 'help': ");
      userChoice = scanner.next();
      switch (userChoice) {
        case "help": //user requests a list of commands
          help(); //write the list of commands
          break;
        case "0": //user wants to push an int
          System.out.print("Enter an integer to push: ");
          
          //try to get an int from the user
          try { //attempting to get the int
            int intToPush = scanner.nextInt(); //get the next int
            stackInt.stackpush(intToPush); //call stackpush and pass the user int
            
          } catch(Exception e) { //in case of invalid input, ask the user to try again
            System.out.println("Invalid input. Try again");
          }
          break;
        case "1":
          //checking to see if the stack is empty
          int popsize = stackInt.stacksize();
          if (popsize == 0)  { //if the size is 0, tell the user
            System.out.println("Error. Stack empty");
          } else  { //pop a value from the stack
            System.out.println("int popped: " + stackInt.stackpop());
          }
          break;
        case "2":
          int peeksize = stackInt.stacksize();
          if (peeksize == 0)  { //if the size is 0, tell the user
            System.out.println("Error. Stack empty");
          } else  { //pop a value from the stack
            System.out.println("integer on top: " + stackInt.stackpeek());
          }
          break;
        case "-1":
          userExit = true;
          break;
        default:
          System.out.println("Invalid");
      }
    }
  }
  public static void help() {
    String output = "";
    for (int i = 0; i < 41; i++)  {
      output += "*";
    }
    System.out.println("");
    System.out.println(output);
    System.out.println("Type 0 to push an integer to the stack");
    System.out.println("Type 1 to pop an integer from the stack");
    System.out.println("Type 2 to peek into the stack");
    System.out.println("Type 3 to clear the stack");
    System.out.println("Type 4 to restore the stack (not yet functional)");
    System.out.println("Type -1 to exit");
    System.out.println(output);
    System.out.println("");
  }
}