
package midtermreviewcodeforpartc;

import java.util.Scanner;


public class UnoOnline 
{
    private User users[] = new User[100];//room for 100 online players!
     
    /**
     * Main method with call to private run method, to encapsulate our
     * main functionality.
     * @param args - not used
     */
    public static void main(String[] args) 
     {
       UnoOnline newPortal = new UnoOnline();
       newPortal.run();
    }
     /**
     * method that takes in the User's name and chosen password
     * and then continues prompting until the password is valid based on the
     * following two rules:
     * 1. The password must be at least length 8
     * 2. The password must contain at least one "special character"
     * 
     */
    private void run()
    {
        int userCount=0;//keep track of number of users for array
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your desired user name:");
        String userName = sc.nextLine();
        boolean validPassword = false;
        String password = "";

        int specialCharCount = 0;

        while (!validPassword) {
            
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password:");
            password = sc.nextLine();
            validPassword = PasswordValidator.validPassword(password);

        }

        User newUser = new User(userName, password);
        users[userCount] = newUser;//add the new user to the user list
        userCount++;
        System.out.println("New User Added");
        System.out.println("UserName: " + userName);
        System.out.println("Password: just kidding can't show password");
    }//end run method
   
    
}//end class
