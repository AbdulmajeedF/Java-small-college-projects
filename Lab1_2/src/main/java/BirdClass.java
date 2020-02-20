interface Human {
    void showHumanCharacter ();
}
interface Animal {
    void showAnimalCharacter ();
}
public class BirdClass implements Human, Animal {
    public void showHumanCharacter(){
        System.out.println("I am bird, I can walk like a human");
    }
    public void showAnimalCharacter(){
        System.out.println("I am bird, I can fly like an Animal");
    }
   
}
