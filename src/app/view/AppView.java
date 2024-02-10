package app.view;

import java.util.Scanner;

public class AppView {

    private final Scanner scanner = new Scanner(System.in);

    public String getInput(){
        System.out.println("Enter height (in meters): ");
        return scanner.nextLine().trim();
    }

    public void printOutput(String output){
        System.out.println(output);
    }

}
