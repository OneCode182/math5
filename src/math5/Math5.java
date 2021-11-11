

package math5;

import java.util.Scanner;

public class Math5 {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        while(true) {
            
            Problems problems = new Problems();
            
            System.out.println(problems.menu());
            int rta = sc.nextInt();
            
            boolean salir = false;


            switch (rta) {
                case 1 : {
                    System.out.println("Respuesta al problema 1 >> ");
                    
                    int pro1 = sc.nextInt();
                    problems.problem1(pro1);
                    
                    break;

                } case 2 : {
                    System.out.println("Respuesta al problema 2 >> ");
                    
                    int pro2 = sc.nextInt();
                    problems.problem2(pro2);
                    
                    break;
                   

                } case 3 : {
                    System.out.println("Respuesta al problema 3 >> ");
                    
                    int pro3 = sc.nextInt();
                    problems.problem3(pro3);
                    
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
                    salir = true;

                    break;

                } default : {
                    System.out.println("Respuesta incorrecta!");

                }

            }  
            
            if (salir) {
                break;
                
            }
            
        }
        
        System.out.println("*** Programa terminado ***");
         
    }
    
}
