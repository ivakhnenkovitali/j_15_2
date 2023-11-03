package model;

public class PetList {
    private static int MAX_SIZE = 5;
    private Pet[] pets = new Pet[MAX_SIZE];
    private int currentIndex = 0;

    public void add(Pet pet) throws OverflowPetListException {
        if (pet != null) {
            if (currentIndex == MAX_SIZE) throw new OverflowPetListException();
            pets[currentIndex++] = pet;
        }
    }

    public void show() {
        System.out.println("list:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(pets[i]);

        }
    }
}
