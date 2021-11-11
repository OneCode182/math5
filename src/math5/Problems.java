

package math5;



public class Problems {

    public Problems() {
    }
    
    public String menu() {
        return "\n\nSeleccione el problema..." +
            "\n - - - - - - - - - - - - - - - - - - - - - - " +
                
            "\n\n1 => Leer un numero x por teclado mayor a 100, contar la " +
            "cantidad  de digitos pares, impares, primos, y no primos" +
                
            "\n2 => Leer un numero x por teclado mayor a 100, armar un nuevo " +
            "numero invertido con los digitos multiplos de 2" +
                
            "\n3 => Leer un numero x por teclado mayor a 100, calcular la " +
            "factorial de los digitos primos que al mismo tiempo sea impar" +
                
            "\n4 => Leer un numero x por teclado mayor a 100, calcular la " +
            "factorial de los digitos impares y el promedio de los digitos " +
            "pares, la cantidad de digitos que contiene el numero" +
                
            "\n5 => Leer un numero x por teclado mayor a 100, calcular la" +
            " factorial de todos los digitos que esten entre 0 y 6, verificar " +
            "si el numero es capicua" +
            
            "\n6 => Salir\n"
        
        ;
        
    }
    
    private boolean par(int num) {
        if (num % 2 == 0) {
            return true;
        }
        
        return false;
        
    }
    
    private boolean primo(int num) {
        for (int x = 2; x < num / 2; x++) {
            if (num % x == 0) {
                return false;
                
            }
            
        }
        
        if (num == 0 || num == 1 || num == 4) {
            return false;
            
        }
        
        return true;
        
    }
    
    private boolean mayor(int num) {
        if (num >= 100) {
            return true;
            
        }
        
        return false;
        
    }
    
    public void problem1(int num) {
        if (!mayor(num)) {
            System.out.println("El numero debe ser mayor a 100!");
            
        } else {
            String cifras = String.valueOf(num);
            int pares = 0;
            int noPares = 0;
            
            int primos = 0;
            int noPrimos = 0;
            
            
            for (int i = 0; i < cifras.length(); i++) {
                int digito = Character.getNumericValue(cifras.charAt(i));
                System.out.println("Digito N " + (i + 1) + " => " + digito);



                String par;
                if (par(digito)) {
                    par = "Par";
                    pares++;

                } else {
                    par = "Impar";
                    noPares++;

                }

                String primo;
                if (primo(digito)) {
                    primo = "Si";
                    primos++;

                } else {
                    primo = "No";
                    noPrimos++;

                }

                System.out.println("Es >> " + par);
                System.out.println(primo + " es primo");


            }
            
            System.out.println("Cantidad de Pares >> " + pares);
            System.out.println("Cantidad de No Pares >> " + noPares);
            System.out.println("Cantidad de Primos >> " + primos);
            System.out.println("Cantidad de No Primos >> " + noPrimos);
            
        }
        
    }
    
}
