//--------------------------------------------------------
// Assignment 2 Q1
// Written by: Whi-Ming Joseph 40202164
// For COMP 248 Section W - Winter 2022
//-----------------------------------------------------
   /*
   This program will display Covid-19 symptoms
   and their respective codes to allow the user
   to receive a symptom status and recommended
   actions they should follow.
    */
import java.util.Scanner;
public class A2_Q1
{

    public static void main(String[] args)
    {
	    Scanner in = new Scanner(System.in);

        System.out.printf("Welcome to the Simple COVID-19 Diagnostics Expert System: %n" +
                          "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++ %n%n" +
                          "Symptom Code => Symptom Description %n" +
                          "------------------------------------ %n" +
                          "10 => Fever %n" +
                          "11 => Cough %n" +
                          "12 => Tiredness %n" +
                          "13 => Loss of Taste and/or Smell %n" +
                          "14 => Sore Throat %n" +
                          "15 => Headache %n" +
                          "16 => Body Aches and/or Pains %n" +
                          "17 => Diarrhoea %n" +
                          "18 => Skin Rash %n" +
                          "19 => Fingers/Toes Discoloration %n" +
                          "20 => Red and/or Irritated Eyes %n" +
                          "21 => Shortnes of Breath %n" +
                          "22 => Confusion and/or Loss of Speech %n" +
                          "23 => Chest Pains %n%n" +
                          "Please enter the Symptom Code, from the aforementioned, that " +
                            "corresponds to your current health symptoms: ");
        //Here I verify whether a valid integer will be entered, if not, the else statement
        //will run, ending the program while displaying an error message and asking the user to enter a valid integer.
        if (in.hasNextInt())
        {
            int code = in.nextInt();
            //I declare a domain of integers that the program accepts.
            if ((code >= -128) && (code <= 127))
            {
              //For the program to display advice based on a mentioned symptom, a domain must be
              //created. This domain will consist of the codes provided. Else, the user is trying
              //to state that they do not show any symptoms.
              if ((code <= 23) && (code >= 10))
              {
                  //Since the integer must be greater than 10 at this point, I can divide each section with
                  //the lesser-or-equal symbol. Since I am using that symbol, it is important that I start
                  //with the smallest category.
                  if (code <= 13)
                  {
                      System.out.printf("Symptom Status: MOST COMMON SYMPTOMS %n" +
                              "You are experiencing a common symptom with regard to " +
                              "either COVID-19 or a respiratory infection (e.g. flu). %n" +
                              "Kindly isolate yourself as soon as possible, and endeavor to " +
                              "perform a PCR (Polymerase Chain Reaction) test to " +
                              "confirm your COVID-19 status. %n%n");
                  }
                  //It is important that I use the "else if" statement instead of simply the "if" statement to ensure
                  //that the previous block won't run if it isn't smaller-or-equal to 13.
                  else if (code <= 20)
                  {
                      System.out.printf("Symptom Status: LESS COMMON SYMPTOMS %n" +
                              "You are experiencing a common symptom with regard to " +
                              "either COVID-19 or a respiratory infection (e.g. flu). %nKindly " +
                              "isolate yourself as soon as possible, and endeavor to " +
                              "perform a PCR (Polymerase Chain Reaction) test to " +
                              "confirm your COVID-19 status. %n%n");
                  }
                  else
                  {
                      System.out.printf("Symptom Status: CRITICAL SYMPTOM %n" +
                              "You are experiencing a CRITICAL/SEVERE symptom with " +
                              "regard to either COVID-19 or a respiratory infection (e.g. " +
                              "flu). %nKindly isolate yourself as soon as possible and call " +
                              "911, immediately. %n%n");
                  }
              }
              else
              {
                  System.out.printf("Symptom Status: NO OBVIOUS SYMPTOM %n" +
                        "You are currently experiencing no observable symptom " +
                        "with regard to either COVID-19 or a respiratory infection " +
                        "(e.g. flu). %nAlthough, you may be asymptomatic. Thus, " +
                        "kindly adhere to all the COVID-19 safety regulations " +
                        "within your city and province. %n%n");
              }
                //I insert the farewell message within the if statement that verifies whether
                //the integer entered falls within the respected range since this message
                //should only be displayed if the user has participated successfully.
                System.out.println("Thank you! Please stay safe and healthy.");

            }
            else
            {
                System.out.println("Error: Your input/entry is not a valid integer " +
                        "between -128 to 127. Kindly retry again!");
            }

        }
        else
        {
            System.out.println("Error: Your input/entry is not a valid integer " +
                 "between -128 to 127. Kindly retry again!");
        }

    }
}
