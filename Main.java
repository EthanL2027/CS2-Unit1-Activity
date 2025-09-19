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
      String adjective = "sunny ";

      // Print your story line by line
      System.out.println("It was a " + adjective + "july day.");

      String place = "house ";
      String noun = "farts";
   System.out.println("I walked to my friends " + place + "and on the way I smelled a lot of " + noun + ".");

      String place2 = "house ";
      String emotion = "sad ";
      System.out.println("When I got to his " + place2 + "I instantly felt " + emotion + ".");

      String bodypart = "foot ";
      String noun2 = "choclate ";
      String movment = "griddying ";
      String noise = "growling ";

      System.out.println("His " + bodypart + "was covered in " + noun2 + ", and I saw my friend " + movment + "to " + noise + "noises.");

      String object = "pencil case ";
      String noun3 = "table";
      System.out.println("I sat down on the " + object + "and turned on the " + noun + ".");

      String noun4 = "baseball";
      System.out.println("Then a ginormous " + noun4 + " came crashing through the window.");

      String noun5 = "baseball";
      String adjective1 = "funny";
      String person = "alien";
      String movement2 = "jumping jacks";
      System.out.println("When the giant " + noun5 + " opened up we saw a " + adjective1  +  person + " and he started " + movement2 + " at a really odd pace" );


   }
}
