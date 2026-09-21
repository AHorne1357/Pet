//Austin Horne

public class Pet {
    //private data fields
    private String name;
    private String type;
    private int age;

    //constructors
    public Pet()
    {
        this.setName("Pet Name");
        this.setType("Animal");
        this.setAge(1);
    }

    //custom constructor
    public Pet(String newName, String newType, int newAge){
        this.setName(newName);
        this.setType(newType);
        this.setAge(newAge);
    }

    //Setters
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setType(String newType){
        this.type = newType;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }

    //Getters
    public String getName()
    {
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getAge(){
        return this.age;
    }

    //Speak method
    public String speak(){
        if (this.type.equalsIgnoreCase("dog")){
            return "Woof";
        } else if (this.type.equalsIgnoreCase("cat")){
            return "Meow";
        } else{
            return "Noise";
        }
    }

    //public toString method
    public String toString()
    {
        String output = "";
        output += "Pet information:\n";
        output += "Type: " + this.getType() + "\n";
        output += "Name: " + this.getName() + "\n";
        output += "Sound: " + this.speak() + "\n";
        output += "Age: " + this.getAge() + "\n";
        return output;
    }
}