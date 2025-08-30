package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Integer choice;

        while (true) {
            System.out.println("Choose a pet type:");
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.println("\nChoose your pet number: ");
            choice = input.nextInt(); input.nextLine();

            switch(choice) {
                case 1: 
                    PetRecord dogPet = new PetRecord("Dog");
                    Pet dog = new Dog(dogPet);
                    System.out.println(dog.getPetDetails());
                    break;

                case 2:
                    PetRecord catPet = new PetRecord("Cat");
                    Pet cat = new Cat(catPet);
                    System.out.println(cat.getPetDetails());
                    break;

                case 3: 
                    System.out.println("End of the program.");
                    input.close();
                    return;

                default: 
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}