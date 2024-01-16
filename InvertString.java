import java.util.*;
public class  InvertString{
    //declaration d'un attribut
    String s;
    public static void main(String[] args) {
        // creation d'un objet 
        InvertString chaine= new InvertString();
        //appel de scanner  pour gerer les entrée
        Scanner sc=null;
        sc=new Scanner(System.in);
        System.out.println("Entrer votre chaine");
        chaine.s=sc.nextLine();
         /*utilisation de Stringbuilder qui permet de creer des objets chaine et 
         l'accees a certains methode deja definis comme tostring et reverse */
        StringBuilder chaine_inverse=new StringBuilder(chaine.s) .reverse();
        System.out.println("Apres inversion ca donne: "+chaine_inverse.toString());
        
    }
}