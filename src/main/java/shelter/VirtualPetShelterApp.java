package shelter;

import java.util.*;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner doggies = new Scanner(System.in);
        System.out.println(
                "\n Welcome to the grand ole world of Virtual Pets. Your goal is to keep your pets satisfied with Food, Water and Play. The higher the number the better your pet is doing. \n");
        VirtualPet superPet = new VirtualPet("Krypto", "The Super dog");
        VirtualPet superPet2 = new VirtualPet("Tommy", "Green Power dog");
        VirtualPet superPet3 = new VirtualPet("Billy", "Blue Power dog");
        VirtualPet superPet4 = new VirtualPet("Kimberly", "Pink Power dog");
        VirtualPet superPet5 = new VirtualPet("Jason", "Red Power dog");
        VirtualPet superPet6 = new VirtualPet("Trini", "Yellow Power dog");

        VirtualPetShelter omgPets = new VirtualPetShelter();
        omgPets.addPet(superPet);
        omgPets.addPet(superPet2);
        omgPets.addPet(superPet3);
        omgPets.addPet(superPet4);
        omgPets.addPet(superPet5);
        omgPets.addPet(superPet6);

        omgPets.showPets();
        superPet.printUserInstructions();
        while (true) {
            int userInput = doggies.nextInt();
            if (userInput == 1) { // This is used to increase the Hunger level for all pets
                omgPets.feedAll();
                System.out.println("\nYou have given all pets some food.\n");
            } else if (userInput == 2) { // This is used to increase the Thirst level for all pets
                omgPets.giveAllWater();
                System.out.println("\nYou have given all pets some water.\n");
            } else if (userInput == 3) { // This is used to increase the boredom level for only the selected pet
                omgPets.findPet();
                doggies.nextLine();
                System.out.println("\nPlease type the pet name from the above list that you want to play with");
                String chooseAPet = doggies.nextLine();
                omgPets.playWithSelectedPet(chooseAPet);
                System.out.println("\nYou have played with " + chooseAPet + "\n");
            } else if (userInput == 4) { // This is to remove a pet from the shelter
                omgPets.findPet();
                doggies.nextLine();
                System.out.println("\nPlease type the pet name from the above list that you want to adopt");
                String petToRemove = doggies.nextLine();
                System.out.println("You have adopted " + " " + petToRemove + "\n");
                omgPets.removePet(petToRemove);
            } else if (userInput == 5) { // This is to add a new pet per user's choice pet name and description
                doggies.nextLine();
                System.out.println("\nWhat name do you want your new pet to have?");
                String namingThePet = doggies.nextLine();
                System.out.println("What is your description of your pet in three words?");
                String describeThePet = doggies.nextLine();
                System.out.println(" You have admitted a pet.");
                VirtualPet superPet7 = new VirtualPet(namingThePet, describeThePet);
                omgPets.addPet(superPet7);
                System.out.println("");
            } else if (userInput == 6) { // End the program
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
        doggies.close();
    }
}
