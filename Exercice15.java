public class Exercice15 { 
    public static void main (String[] args) {
        int var = Integer.parseInt(new String("15"));
        boolean test = Boolean.parseBoolean(new String("TRUE"));
        boolean test1 = Boolean.parseBoolean(new String("false"));
        boolean test2 = Boolean.parseBoolean(new String("azerty"));
        boolean test3 = Boolean.parseBoolean(new String("False"));
        boolean test4 = Boolean.parseBoolean(new String("FALsE"));
        boolean test5 = Boolean.parseBoolean(new String("n'importe quoi !"));
        String str1 = new Integer(5).toString();
        System.out.print(str1);
        String str2 = new Character('c').toString();
        System.out.print(str2);
    }
}  