package H;

import javax.swing.*;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroEstudiantes;

        numeroEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de estudiantes: "));
        String[] estudiantes = new String[numeroEstudiantes];
        float matriz [][] = new float[3][numeroEstudiantes];
        String nota="";

        System.out.println("Digite el nombre de los estudiantes: ");
        for(int i=0;i<numeroEstudiantes;i++){
            System.out.print((i+1)+".Digite el nombre:");
            estudiantes[i] = new Scanner(System.in).nextLine();
        }

        for(int i=0;i<numeroEstudiantes;i++){
            System.out.println("Digite ahora las notas del estudiante "+estudiantes[i]+": ");
            for(int j=0;j<3;j++){
                matriz[j][i] = new Scanner(System.in).nextFloat();

                System.out.println(matriz[j][i]);
            }

        }
        for(int k=0;k<numeroEstudiantes;k++){
            float promedio=0, sumaNotas=0;
            for(int n=0;n<3;n++){

                if(n<2){
                    sumaNotas = (matriz[n][k]*0.3f)+sumaNotas;

                }
                else
                    sumaNotas = (matriz[n][k]*0.4f)+sumaNotas;
                if (n == 2){
                    promedio = sumaNotas;
                    if(promedio<2.2f)
                        nota = " Pierde";
                    else if(promedio>=2.2f && promedio<3)
                        nota = " habilita";
                    else if(promedio>=3)
                        nota = " Gana";
                    System.out.println(estudiantes[k]+":" + " Nota 1: "+ matriz[0][k]+ " Nota2: " + matriz[1][k]+ " Nota3: " + matriz[2][k] + " Promedio: " + promedio + nota);
                }


            }
        }
    }
}
