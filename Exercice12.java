import java.util.Scanner;
public class Exercice12 { 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String messageEntreAuClavier = sc.next();
        System.out.println(messageEntreAuClavier);
        boolean isfoundE12 = false;
        while(!isfoundE12) {
            String testE12 = sc.nextLine();
            if(testE12.equals("exits")){
                isfoundE12 = true;
            }
        }
            System.out.println("Finish");
    }
}