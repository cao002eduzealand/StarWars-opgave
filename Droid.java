//Underklasse for Characters"
class Droid extends Characters {
    // konstruktør bliver kaldt fra superklassen "Characters".
    public Droid(String name, int age) {
        super(name, age);
    }
//Overskriver action() metoden fra superklassen "Characters" for alle Droid objekter
    @Override
    public void action() {
        System.out.println(name+ "is very supportive, and helps with maintance on other machines");
    }
}
