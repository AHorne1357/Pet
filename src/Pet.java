//Austin Horne

public class Pet {
    //private data fields
    private String name;
    //public constructors
    public Pet()
    {
        this.setName("Pet Name");
    }
    //public set or mutator method for every private data field
    public void setName(String newName)
    {
        this.name = newName;
    }
    //public get or accessor method for every private data field
    public String getName()
    {
        return this.name;
    }
    //public toString method that that prints out all of the object state
    public String toString()
    {
        String output = "";
        output += "Pet name: ";
        output += this.getName();
        return output;
    }
    //main
    public static void main(String[] args)
    {
        // First Pet object using default constructor
        Pet myPet1 = new Pet();
        myPet1.setName("Fuli");
        System.out.println("Pet information:");
        System.out.println(myPet1);

        Pet myPet2 = new Pet();
        myPet2.setName("Tonka");
        System.out.println("\nPet information");
        System.out.println(myPet2);
    }
}