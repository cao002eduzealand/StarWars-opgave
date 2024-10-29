//underklasse for Characters klassen
public class Sith extends Characters {

    // kontruktør til Jedi klassen, som er kaldt fra superklassen.
    public Sith(String name, int age) {
        super(name, age);
    }

    //overrider action() metoden fra superklassen for alle Sith objekter
    @Override
    public void action() {
        System.out.println(name+ "uses the force for evil");
    }
}
