//Superklassen "Characters"
class Characters {

    //protected variabler som kun superklassen og underklasser kun få fat i.
protected String name;
protected int age;

    // Kontruktør til at oprette forskellige karakterer.
    public Characters(String name, int age){
        this.name = name;
        this.age = age;
    }
//Metoden der bliver kaldt, hvis superklassen ikke overskrives af underklassen
    public void action(){
        System.out.println("enemy attacks");

    }


}

