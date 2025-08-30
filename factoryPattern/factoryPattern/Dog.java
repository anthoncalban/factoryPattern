package factoryPattern;

public class Dog implements Pet {
    private PetRecord pet;

    public Dog(PetRecord pet)
    {
        this.pet = pet;
    }

    public String getPetDetails() 
    {
        return "Dog, breed: Golden Retriever";
    }
}