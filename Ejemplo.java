
interface suma {
 public int sumaElementos(int a ,int b);
}


public class Ejemplo {
    

    public static void main(String[] args) {
        suma sumaVariable=( a, b)-> a +  b;
        printSuma(sumaVariable, 10, 70);
    }
    public static void printSuma(suma sumita,int n1,int n2) {
         int resultado=sumita.sumaElementos(n1, n2);
         System.out.println("El resultado de la suma es "+resultado);
    }
}