package shelter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {
    private VirtualPetShelter omgPets;

    @BeforeEach
    public void setup() {
        omgPets = new VirtualPetShelter();

        VirtualPet superPet = new VirtualPet("Krypto", "The Super dog");
        VirtualPet superPet2 = new VirtualPet("Tommy", "Green Power dog");
        VirtualPet superPet3 = new VirtualPet("Billy", "Blue Power dog");
        VirtualPet superPet4 = new VirtualPet("Kimberly", "Pink Power dog");
        VirtualPet superPet5 = new VirtualPet("Jason", "Red Power dog");
        VirtualPet superPet6 = new VirtualPet("Trini", "Yellow Power dog");

        omgPets.addPets(superPet);
        omgPets.addPets(superPet2);
        omgPets.addPets(superPet3);
        omgPets.addPets(superPet4);
        omgPets.addPets(superPet5);
        omgPets.addPets(superPet6);
    }

    @Test
    public void testFeedAll() {
        omgPets = new VirtualPetShelter();
        VirtualPet superPet = new VirtualPet("Krypto", "The Super dog");
        VirtualPet superPet2 = new VirtualPet("Tommy", "Green Power dog");
        VirtualPet superPet3 = new VirtualPet("Billy", "Blue Power dog");
        VirtualPet superPet4 = new VirtualPet("Kimberly", "Pink Power dog");
        VirtualPet superPet5 = new VirtualPet("Jason", "Red Power dog");
        VirtualPet superPet6 = new VirtualPet("Trini", "Yellow Power dog");

        omgPets.addPets(superPet);
        omgPets.addPets(superPet2);
        omgPets.addPets(superPet3);
        omgPets.addPets(superPet4);
        omgPets.addPets(superPet5);
        omgPets.addPets(superPet6);
        omgPets.feedAll();
        assertEquals(85, superPet.getHungerLevel());
        assertEquals(85, superPet2.getHungerLevel());
        assertEquals(85, superPet3.getHungerLevel());
        assertEquals(85, superPet4.getHungerLevel());
        assertEquals(85, superPet5.getHungerLevel());
        assertEquals(85, superPet6.getHungerLevel());

    }

    @Test
    public void testGiveAllWater() {
        omgPets = new VirtualPetShelter();
        VirtualPet superPet = new VirtualPet("Krypto", "The Super dog");
        VirtualPet superPet2 = new VirtualPet("Tommy", "Green Power dog");
        VirtualPet superPet3 = new VirtualPet("Billy", "Blue Power dog");
        VirtualPet superPet4 = new VirtualPet("Kimberly", "Pink Power dog");
        VirtualPet superPet5 = new VirtualPet("Jason", "Red Power dog");
        VirtualPet superPet6 = new VirtualPet("Trini", "Yellow Power dog");

        omgPets.addPets(superPet);
        omgPets.addPets(superPet2);
        omgPets.addPets(superPet3);
        omgPets.addPets(superPet4);
        omgPets.addPets(superPet5);
        omgPets.addPets(superPet6);
        omgPets.giveAllWater();
        assertEquals(85, superPet.getThirstLevel());
        assertEquals(85, superPet2.getThirstLevel());
        assertEquals(85, superPet3.getThirstLevel());
        assertEquals(85, superPet4.getThirstLevel());
        assertEquals(85, superPet5.getThirstLevel());
        assertEquals(85, superPet6.getThirstLevel());
    }

    @Test
    public Void testTickAllPets() {
        omgPets = new VirtualPetShelter();
        VirtualPet superPet = new VirtualPet("Krypto", "The Super dog");
        VirtualPet superPet2 = new VirtualPet("Tommy", "Green Power dog");
        VirtualPet superPet3 = new VirtualPet("Billy", "Blue Power dog");
        VirtualPet superPet4 = new VirtualPet("Kimberly", "Pink Power dog");
        VirtualPet superPet5 = new VirtualPet("Jason", "Red Power dog");
        VirtualPet superPet6 = new VirtualPet("Trini", "Yellow Power dog");

        omgPets.addPets(superPet);
        omgPets.addPets(superPet2);
        omgPets.addPets(superPet3);
        omgPets.addPets(superPet4);
        omgPets.addPets(superPet5);
        omgPets.addPets(superPet6);

        omgPets.tickAllPets();

        assertEquals(-2, superPet.getHungerLevel());
        assertEquals(-2, superPet.getThirstLevel());
        assertEquals(-2, superPet.getBoredomLevel());
        assertEquals(-2, superPet2.getHungerLevel());
        assertEquals(-2, superPet2.getThirstLevel());
        assertEquals(-2, superPet2.getBoredomLevel());
        assertEquals(-2, superPet3.getHungerLevel());
        assertEquals(-2, superPet3.getThirstLevel());
        assertEquals(-2, superPet3.getBoredomLevel());
        assertEquals(-2, superPet4.getHungerLevel());
        assertEquals(-2, superPet4.getThirstLevel());
        assertEquals(-2, superPet4.getBoredomLevel());
        assertEquals(-2, superPet5.getHungerLevel());
        assertEquals(-2, superPet5.getThirstLevel());
        assertEquals(-2, superPet5.getBoredomLevel());
        assertEquals(-2, superPet6.getHungerLevel());
        assertEquals(-2, superPet6.getThirstLevel());
        assertEquals(-2, superPet6.getBoredomLevel());
    }

}
