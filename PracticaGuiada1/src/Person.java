public class Person{
    private String name;
    private int age;
    private PetManager manager;
    
    public Person(String name, int age, int numberPets) {
        this.name = name;
        this.age = age;
        this.manager = new PetManager(numberPets);
    }

    public boolean addPet(Pet pet){
        return manager.addPet(pet);
    }

    public boolean removePet(Pet pet){
        return manager.removePet(pet);
    }

    public boolean updatePet(Pet pet, int index){
        return manager.updatePets(pet, index);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetManager getPetManager(){
        return manager;
    }

    public Pet[] getPets(){
        return manager.getPets();
    }
}