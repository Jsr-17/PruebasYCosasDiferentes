/**
 * Operaciones
 */
 interface Operaciones {
    int operacion(int n1, int n2);
}

public class nuevoEjemplo {

    public static void main(String[] args) {
        Operaciones sumita=(a,b)->(a+b-b/(a*b))%2;
        Operaciones sumita2=(a,b)->(a+b-b/(a*b));
        
        ImprimeOperacion(sumita,5,6);
        System.out.println(operacionPar(sumita2, 12, 2));

    }
    public static boolean operacionPar(Operaciones operaciones,int n1,int n2){
        boolean resultado=false;
        int n=operaciones.operacion(n1, n2);
        if (n==0) {
            resultado=true;
        }

        return resultado;
    } 
    public static void  ImprimeOperacion(Operaciones operaciones,int n1,int n2){
        int resultado=operaciones.operacion(n1, n2);

        System.out.println("El resultado es "+resultado);
    }
}