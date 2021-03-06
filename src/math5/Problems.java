

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
            
        } return false;
        
    }
    
    private boolean entre0y6(int num) {
        if (0 <= num && 6 >= num) {
            return true;
            
        } return false;
        
    }
    
    private int invertir(int num) {
        
        int invertido = 0;
        while (num > 0) {            
            int resto = num % 10;
            invertido = invertido * 10 + resto;
            num /= 10;
        }
        return invertido;
        
    }
    
    private int multiploDe2(String num) {
        String salida = "";
        for (int i = 0; i < num.length(); i++) {
            int digito = Character.getNumericValue(num.charAt(i));
            if (digito % 2 == 0 && digito != 0) {
                salida += String.valueOf(digito);
                
            }
        }
        
        if (salida == "") {
            return 0;
            
        } return Integer.parseInt(salida);
        
    }
    
    private boolean capicua(int num) {
        int invertido = invertir(num);
        
        if (num == invertido) {
            return true;
            
        } return false;
        
        
        
    }
    
    private int factorial(int digito) {
        int iFactorial = 1;
                    
        for (int x = 2; x < digito; x++) {
            iFactorial *= x;

        } return iFactorial;
        
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
    
    public void problem2(int num) {
        if (!mayor(num)) {
            System.out.println("El numero debe ser mayor a 100!");

        } else {
            int invertido = invertir(num);
            int respuesta = multiploDe2(String.valueOf(invertido));
            
            if (respuesta == 0) {
                System.out.println("El numero no tiene digitos multiplos de 2!");
                
            } else {
                System.out.println("Numero invertido con digitos multiplos de 2 >> " + respuesta);
            
            }
            
        
        }
        
    }
    
    public void problem3(int num) {
        if (!mayor(num)) {
            System.out.println("El numero debe ser mayor a 100!");

        } else {
            String cifras = String.valueOf(num);
            
            for (int i = 0; i < cifras.length(); i++) {
                int digito = Character.getNumericValue(cifras.charAt(i));
                System.out.println("Digito N " + (i + 1) + " => " + digito);
                
                String primoImpar;
                
                if (!par(digito) && primo(digito)) {
                    primoImpar = "Si";
                    
                } else {
                    primoImpar = "No";
                    
                }
                
                System.out.println("Es primo e impar? >> " + primoImpar);
                
                if (!par(digito) && primo(digito)) {
                    int factorial = factorial(digito);
                    
                    System.out.println("Factorial del digito primo e impar >> " + factorial);
                    
                }
            
            }
        
        }
        
    }
    
    public void problem4(int num) {
        if (!mayor(num)) {
            System.out.println("El numero debe ser mayor a 100!");
            
        } else {
            String cifras = String.valueOf(num);
            int suma = 0;
            
            for (int i = 0; i < cifras.length(); i++) {
                int digito = Character.getNumericValue(cifras.charAt(i));
                suma += digito;
                
                System.out.println("Digito N " + (i + 1) + " => " + digito);
                
                String par;
                if (par(digito)) {
                    par = "Si";

                } else {
                    par = "No";

                }
                
                System.out.println("Es impar >> " + par);
                
                if (!par(digito)) {
                    System.out.println("  | Su factorial es >> " + factorial(digito));
                    
                }
                
                
            }
            
            int promedio = suma / cifras.length();
            
            System.out.println("Promedio de digitos pares >> " + promedio);
            System.out.println("Cantidad de digitos >> " + cifras.length());
            
        }
        
    }
    
    public void problem5(int num) {
        if (!mayor(num)) {
            System.out.println("El numero debe ser mayor a 100!");
            
        } else {
            String cifras = String.valueOf(num);
            
            for (int i = 0; i < cifras.length(); i++) {
                int digito = Character.getNumericValue(cifras.charAt(i));
                
                System.out.println("Digito N " + (i + 1) + " => " + digito);
                
                String rango;
                if (entre0y6(digito)) {
                    rango = "Si";
                    
                } else {
                    rango = "No";
                    
                }
                
                System.out.println("Numero entre 0 y 6 >> " + rango);
                
                if (entre0y6(digito) && !par(digito)) {
                    System.out.println("  | Su factorial es >> " + factorial(digito));
                    
                }
                
                
            }
            String capicua;
            
            if (capicua(num)) {
                capicua = "Si";
                
            } else {
                capicua = "No";
                
            }
            
            System.out.println("Es numero capicua? >> " + capicua);
            
        }
        
    }
    
    
    
}

