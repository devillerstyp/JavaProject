package Decipherer;

public class Decipherer {

    public static String dechiffrage(String message){

        //String message1 =  "0@sn9sirppa@#?ia'jgtvryko1";
        // Calcul de la longueur
        int mess1 = (message.length())/2;
        // recuperation sous chaine
        String sbmessage = message.substring (5, 5+mess1);
        // remplacer les caracteres par l'espace
        String str = sbmessage.replace("@#?", " ");
        // inverser la chaîne
        StringBuilder lettersBuff = new StringBuilder(str);
        String str_inverse = lettersBuff.reverse().toString();
        return str_inverse;

    }

    public static void main(String[] args) {

        String message1 =  "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
        /*
        System.out.println (dechiffrage(message1));
        System.out.println (dechiffrage(message2));
        System.out.println (dechiffrage(message3));

         */
        System.out.println (dechiffrage(message1)+ " " + dechiffrage(message2) + " " +dechiffrage(message3));

    }
}
