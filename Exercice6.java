public class Exercice6 {
    public static void main (String[] args) {
        for (int i=1;i<10;i++) {
            for (int j=1;j<10;j++) {
                if (j*i<10){
                    System.out.print(" ");
                }
                 System.out.print(j  * i + " ");
            }
            System.out.println();
        }

    }
} 