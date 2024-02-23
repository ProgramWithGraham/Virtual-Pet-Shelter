package shelter;

import java.util.*;

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
                "\n Welcome to the grand ole world of Virtual Pet. Your goal is to keep your pet satisfied with Food, Water and Play. The higher the number the better your pet is doing. \n");
        VirtualPet superPet = new VirtualPet("Krypto", "The Super dog");
        VirtualPet superPet2 = new VirtualPet("Tommy", "Green Power dog");
        VirtualPet superPet3 = new VirtualPet("Billy", "Blue Power dog");
        VirtualPet superPet4 = new VirtualPet("Kimberly", "Pink Power dog");
        VirtualPet superPet5 = new VirtualPet("Jason", "Red Power dog");
        VirtualPet superPet6 = new VirtualPet("Trini", "Yellow Power dog");

        VirtualPetShelter omgPets = new VirtualPetShelter();
        omgPets.addPets(superPet);
        omgPets.addPets(superPet2);
        omgPets.addPets(superPet3);
        omgPets.addPets(superPet4);
        omgPets.addPets(superPet5);
        omgPets.addPets(superPet6);

        omgPets.showPets();
        superPet.printUserInstructions();
        while (true) {
            int userInput = pet.nextInt();

            if (userInput == 1) { // This is used to increase the Hunger level for all pets
                omgPets.feedAll();
                System.out.println("\nYou have given all pets some food.\n");

            } else if (userInput == 2) { // This is used to increase the Thirst level for all pets
                omgPets.giveAllWater();
                System.out.println("\nYou have given all pets some water.\n");

            } else if (userInput == 3) { // This is used to increase the boredom level for only the selected pet
                omgPets.findPet();
                pet.nextLine();
                System.out.println("\nPlease type the pet name from the above list that you want to play with");
                String chooseAPet = pet.nextLine();
                omgPets.playWithSelectedPet(chooseAPet);
                System.out.println("\nYou have played with " + chooseAPet + "\n");

            } else if (userInput == 4) {
                omgPets.findPet();
                pet.nextLine();
                System.out.println("\nPlease type the pet name from the above list that you want to adopt");
                String petToRemove = pet.nextLine();
                System.out.println("You have adopted " + " " + petToRemove + "\n");
                omgPets.removePet(petToRemove);

            } else if (userInput == 5) {
                pet.nextLine();
                System.out.println("\nWhat name do you want your new pet to have?");
                String namingThePet = pet.nextLine();
                System.out.println("What is your description of your pet in three words?");
                String describeThePet = pet.nextLine();
                System.out.println(" You have admitted a pet.");
                VirtualPet superPet7 = new VirtualPet(namingThePet, describeThePet);
                omgPets.addPets(superPet7);
                System.out.println("");

            } else if (userInput == 6) {
                System.out.println("");
                System.out.println(" Baby Come Back, I just can't live without you!\n");
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
                System.out.println("             \\  \\_         :         \\     /~~~\\|");
                System.out.println("             /   :~~~~~|   :~~~~~~~~~~|   :     :   :");
                System.out.println("            /    :    /    :         /    :    /    :");
                System.out.println("        (~~~     )(~~~     )     (~~~     )(~~~     )");
                System.out.println("         ~~~~~~~~  ~~~~~~~~       ~~~~~~~~  ~~~~~~~~");
                System.out.println("          STOMP     STOMP          STOMP     STOMP");
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;

            }
            omgPets.tickAllPets();
            omgPets.showPets();
            superPet.printUserInstructions();
        }
        pet.close();

    }

}
