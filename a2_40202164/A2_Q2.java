//--------------------------------------------------------
// Assignment 2 Q2
// Written by: Whi-Ming Joseph 40202164
// For COMP 248 Section W - Winter 2022
//-----------------------------------------------------
   /*
    This program allows a user to input values to test a
    learning function Z.
    */
import java.util.Scanner;
public class A2_Q2
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.printf("Welcome to the Simple Machine-Learning Function Program: %n" +
                          "++++++++++++++++++++++++++++++++++++++++++++++++++++++++ %n%n" +
                          "Please enter a Weekday and Time, respectively: ");
        String weekdayInput = in.next();
        String timeInput = in.next();

        //We want the program to be case-insensitive so using .toLowerCase
        //to switch each character to a lower case, ultimately being case-insensitive.
        String weekday = weekdayInput.toLowerCase();
        String time = timeInput.toLowerCase();

        double y = 0;
        final double omega = 0.567143;

        //I will give different commands using the switch statement depending on the day entered in weekday
        switch (weekday)
        {
            case "monday":
                //Within the case statements I bring up another switch statement, this time
                //evaluating the different possible inputs for time, since
                //the variable y is defined not only by the day, but the specific
                //time of day.
                switch (time)
                {
                    case "day-light":
                        y = 2.53;
                        break;
                    case "night-time":
                        y = 3.25;
                        break;
                    //If the user had entered a valid day, allowing them to enter this case statement,
                    // but had not entered a valid time, the default will run and display and error message,
                    //asking the user to enter a proper time variable.
                    default:
                        System.out.printf("Error: An invalid value has been entered for the 'Time' variable." +
                                " Kindly retry again! %n");
                }
                break;
            //I will repeat the previous block of code for each day, respecting its time variables.
            case "tuesday":
                switch (time)
                {
                    case "day-light":
                        y = 3.15;
                        break;
                    case "night-time":
                        y = 2.99;
                        break;
                    default:
                        System.out.printf("Error: An invalid value has been entered for the 'Time' variable." +
                                " Kindly retry again! %n");
                }
                break;
            case "wednesday":
                switch (time)
                {
                    case "day-light":
                        y = 3.00;
                        break;
                    case "night-time":
                        y = 3.99;
                        break;
                    default:
                        System.out.printf("Error: An invalid value has been entered for the 'Time' variable." +
                                " Kindly retry again! %n");
                }
                break;
            case "thursday":
                switch (time)
                {
                    case "day-light":
                        y = 2.41;
                        break;
                    case "night-time":
                        y = 2.68;
                        break;
                    default:
                        System.out.printf("Error: An invalid value has been entered for the 'Time' variable." +
                                " Kindly retry again! %n");
                }
                break;
            case "friday":
                switch (time)
                {
                    case "day-light":
                        y = 1.99;
                        break;
                    case "night-time":
                        y = 3.73;
                        break;
                    default:
                        System.out.printf("Error: An invalid value has been entered for the 'Time' variable." +
                                " Kindly retry again! %n");
                }
                break;
            case "saturday":
                switch (time)
                {
                    case "day-light":
                        y = 3.59;
                        break;
                    case "night-time":
                        y = 2.86;
                        break;
                    default:
                        System.out.printf("Error: An invalid value has been entered for the 'Time' variable." +
                                " Kindly retry again! %n");
                }
                break;
            case "sunday":
                switch (time)
                {
                    case "day-light":
                        y = 2.00;
                        break;
                    case "night-time":
                        y = 2.59;
                        break;
                    default:
                        System.out.printf("Error: An invalid value has been entered for the 'Time' variable." +
                                " Kindly retry again! %n");
                }
                break;
            //If the user hadn't entered a valid day variable, this default case will run and
            //display an error message.
            default:
                System.out.printf("Error: An invalid value has been entered for the 'Weekday' variable." +
                        " Kindly retry again! %n");


        }
        //At this point, y has been given a value, so the calculation of Z can now be performed.
        double z = y * omega;
        //Printing out the results, and ensuring Z has only 2 spaces after the decimal with %.2f.
        System.out.printf("%n" +
                          "Value of the prototype Learning Function, Z is: %.2f %n" +
                          "Thank you for contributing to this Machine Learning project!", z);
    }

}
