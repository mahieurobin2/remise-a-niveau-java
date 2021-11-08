public class Exercice18 { 
    public static void main (String[] args) {
        int var = Integer.parseInt(new String("15"));
        String stringValue = "12.34";
        double doubleValue = Double.parseDouble(stringValue);
        System.out.println("Converted value: "+doubleValue);
        boolean test = Boolean.parseBoolean(new String("TRUE"));
        System.out.println(test);
    }
}