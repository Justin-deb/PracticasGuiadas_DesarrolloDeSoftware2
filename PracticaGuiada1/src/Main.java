public class Main{
    public static void main(String[] args) {
        // int[] numbers = {10,20,30,40,50};

        // String[] fruits = new String[3];

        // System.out.println(numbers[1] + fruits[1]);

        Person p = new Person("Juan", 10, 2);

        // System.out.println(p.getPets());

        // for(Pet pet : p.getPets()){
        //     System.out.println(pet.getPetName());
        // }

        Pet pet1 = new Pet("Goldie","Fish");

        if(p.addPet(pet1)){
            IOManager.printMessage("Pet added successfully.");
        }else{
            IOManager.printMessage("Failed to add pet");
        }

        if(p.getPets().length == 0){
            IOManager.printMessage("No pets found");
        }else{    
            for (Pet pet : p.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }
        
        Pet pet2 = new Pet("Carlos", "Humano");
        if(p.updatePet(pet2, 0)){
            IOManager.printMessage("Updated pet successfully");
        }else{
            IOManager.printMessage("Failed to update pet");
        }


        if(p.getPets().length == 0){
            IOManager.printMessage("No pets found");
        }else{    
            for (Pet pet : p.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }

        if(p.removePet(pet2)){
            IOManager.printMessage("Pet remove successfully");
        }else{
            IOManager.printMessage("Failed to remove pet");
        }

    }
}