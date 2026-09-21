import java.util.Scanner;

public class Runner {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // First Pet object
        Pet myPet1 = new Pet();
        System.out.println(myPet1);

        //Second Pet object
        Pet myPet2 = new Pet("Buster", "Dog", 11);
        System.out.println("\n" + myPet2);

        System.out.println("\nEnter animal type:");
        String userType = input.nextLine();

        System.out.println("Enter animal name:");
        String userName = input.nextLine();

        System.out.println("Enter animal age:");
        int userAge = input.nextInt();

        Pet myPet3 = new Pet(userName, userType, userAge);
        System.out.println("\n" + myPet3);

        input.close();
    }
}
