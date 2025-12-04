
public class Numeros {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        //        Tamaño fijo (se define)
//        Acceso por indice - [1,2,3,4,5,6]
//        Almcena elementos del mismo tipo
//        Se declara con corchetes

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice " + i + ": " + numeros[i]);
        }

        //FOR EACH
        System.out.println("#######DECLARACION CON FOR EACH#######");

        for (int num : numeros){
            System.out.println("Valor: " + num);
        }







    }
}