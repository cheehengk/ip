package duke;

import java.util.Scanner;

/**
 * Deals with all interactions with the user.
 */
public class Ui {
    /**
     * Takes in command from user and returns the command as a string.
     *
     * @param in Scanner object to take in user input.
     * @return Command from the user.
     */
    public static String getCommandFromUser(Scanner in) {
        return in.nextLine();
    }

    /**
     * Prints to shows the response generated by the program to the user.
     *
     * @param response Response to be shown to the user.
     */
    public static void printResponseToUser(String response) {
        if (response != null) {
            System.out.println(response);
        }
    }
}
