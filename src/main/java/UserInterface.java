
import java.util.Scanner;

public class UserInterface {
    private int user;
    private Scanner sc = new Scanner(System.in); //Scanner, så vi kan lave noget input
    private boolean gameRunning = true; //Attribut, så længe gamerunning er true, vil programmet køre
    private Controller controller = new Controller();

    public void startProgram() {
        System.out.println("""
                Welcome To The Person Universe!
                1: Add a person
                2: Delete a person
                3: Search for person/persons
                4: Display persons/person
                5: Change persons
                9: Exit program
                """);
        while (gameRunning) {
            int userInput = sc.nextInt(); // Variablen userinput, som er i switch casen. (Det er en integer)
            switch (userInput) {
                case 1:
                    System.out.println("What is the persons name?");
                    String name = sc.nextLine().toLowerCase();
                    sc.nextLine();
                    System.out.println("How old is your person?");
                    int age = sc.nextInt();
                    System.out.println("How tall is your person?");
                    double height = sc.nextInt();
                    System.out.println("Which gender is your person W/M?");
                    String gender = sc.nextLine().toLowerCase();
                    sc.nextLine();
                    System.out.println("Is your person a human?");
                    String humanOr = sc.nextLine().toLowerCase();
                    controller.database.addPersons(name, age, height, gender, Boolean.parseBoolean(humanOr)); //Her tilføjer
                    //vi til vores arraylist, som er i database klassen
                    break;
                case 2:
                    if (controller.database.getPersons().isEmpty()) {//Hvis der ikke findes personer i databasen, så print...
                        System.out.println("No persons is found in the database");
                    } else {
                        System.out.println("Choose the person that you want to delete: \n");
                        for (Persons persons : controller.database.getPersons()) {  //For-Each loop
                            System.out.println(controller.database.getPersons().indexOf(persons) + 1 + " " + persons.getName());
                        }
                        int r = readInt();
                        int n = readInt();
                        switch (n){
                            case 1:
                                controller.database.deletePerson(r);
                                break;
                            default:
                                System.out.println("Please, try again!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the persons name, that you want to search for");
                    String searchP = sc.nextLine();
                    Persons persons = controller.database.searchForPersons(searchP); //Metode og klasse kald i et
                    break;
                case 4:
                    //Something here
                    break;
                case 5:
                    //Something here
                    break;
                case 9:
                    System.out.println("Ending the program.....");
                    gameRunning = false; //Da gamerunning er sat til at være true, vil den stoppe da den er false her
                    break;
                default:
                    System.out.println("Wrong input! please try again");

            }
        }
    }
    public int readInt() { //En exception for integer
        while (!sc.hasNextInt()) {
            String text = sc.next();
            System.out.println(text + " " + "Invalid data, enter a valid integer.");
        }
        return sc.nextInt();
    }
}

