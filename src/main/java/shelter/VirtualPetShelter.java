package shelter;

import java.util.*;

public class VirtualPetShelter {

    ArrayList<VirtualPet> pets = new ArrayList<VirtualPet>();

    public VirtualPetShelter() {
    }

    public Collection<VirtualPet> getAllPets() {
        return this.pets;
    }

    public ArrayList<VirtualPet> getPets() {
        return this.pets;
    }

    public void setPets(ArrayList<VirtualPet> pets) {
        this.pets = pets;
    }

    public void addPet(VirtualPet addedPet) {
        this.pets.add(addedPet);
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
            if (thisSelectedPet.equalsIgnoreCase(petName))
                selectedPet.playFetch();
            counter++;
        }
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
            if (thisPet.equalsIgnoreCase(petToRemove)) {
                pets.remove(counter);
                counter--;
            }
            counter++;
        }
    }

    public void tickAllPets() {
        for (VirtualPet pet : pets)
            pet.tick();
    }

    public void showPets() {
        System.out.println("Name  | Description      | Hunger    | Thirst | Boredom ");
        for (VirtualPet pet : pets) {
            System.out.println(pet.getPetName() + " | " + pet.getPetDescription() + "  |\t" + pet.getHungerLevel()
                    + "   |\t" + pet.getThirstLevel() + "    |\t" + pet.getBoredomLevel());
        }
    }
}