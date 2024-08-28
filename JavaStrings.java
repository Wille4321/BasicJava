
public class JavaStrings {

    public static void main(String args[]) {
        // String variable called greetings
        String greetings = "Hello";
        System.out.println(greetings);
        
        //Length of a text
        /*
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        */
        //Upper/Lower Case
        /*
        String txt = "Hello Class";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        */
        //Obs räknar white space med
        /*
        String txt2 = "The length of the txt string is";
        System.out.println(txt2.indexOf("o"));
        */
        
        /*
        String txt3 = "we are coding today \"coding\"";
        System.out.println(txt3);
        */
        String txt4 = "we are coding \ntoday";
        // \t tab space
        String txt5 = "we are coding \ttoday";
        System.out.println(txt4);
        System.out.println(txt5);
        
    }
}
