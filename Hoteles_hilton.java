import java.util.Random;
import java.util.Scanner;

public class Hoteles_hilton {

    public static void main(String[] args) {
        Random random = new Random();
        int canthoteles = random.nextInt(7) + 1; // Genera un valor entre 1 y 7

        System.out.println("Esta es la cantidad de hoteles en la cadena: " + canthoteles);

        String[] tipoLuces = {"Led", "MultiLed", "halogena"};
        double costoTotal = 0;

        for (int i = 1; i <= canthoteles; i++) {
            int horasluces = random.nextInt(24); // Genera un valor entre 0 y 23 para las horas de las luces
            System.out.println("Hotel " + i + ": Horas que las luces han estado encendidas: " + horasluces);

            int pisos = random.nextInt(15) + 1; // Genera un valor entre 1 y 15 para la cantidad de pisos
            System.out.println("Hotel " + i + ": Número de pisos: " + pisos);

            int indiceAleatorio = random.nextInt(tipoLuces.length);
            String lucesseleccionadas = tipoLuces[indiceAleatorio];
            System.out.println("Hotel " + i + ": Tipo de luces: " + lucesseleccionadas);

            double costoPorLuz = 0;

            switch (lucesseleccionadas) {
                case "Led":
                    costoPorLuz = 0.50;
                    break;
                case "MultiLed":
                    costoPorLuz = 1;
                    break;
                case "halogena":
                    costoPorLuz = 0.25;
                    break;
            }

            double costoHotel = horasluces * pisos * costoPorLuz;
            costoTotal += costoHotel;
            System.out.println("Hotel " + i + ": Costo de las luces: $" + costoHotel);
        }

        System.out.println("El costo total de las luces para todos los hoteles es: $" + costoTotal);
    }
}