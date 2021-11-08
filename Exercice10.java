public class Exercice10 { 
    public static void main (String[] args) {
        String ref = "Ceci est un message.";
        if (ref.endsWith(".")) {
             System.out.println("La phrase se termine par un point");   
        } else {
            System.out.println("La phrase ne se termine pas par un point");
        }
        String ref2 = "Ceci est un message;";
        if (ref2.endsWith(";")) {
             System.out.println("La phrase se termine par un point virgule");   
        } else {
            System.out.println("La phrase ne se termine pas par un point virgule");
        }
        String ref3 = "Ceci est un message";
        if (ref2.endsWith("")) {
            System.out.println("La phrase ne se termine ni par un point ni par un point virgule");   
       } 
    }
}