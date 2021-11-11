

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
                   

                } case 3 : {
                    
                    
                    break;

                } case 4 : {
                    System.out.println("Respuesta al problema 4 >> ");
                    
                    int pro4 = sc.nextInt();
                    problems.problem4(pro4);

                    break;

                } case 5 : {
                    System.out.println("Respuesta al problema 5 >> ");
                    
                    int pro5 = sc.nextInt();
                    problems.problem5(pro5);
                    
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
