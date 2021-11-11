

package math5;

import java.util.Scanner;

public class Math5 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        while(true) {
            
            Problems problems = new Problems();
            
            System.out.println(problems.menu());
            int rta = sc.nextInt();
            
            


            switch (rta) {
                case 1 : {
                    System.out.println("Respuesta al problema 1 >> ");
                    
                    int pro1 = sc.nextInt();
                    problems.problem1(pro1);
                    
                    break;

                } case 2 : {
                    // Code

                } case 3 : {
                    // Code

                    break;

                } case 4 : {
                    // Code

                    break;

                } case 5 : {
                    // Code

                    break;

                } case 6 : {
                    // Code

                    break;

                } default : {
                    System.out.println("xd");

                }

            }         
            
        }
         
    }
    
}
