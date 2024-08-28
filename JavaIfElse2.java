
public class JavaIfElse2 {

    public static void main(String args[]) {
        int time = 20;
        if(time < 18){
            System.out.println("Good day");
        } else{
            System.out.println("Good evening");
        }
    
        //option2
        String result = (time< 18)? "Good day" : "Good evening";
        System.out.println(result);
    
        //Example on Else if
    
        int Num = -10;
        if (Num > 0) {
            System.out.println("The value is a positive number.");
        } else if (Num <0) {
            System.out.println("The value is a negative number");
        }else{
            System.out.println("The value is 0");
        }
    }   
}
