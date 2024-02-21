package shelter;

import java.util.*;

public class VirtualPetShelter {

    ArrayList<VirtualPet> pets = new ArrayList<VirtualPet>();

    // public VirtualPetShelter(String petName, String petDescription, int
    // hungerLevel, int thirstLevel,
    // int boredomLevel) {
    // super(petName, petDescription, hungerLevel, thirstLevel, boredomLevel);
    // }
    public VirtualPetShelter() {

    }

    public ArrayList<VirtualPet> getPets() {
        return this.pets;
    }

    public void setPets(ArrayList<VirtualPet> pets) {
        this.pets = pets;
    }

    public void addPets(VirtualPet addedPets) {
        this.pets.add(addedPets);
    }

    public void findPet() {
        for (VirtualPet pet : pets) {
            System.out.println(pet.getPetName() + pet.getPetDescription());
        }
    }

    public void feedAll() {
        for (VirtualPet pet : pets)
            pet.giveFood();
    }

    public void giveAllWater() {
        for (VirtualPet pet : pets)
            pet.giveWater();
    }

    public void playWithAPet(String petName) {
        for (VirtualPet pet : pets)
            pet.playFetch();
    }

    public void tickAllPets() {
        for (VirtualPet pet : pets)
            pet.tick();
    }

    public void showPets() {
        System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
        for (VirtualPet pet : pets) {
            System.out.println(pet.getPetName() + " | " + pet.getPetDescription() + "   | " + pet.getHungerLevel()
                    + "    | " + pet.getThirstLevel() + "     |  " + pet.getBoredomLevel() + " |");
        }
        // allows the user to house and care for a collection of pets.
        /*
         * include appropriate instance variable(s) to store the pets who reside at the
         * shelter
         * include methods that:
         * done? return a Collection of all of the pets in the shelter
         * return a specific VirtualPet given its name
         * allow intake of a homeless pet (adding a pet to the shelter)
         * allow adoption of a homeless pet (removing a pet from the shelter)
         * DONEfeed all of the pets in the shelter
         * DONE water all of the pets in the shelter
         * plays (or performs some other interaction(s)) with an individual pet in the
         * shelter
         * DONE include a tick method that calls the tick method for each of the pets in
         * the shelter, updating their needs
         */
    }
}
