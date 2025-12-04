public class OperacionesConArreglos {

    public static void main(String[] args) {

        double[] precios = {12.5, 8.75, 15.0, 20.25, 9.99};
        //Suma
        double suma = 0;
        for(double precio: precios){
            suma += precio;
        }
        System.out.println("Suma total: " + suma);

        double promedio = suma/ precios.length;

        System.out.println("Promedio: " + promedio);

        double mayor = precios[0];
        for ( int i = 1; i < precios.length; i ++ ){
            if(precios[i] > mayor) {
                mayor = precios[i];
            }
        }
        System.out.println("Precio Mayor: " + mayor);



    }

}
