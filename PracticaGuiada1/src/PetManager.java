public class PetManager {
    private int counter;
    private Pet[] pets;
    
    public PetManager(int numberPets) {
        this.pets = new Pet[numberPets];
    }

    public boolean addPet(Pet pet){
        for(int i = 0; i < pets.length; i++){
            if(pets[i] == null){
                pets[i] = pet;
                counter++;
                return true;
            }
        }
        return false;
    }
}