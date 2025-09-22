// 1. IMPORT Scanner CLASS
import java.util.Scanner;


public class Main {

   public static void main(String []args) {
      System.out.println("Lets play MadLibs!");

      // 2. Set up a Scanner OBJECT
      Scanner input = new Scanner(System.in);
      // System.in refers to the physical keyboard!

      // 3. Use the Scanner to take input
      System.out.println("Type your name then press enter:");
      String player = input.nextLine();
      System.out.println("welcome, " + player);

      // Create variables for each placeholder word
      System.out.println("Enter an adjective");
      String adjective = input.nextLine();

    

   System.out.println("Enter a place");
   String place = input.nextLine();
   System.out.println("Enter a noun");
      String noun = input.nextLine();
   

      System.out.println("Enter a place");
       String place2 = input.nextLine();
      System.out.println("Enter an emotion");
      String emotion = input.nextLine();
      

      System.out.println("Enter a bodypart");
      String bodypart = input.nextLine();
      System.out.println("Enter a noun");
      String noun2 = input.nextLine();
      System.out.println("Enter a movement");
      String movment = input.nextLine();
      System.out.println("Enter a noise");
      String noise = input.nextLine();

      

      System.out.println("Enter a object");
      String object = input.nextLine();
      System.out.println("Enter a noun");
      String noun3 = input.nextLine();
      

      System.out.println("Enter a noun");
      String noun4 = input.nextLine();
      

      System.out.println("Enter a noun");
      String noun5 = input.nextLine();
      System.out.println("Enter an adjective");
      String adjective1 = input.nextLine();
      System.out.println("Enter a person");
      String person = input.nextLine();
      System.out.println("Enter a movement");
      String movement2 = input.nextLine();
      

      // Print your story line by line
      System.out.println("It was a " + adjective + "july day.");
      System.out.println("I walked to my friends " + place + "and on the way I smelled a lot of " + noun + ".");
      System.out.println("When I got to his " + place2 + "I instantly felt " + emotion + ".");
      System.out.println("His " + bodypart + "was covered in " + noun2 + ", and I saw my friend " + movment + "to " + noise + "noises.");
      System.out.println("I sat down on the " + object + "and turned on the " + noun3 + ".");
      System.out.println("Then a ginormous " + noun4 + " came crashing through the window.");
      System.out.println("When the giant " + noun5 + " opened up we saw a " + adjective1  +  person + " and he started " + movement2 + " at a really odd pace" );


   }
}
