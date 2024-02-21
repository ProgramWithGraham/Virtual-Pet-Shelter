package shelter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    @BeforeEach
    public void setup() {
        // VirtualPet superPet = new VirtualPet(null, null, 0, 0, 0);

    }

    @Test
    public void testGiveFood() {
        VirtualPet superPet = new VirtualPet(null, null, 0, 0, 0);
        int food = superPet.getHungerLevel();
        superPet.giveFood();
        assertEquals(10, food);
    }

    @Test
    public void testGiveWater() {
        VirtualPet superPet = new VirtualPet(null, null, 0, 0, 0);
        int food = superPet.getHungerLevel();
        assertEquals(10, food);
    }

    @Test
    public void testPlayFetch() {
        VirtualPet superPet = new VirtualPet(null, null, 0, 0, 0);
        int food = superPet.getHungerLevel();
        assertEquals(10, food);
    }

    @Test
    public void testTick() {
        VirtualPet superPet = new VirtualPet(null, null, 0, 0, 0);
        superPet.tick();

        assertEquals(-2, superPet.getHungerLevel());
        assertEquals(-2, superPet.getThirstLevel());
        assertEquals(-2, superPet.getBoredomLevel());
    }
}
