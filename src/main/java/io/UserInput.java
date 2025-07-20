package io;

import java.util.Scanner;


public class UserInput
{
    private String designation;
    private String location;   
    private int experience;
    private int browserSelection;

    /**
     * Method to get user input for job search criteria.
     */
    public void getUserInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your designation/Skills/Company Name: ");
        this.designation = scanner.nextLine();

        System.out.print("Enter your experience in years: ");
        this.experience = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter your location: ");
        this.location = scanner.nextLine();

        System.out.println("Choose the browser that you want to use:\n1. Chrome\n2. Edge");
        if(scanner.hasNextInt())
        {
            browserSelection = scanner.nextInt();
            scanner.close();
        }
        // if invalid input is provided then the code is terminated
        else
        {
            System.out.println("Invalid value provided.");
            System.exit(-1);
        }
    }

    // Getters for the user input fields
    public String getDesignation()
    {
        return designation;
    }

    public String getLocation()
    {
        return location;
    }   

    public int getExperience()
    {
        return experience;
    }   

    public int getBrowserSelection()
    {
        return browserSelection;
    }

}
