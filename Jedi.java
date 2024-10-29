//underklasse for Characters
public class Jedi extends Characters{

    // kontruktør til Jedi klassen, som er kaldt fra superklassen.
    public Jedi(String name, int age){
        super(name, age);
    }

    //overrider action() metoden for alle Jedi objekter.
    @Override
    public void action() {
        System.out.println(name+ "uses the force for good");
    }
}
