package factoryPattern;

public class Cat implements Pet {
    private PetRecord pet;

    public Cat(PetRecord pet) 
    {
        this.pet = pet;
    }

    public String getPetDetails() 
    {
        return "Number of Lives of a cat: 9.";
    }
}