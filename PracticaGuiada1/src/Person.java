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


}