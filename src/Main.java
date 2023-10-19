import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean bandera = false;
        Scanner input = new Scanner(System.in);
        int fila, asiento;
        String respuesta;

        //cargando lo datos L a la tabla
        String asientos[][] = new String[10][10];
        for (int f = 0; f < 10; f++){
           for (int c = 0; c < 10; c++){
               asientos[f][c] = "L";
           }
        }
        System.out.println(" --------- BIENVENIDO AL SISTEMA DE RESERVAS ---------------");

        while (!bandera){
            System.out.println("Desea ver los asientos disponibles ?");
            DibujarMapa(asientos);

            System.out.println("Ingrese fila y columna a reservar");
            System.out.println("La fila tiene que ser entre 0 - 9");
            fila = input.nextInt();

            System.out.println("El asiento tiene que ser entre 0 - 9");
            asiento = input.nextInt();

            if (asientos[fila][asiento].equals("L")){
                asientos[fila][asiento] = "X";
                System.out.println("El asiento fue reservado correctamente.");
            }else {
                System.out.println("El asiento esta ocupado");
            }

            input.nextLine();
            System.out.println("Desea continuar");
            respuesta = input.nextLine();
            if (!respuesta.equalsIgnoreCase("s")){
                bandera = true;
            }
        }
    }

    public static void DibujarMapa(String asientos[][]) {
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(asientos[f][c]);
            }
            System.out.println();
        }

    }
}