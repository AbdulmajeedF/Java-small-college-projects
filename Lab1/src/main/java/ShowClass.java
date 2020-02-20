interface startingShow {
    void printStartingShow();
} 
interface endingShow {
    void printEndingShow ();
}
public class ShowClass implements startingShow, endingShow {


    public void printStartingShow (){
        System.out.println("Hello");
    }
    public void printEndingShow () {
        System.out.println("Welcome");
    }
    
}
