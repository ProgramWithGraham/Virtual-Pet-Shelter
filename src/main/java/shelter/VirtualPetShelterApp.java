package shelter;

import java.util.Scanner;

//call methods from VirtualPetShelter which interact with our VirtualPet objects
// calls VirtualPetShelter's tick method after each interaction
/*
 * playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
 allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one. NOTE: In the past this has been a bit confusing. 
 Keep in mind you are playing the role of a shelter worker, if a pet is adopted it will be removed from the shelter.
 allow intake of a pet, prompting the user for the pet's information, requiring the user to (at minimum) specify name and description
 (Hint: you can use tab characters ("\t") to align console output in columns.)
 */
public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner pet = new Scanner(System.in);
        System.out.println(
                " Welcome to the grand ole world of Virtual Pet. Your goal is to keep your pet satisfied with Food, Water and Play. The higher the number the better your pet is doing. ");
        System.out.println(" ");
        VirtualPet superPet = new VirtualPet("Krypto", "The Super dog");
        VirtualPet superPet2 = new VirtualPet("Tommy", "Green Power dog");

        VirtualPetShelter omgPets = new VirtualPetShelter();
        omgPets.addPets(superPet); // possibly nested if
        omgPets.addPets(superPet2); // possibly nested if

        omgPets.showPets();
        superPet.printUserInstructions();
        while (true) {
            int userInput = pet.nextInt();

            if (userInput == 1) {
                System.out.println(""); // This is used to increase the Hunger level
                superPet.feed();
                System.out.println("You have given your pet some food.");
                superPet.tick();

            } else if (userInput == 2) { // This is used to increase the Thirst level
                System.out.println("");
                superPet.giveWater();
                System.out.println("You have given your pet some water.");
                superPet.tick();

            } else if (userInput == 3) { // This is used to increase the boredom level
                System.out.println("");
                superPet.playFetch();
                System.out.println("You have played with your pet.");
                superPet.tick();

            }
            if (userInput == 4) { // Repeat current stats without causing a tick to trigger just incase user
                                  // forgot stats
                System.out.println("");

            }

            if (userInput == 6) {
                System.out.println("");
                // System.out.println(superPet.petName + " says: Baby Come Back, I just can't
                // live without you!\n");
                System.out.println("");
                System.out.println("            /~~~~~~~~\\                           _");
                System.out.println("    ##\\__/ @)      ~~~~~~~~\\                     \\ \\ ) )");
                System.out.println("    |              /~~\\~~~~~                ((    |  \\");
                System.out.println("     \\    /           |                          /   |");
                System.out.println("      (~~~   /         \\____________/~~~~~~~~~~~~   /");
                System.out.println("       ~~~~|~                                     /");
                System.out.println("           :                                      |");
                System.out.println("            \\                                     |");
                System.out.println("            |                               /      \\");
                System.out.println("             \\  \\_         :         \\     /~~~\\    |");
                System.out.println("             /   :~~~~~|   :~~~~~~~~~~|   :     :   :");
                System.out.println("            /    :    /    :         /    :    /    :");
                System.out.println("        (~~~     )(~~~     )     (~~~     )(~~~     )");
                System.out.println("         ~~~~~~~~  ~~~~~~~~       ~~~~~~~~  ~~~~~~~~");
                System.out.println("          STOMP     STOMP          STOMP     STOMP");
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            }
            System.out.println(superPet);
            superPet.printUserInstructions();
        }
        pet.close();

    }

}
