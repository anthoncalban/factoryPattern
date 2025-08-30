package factoryPattern;

public class PetRecord {
    private String petType;
    
    public PetRecord(String petType)
    {
        this.petType = petType;
    }

    public String getPetType() 
    {
        return petType;
    }

    public void setPetType(String petType)
    {
        this.petType = petType;
    }
}
