import java.util.ArrayList;

public class Database {
    private ArrayList <Persons> persons = new ArrayList<>(); //Arraylist for personer, så vi kan gemme data

    public Persons searchForPersons(String name){ //Metode med for-each loop, til at søge efter personer
        for (Persons persons1 : persons){ //persons med småt er variabel navnet for vores arraylist
            if (persons1.getName().equals(name)){
                return persons1; //persons1 er variablen i for-each loopet
            }
        }
        return null;
    }
    //An add method to my persons arraylist
    public void addPersons(String name, int age, double height, String køn, boolean humanOrNot){
        Persons persons1 = new Persons(name, age, height, køn, humanOrNot);
        persons.add(persons1);
    }
    public ArrayList <Persons> getPersons(){ //Get metode til arraylisten
        return persons;
    }
}
