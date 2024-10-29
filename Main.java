//Importering af Arraylist
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Arrayliste for vores objekter, hvor vi initialisere dem.
        ArrayList<Characters> characters = new ArrayList<>();

        //Tilføjelse af karakterer ind i vores arraylist med navn og alder (objekter)
        characters.add(new Jedi("Obi-Wan-Kenobi ",35));
        characters.add(new Jedi("Luke Skywalker ",20));
        characters.add(new Sith("Darth vader ", 50));
        characters.add(new Sith("Palpatine ",40));
        characters.add(new Droid("C3PO ",16));
        characters.add(new Droid("R2-D2 ",5));

        // for løkke til at kalde metoden "action" på dem alle.
        for(Characters character : characters){
            character.action();
        }

    }
}