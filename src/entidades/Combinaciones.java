
package entidades;

/**
 *
 * @author Jsmith
 */
public class Combinaciones {

    

    public Combinaciones() {
        //combinaciones = new int[7];
    }

    public static int[] combinacion(int valor) {
        int[] combinaciones=new int[7];
        switch (valor) {
            case 0:
                combinaciones = combinacion0();
                break;
            case 1:
                combinaciones = combinacion1();
                break;
            case 2:
                combinaciones = combinacion2();
                break;
            case 3:
                combinaciones = combinacion3();
                break;
            case 4:
                combinaciones = combinacion4();
                break;
            case 5:
                combinaciones = combinacion5();
                break;
            case 6:
                combinaciones = combinacion6();
                break;
            case 7:
                combinaciones = combinacion7();
                break;
            case 8:
                combinaciones = combinacion8();
                break;
            case 9:
                combinaciones = combinacion9();
                break;

        }
        return combinaciones;
    }

    public static int[] combinacion0() {
        int[] combinaciones = {1, 1, 1, 1, 1, 1, 0};
        return combinaciones;
    }

    public static int[] combinacion1() {
        int[] combinaciones = {0, 1, 1, 0, 0, 0, 0};
        return combinaciones;
    }

    public static int[] combinacion2() {
        int[] combinaciones = {1, 1, 0, 1, 1, 0, 1};
        return combinaciones;
    }
    
    public static int[] combinacion3() {
        int[] combinaciones = {1, 1, 1, 1, 0, 0, 1};
        return combinaciones;
    }
    
    public static int[] combinacion4() {
        int[] combinaciones = {0, 1, 1, 0, 0, 1, 1};
        return combinaciones;
    }
    
    public static int[] combinacion5() {
        int[] combinaciones = {1, 0, 1, 1, 0, 1, 1};
        return combinaciones;
    }
    
    public static int[] combinacion6() {
        int[] combinaciones = {1,0, 1, 1, 1, 1, 1};
        return combinaciones;
    }
    
    public static int[] combinacion7() {
        int[] combinaciones = {1, 1, 1, 0, 0, 0, 0};
        return combinaciones;
    }

    public static int[] combinacion8() {
        int[] combinaciones = {1, 1, 1, 1, 1, 1, 1};
        return combinaciones;
    }
    
    public static int[] combinacion9() {
        int[] combinaciones = {1, 1, 1, 0, 0, 1, 1};
        return combinaciones;
    }
}
