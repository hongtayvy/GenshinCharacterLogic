import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List<Character> teamOne = new ArrayList();
        List<Character> teamTwo = new ArrayList();

        //Making a new Character Object
        Character diluc = new Character("Diluc", "Ragnvindr", "Pyro", "Claymore");
        Character venti = new Character("Venit", "", "Anemo", "Bow");
        Character ayaka = new Character("Ayaka", "Kamisato", "Cyro", "Sword");
        Character ayato = new Character("Ayato", "Kamisato", "Hydro", "Sword");

        teamOne.add(diluc);
        teamOne.add(venti);

        teamTwo.add(ayaka);
        teamTwo.add(ayato);

        printTeam(teamOne);
        printTeam(teamTwo);

        System.out.println("Updating element for Venti...He is currently: " + venti.getElementType());
        venti = updateElement(venti, "Hydro");
        System.out.println("Venit is now: " + venti.getElementType());
    }

    private static void printTeam(List<Character> teamList){
        for(int i = 0; i < teamList.size(); i++){
            //This will get the character at the corresponding index
            //characterList.get(i) is a SINGULAR Character Object
            System.out.println(teamList.get(i).toString());
        }
    }

    private static Character updateElement(Character character, String newElement){
        character.setElementType(newElement);
        return character;
    }
}
