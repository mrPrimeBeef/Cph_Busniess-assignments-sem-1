import java.util.Collections;
import java.util.ArrayList;



class Main {
    private static ArrayList<String> actions = new ArrayList<>();

    static {
        Collections.addAll(actions, "1) Start game", "2) Resume game", "3) Pause game", "4) End game");
    }

    public static void main(String[] args) {
        GameMenu theMenu = new GameMenu(actions);
        theMenu.displayMenu();
        int userChoice = theMenu.getAction();
        doAction(userChoice);
    }

    public static void doAction(int userChoice){
          switch (userChoice) {
    case 1:
        System.out.println("Starting the game now");
        break;
    case 2:
         System.out.println("Fetching previously saved game data");
        break;
    case 3:
        System.out.println("Game paused");
        break;
    case 4:
        System.out.println("Ending game");
        break;
    default:
        // Statements to be executed if none of the above cases match
        }

     }


}

/*
Task 5:
We will continue with the code you produced in task 4. Now we want to make it possible for a user to select an action in the menu. When he types a number associated with an action, the program will print a message that corresponds to the chosen action. The point of this exercise is to work with the Scanner to create a dialog with the user.

5.a Create a method in the GameMenu class, getAction that prints the sentence "Type a number to choose an action" and then prints each elements in the options attribute.

Hint
5.b Next, in the getAction method, create a new Scanner object. Declare a variable String choice and assign it the user's input. (Similar to what you did in step 2.c and 2.d)

5.c Let the getAction method return the user's choice. (If the method has void as return type, change that to the return type of String). Then return the choice variable you declared in step 5.b

5.d In the main method of Main, call the getAction method on the Menu instance, saving the return value (the user response) in a variable.

Peep solution
5.d Create a new method in the Main class, for printing the message that corresponds to the action the user has chosen. The method should have this signature: public static void doAction(int action).

5.f In the body of the doAction method, write a switch-case with a case for each of the 4 options added in step 4.f. In each case block you will print a message that corresponds to the user's choice:

1: "Starting the game now"
2: "Fetching previously saved game data"
3: "Game paused"
4: "Ending game"
5.g In step 5.d you created a variable called userChoicecode> of type String. Convert the value to an int before using it as an argument in a call to the doAction method.

hint
*/