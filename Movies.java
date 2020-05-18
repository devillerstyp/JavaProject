package Movies;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Movies {
    public static void main(String[] args) {
        //Tableau des titres de films
        String[] filmsTitles =
                {
                        "Indian Jones et le temple maudit",
                        "Indian Jones et le royaume du crâne de cristal",
                        "JurrassiK Park",
                };

        //Tableau des acteurs principaux ayant joués dans ces films

        String[][] actorsFilms =
                {
                        {"Harrison Ford, Kate Capshaw, John K.Q."},
                        {"Harrison Ford, Karen Allen, Paul Freeman."},
                        {"Sam Neill, Laura Dern, Jeff G."}
                };
        // Boucle pour afficher la liste des titres de films, ainsi que les acteurs associés

        // Première méthode avec une boucle en utilisant Array.toString
        /*
        for(int  i = 0 ; i < filmsTitles.length; i++){
            System.out.println("Dans le film: "+ filmsTitles[i] + ", les principaux acteurs sont : "+ Arrays.toString(actorsFilms[i]));
        }

         */

        //Deuxieme méthode avec deux boucles
        for (int i = 0; i < filmsTitles.length ; i++) {
            System.out.print("Dans le film " + filmsTitles[i] + ", " );
            for (int j = 0; j < actorsFilms[i].length; j++) {
                System.out.print("les principaux acteurs sont : " + actorsFilms[i][j]);
                System.out.println(" ");
            }
            System.out.println(" ");
        }


    }

}

