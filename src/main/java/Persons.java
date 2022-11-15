public class Persons {
    //Attributter
    private String name;
    private int age;
    private double height;
    private String køn;
    private boolean humanOrNot;

    //Konstruktør
    public Persons (String name, int age, double height, String køn, boolean humanOrNot){
        this.name = name;
        this.age = age;
        this.height = height;
        this.køn = køn;
        this.humanOrNot = humanOrNot;
    }
    //Get metode
    public String getName(){
      return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight (){
        return height;
    }
    public String getKøn(){
        return køn;
    }
    public boolean ishumanOrNot(){
        return ishumanOrNot();
    }
    //Set metoder
    public void setName(String name){
        name = name;
    }
    public void setAge(int age){
        age = age;
    }
    public void setHeight(double height){
        height = height;
    }
    public void setKøn(String køn){
        køn = køn;
    }
    public void sethumanOrNot(boolean humanOrNot){
        humanOrNot = humanOrNot;
    }

    //ToString metode, så vi kan få noget output i consolen
    @Override
    public String toString() {
        return "Persons:" + "name: " + name + '\'' + ", age: " + age + ", height: " + height + ", køn: " + køn + '\'' +
                ", HumanOrNot: " + humanOrNot;
    }
}
