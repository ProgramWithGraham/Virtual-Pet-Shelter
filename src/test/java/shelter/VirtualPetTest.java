package shelter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    @Test
    public void testFeed() {
        VirtualPet superPet = new VirtualPet(null, null, 0, 0, 0);
        int food = superPet.getHungerLevel();
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

        assertEquals(-1, superPet.getHungerLevel());
        assertEquals(-2, superPet.getThirstLevel());
        assertEquals(-3, superPet.getBoredomLevel());
    }
}
