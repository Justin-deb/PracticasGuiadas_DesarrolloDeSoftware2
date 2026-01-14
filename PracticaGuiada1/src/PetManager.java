public class PetManager {
    @SuppressWarnings("unused")
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
        return false; //should throw OutOfBoundsException("Max reached");
    }

    public boolean removePet(Pet pet){
        for(int i = 0; i < pets.length; i++){
            if(pets[i] != null && pets[i].equals(pet)){
                for(int j = i; j < pets.length - 1; j++){
                    pets[j] = pets[j+1];
                }
                pets[pets.length - 1] = null;
                counter--;
                return true;
            }
        }
        return false; //should throw Exception("Pet not found"); or equivalent
    }

    public boolean updatePets(Pet pet, int index){
        if(index >= counter || index < 0) return false;
        if(pet == null) return false;

        pets[index] = pet;
        return true;
    }

    public Pet[] getPets(){
        Pet[] pets = new Pet[this.counter];

        for(int i = 0; i < this.counter; i++){
            pets[i] = this.pets[i];
        }

        return pets;
    }
}