
public class JavaProv2UPPG2 {

    public static void main(String args[]) {
        int []Array1 ={5,10,25,75,125};
        int []Array2 ={50,100,250,750,25};
        int Sum1 = 0;
        int Sum2 = 0;
        int i;
        
        for (i = 0; i < Array1.length; i++) {
            Sum1 += Array1[i];
            }
         System.out.println("Sum of Array1: " +Sum1);
         
          for (i = 0; i < Array2.length; i++) {
            Sum2 += Array2[i];
            }
         System.out.println("Sum of Array2: " +Sum2);
         
         int Sum3 = Sum2 / Sum1;
         System.out.println("Arrays divided: " +Sum3);
        /*
            System.out.println(Sum1.length);
                for (int i = 0; i< Sum1.length; i++){
                    System.out.println(Sum1[i]);
                    
            System.out.println(Sum2.length);
                for (int j = 0; i< Sum2.length; j++){
                    System.out.println(Sum2[j]);
                       
            }
        }
*/
    }
}