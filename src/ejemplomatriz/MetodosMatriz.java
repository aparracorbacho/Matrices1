/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatriz;

import java.util.Scanner;
import java.text.DecimalFormat;  
/**
 *
 * @author aparracorbacho
 */
public class MetodosMatriz {
    int [][]notas = new int[3][4];
    float []notaMedia = new float[3];
    float []notaMediaAsig = new float[4];
    String []nAlumnos = {"aa","bb","cc"};
    String []nAsig = {"PR","CD","BD","LM"};
    DecimalFormat decimales = new DecimalFormat("0.0");
    
    
    //Posible forma de cargar unha matriz // int [][]notaM={{7,9,5,4},{5,5,5,5},{6,7,8,9}}
    
    public void cargarMatriz(){
        for(int f=0;f<notas.length;f++){         //nos movemos por la fila
          for (int c=0;c<notas[f].length;c++){   //nos movemos por la columna
              notas[f][c]=pedirNota();
          }    
        }
    }
    
    
     public void amosarMatriz(){
        notaMedia();
        notaMediaAsig();
        System.out.println("=============\nLas notas      || Media por alumno\n=============");
               
        for(int f=0;f<notas.length;f++){         //nos movemos por la fila
            if (f==0) { System.out.print("   ");}
            if (f==0) {
                for (int a=0;a<nAsig.length;a++) {System.out.print(nAsig[a] + " ");}
                System.out.println();
            }
            System.out.print(nAlumnos[f] + " ");
            
          for (int c=0;c<notas[f].length;c++){   //nos movemos por la columna
              System.out.print(notas[f][c] + "  ");
          }    
          System.out.println("|| " + notaMedia[f]);
        }
        System.out.println("=============\nMedia por asignatura");
        for (int a=0;a<nAsig.length;a++) {System.out.print(nAsig[a] + "  ");}
        System.out.println();
        for (int f=0;f<notaMediaAsig.length;f++){
            System.out.print(decimales.format(notaMediaAsig[f]) + " ");
        }
        System.out.println();
    }
    
    
    public int pedirNota(){
        int nota;
        do {
        System.out.println("Introduce a nota");
        Scanner notaTeclado = new Scanner(System.in);
        nota = notaTeclado.nextInt();
        if (nota<1 || nota>10) {System.out.println("Nota no valida");}
        } while (nota<1 || nota>10);
        return nota; 
   
    }
    
    public void notaMedia(){
        for(int f=0;f<notas.length;f++){         //nos movemos por la fila
           int media = 0;
          for (int c=0;c<notas[f].length;c++){   //nos movemos por la columna
              media = media + notas[f][c];
          }    
           notaMedia[f] = media/notas[f].length;
          }
    }
    
    public void notaMediaAsig(){
        for(int f=0;f<notas.length;f++){         //nos movemos por la fila
          for (int c=0;c<notas[f].length;c++){   //nos movemos por la columna
             notaMediaAsig[c]= notaMediaAsig[c] + notas[f][c];
          }    
        }
        
        for (int c=0;c<notaMediaAsig.length;c++){
            notaMediaAsig[c] = notaMediaAsig[c]/notas.length;
        }
       
    }

       
}
