import java.util.Random;
import java.util.Scanner;
public class Hoteles_hilton {




    
    public static void main(String[] args) {
        //Tirarmos los randoms necesarios
        Random random = new Random();
        int horasluces = random.nextInt(24); // Me da entre 0 y 23
        System.out.println("Estas son las horas que las luces han estado encendidas: " + horasluces);

        int canthoteles = random.nextInt(7); // Me da entre 0 y 6
        System.out.println("Esta es la cantidad de hoteles e la cadena " + canthoteles);

        String[] tipoLuces = {"Led", "MultiLed", "halogena"}; //Me dara el tipo de luz dependiendo el hotel
        int indiceAleatorio = random.nextInt(tipoLuces.length);
        String lucesseleccionadas = tipoLuces[indiceAleatorio];
        System.out.println("Este es el tipo de luces por hotel es " + lucesseleccionadas);

        int pisos = random.nextInt(15); // Me da entre 0 y 14
        System.out.println("Este es el numero de pisos por cada hotel " + pisos);


    }

    

}
