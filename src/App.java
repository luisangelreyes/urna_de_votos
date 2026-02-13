import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);    
        int[] candidatos = new int[3];
        int totalVotos = 0;
        int voto = -1;
    while (voto != 0) {   {
        System.out.println("Cual es su candidato?:");  
        System.out.println("1. Jorge Alvarez Maynez");
        System.out.println("2. Xochitl Galvez");
        System.out.println("3. Claudia Sheinbaum");
        System.out.println("0. Cerrar casilla");
        voto = sc.nextInt();
        if (voto >= 1 && voto <=3) {
            candidatos[voto - 1]++;
            totalVotos++;
        } else if (voto != 0) {
            System.out.println("Este voto esta amañado. Voto por voto casilla por casilla.");
        }
    }        
    }
    System.out.println("Votos contados:");
    if (totalVotos > 0) {
        String[] nombres = {"Jorge Alvarez Maynez","Xochitl Galvez","Claudia Sheinbaum"};
        for(int i = 0; i < candidatos.length;i++){
            double porcentaje = (candidatos[i]*100)/totalVotos;
       //     System.out.printf("%s: %d votos (%2f%%)\n",nombres[i],porcentaje);
            System.out.println(nombres[i] + ": " + candidatos[i] + " votos (" + porcentaje + "%)");
        }
    }else{
        System.out.println("No votaron por nadie JAJJAJA");
    }
    sc.close();
    }
}

