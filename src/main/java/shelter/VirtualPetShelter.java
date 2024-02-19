package shelter;

import java.util.Collections;
import java.util.ArrayList;

public class VirtualPetShelter {

    ArrayList<VirtualPet> pets = new ArrayList<VirtualPet>();

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

    public void showPets() {
        System.out.println("Name    | Description   | Hunger | Thirst | Boredom |");
        for (VirtualPet pet : pets) {
            System.out.println(pet.getPetName() + " | " + pet.getPetDescription() + "   | " + pet.getHungerLevel()
                    + "    | " + pet.getThirstLevel() + "     |  " + pet.getBoredomLevel() + " |");
        }
        // allows the user to house and care for a collection of pets.
        /*
         * include appropriate instance variable(s) to store the pets who reside at the
         * shelter
         * include methods that:
         * return a Collection of all of the pets in the shelter
         * return a specific VirtualPet given its name
         * allow intake of a homeless pet (adding a pet to the shelter)
         * allow adoption of a homeless pet (removing a pet from the shelter)
         * feed all of the pets in the shelter
         * water all of the pets in the shelter
         * plays (or performs some other interaction(s)) with an individual pet in the
         * shelter
         * include a tick method that calls the tick method for each of the pets in the
         * shelter, updating their needs
         */
    }
}
