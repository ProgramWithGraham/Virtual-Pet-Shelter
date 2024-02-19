package shelter;

/*
 * In addition to the requirements from last week's project:

 include instance variables representing:
 name (from the above example, this might be "Tommy")
 description (from the above example, this might be "smells like a Stargazer lily fresh with morning dew")
 include a constructor that accepts a name and description
 include a constructor that, in addition to name and description, accepts default values for the pet's attributes (hunger, boredom, etc)
 Do not include a default (zero arguments) constructor.
 */
public class VirtualPet extends VirtualPetShelter {
    private String petName;
    private String petDescription;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    public VirtualPet(String petName, String petDescription, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.hungerLevel = 60;
        this.thirstLevel = 60;
        this.boredomLevel = 60;
    }

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
    }

    public void printUserInstructions() {
        System.out.println(" ");
        System.out.println("Please enter a number input from the following options: ");
        System.out.println(" 1. Give your pet some Food");
        System.out.println(" 2. Give your pet some Water");
        System.out.println(" 3. Play with your selected virtual pet");
        System.out.println(" 4. Adopt a pet");
        System.out.println(" 5. Admit a pet");
        System.out.println(" 6. End the program");
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetDescription() {
        return this.petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public int getHungerLevel() {
        return this.hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getThirstLevel() {
        return this.thirstLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public int getBoredomLevel() {
        return this.boredomLevel;
    }

    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }

    public void feed() {
        this.hungerLevel -= 10;
    }

    public void giveWater() {
        this.thirstLevel -= 10;
    }

    public void playFetch() {
        this.boredomLevel -= 10;
    }

    // @Override
    public String toString() {
        String petDetails = this.petName + ", " + this.petDescription + " - stats are:  " + "Hunger: "
                + this.hungerLevel
                + "  Thirst: "
                + this.thirstLevel + "  Boredom: " + this.boredomLevel;
        return petDetails;
    }

    public void tick() {
        this.hungerLevel += 2;
        this.thirstLevel += 2;
        this.boredomLevel += 2;
        // increase this calling objects thirst, hunger, boredom
    }

}
