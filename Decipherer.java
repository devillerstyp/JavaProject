package Decipherer;

public class Decipherer {

    public static String dechiffrage(String message) {
        if (message.equals("0@sn9sirppa@#?ia'jgtvryko1")) {
            String message1 =  "0@sn9sirppa@#?ia'jgtvryko1";
            // Calcul de la longueur
            int mess1 = (message1.length())/2;
            // recuperation sous chaine
            String sbmessage1 = message1.substring (6, mess1);
            // remplacer les caracteres par l'espace
            String str1 = sbmessage1.replaceAll("@#?", "");
            // inverser la chaîne
            StringBuilder lettersBuff1 = new StringBuilder(str1);
            String str_inverse1 = lettersBuff1.reverse().toString();
            return str_inverse1;

        }
        if (message.equals("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj")) {
            String message2 =  "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
            int mess2 = (message2.length())/2;
            String sbmessage2 = message2.substring (6, mess2);

            String str2 = sbmessage2.replace("@#?", " ");

            StringBuilder lettersBuff2 = new StringBuilder(str2);
            String str_inverse2 = lettersBuff2.reverse().toString();
            return str_inverse2;

        }
        if (message.equals("aopi?sedohtém@#?sedhtmg+p9l!")) {
            String message3 =  "aopi?sedohtém@#?sedhtmg+p9l!";
            int mess3 = (message3.length())/2;
            String sbmessage2 = message3.substring (6, mess3);

            String str3 = sbmessage2.replaceAll("@#?", " ");

            StringBuilder lettersBuff3 = new StringBuilder(str3);
            String str_inverse3 = lettersBuff3.reverse().toString();
            return str_inverse3;

        }
        return message;

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
        System.out.println (dechiffrage(message1) + dechiffrage(message2) + " " +dechiffrage(message3));

    }


}
