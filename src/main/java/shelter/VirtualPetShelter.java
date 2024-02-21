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

    public Collection<VirtualPet> getAllPets() {
        return pets;
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
            System.out.println(pet.getPetName() + " " + pet.getPetDescription());
        }
    }

    public void removePet(String petToRemove) {
        int counter = 0;
        while (counter < pets.size()) {
            VirtualPet petAtThisIndex = pets.get(counter);
            String thisPet = petAtThisIndex.getPetName();
            if (thisPet.equals(petToRemove)) {
                pets.remove(counter);
                counter--;
            }
            counter++;
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

    public void playWithSelectedPet(String petName) {
        int counter = 0;
        while (counter < pets.size()) {
            VirtualPet selectedPet = pets.get(counter);
            String thisSelectedPet = selectedPet.getPetName();
            if (thisSelectedPet.equals(petName))
                selectedPet.playFetch();
            counter++;
        }
    }

    public void tickAllPets() {
        for (VirtualPet pet : pets)
            pet.tick();
    }

    public void showPets() {
        System.out.println("Name\t | Description         | Hunger    | Thirst | Boredom ");
        for (VirtualPet pet : pets) {
            System.out.println(pet.getPetName() + " |\t" + pet.getPetDescription() + "  |\t" + pet.getHungerLevel()
                    + " |\t" + pet.getThirstLevel() + "  |\t" + pet.getBoredomLevel());
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
