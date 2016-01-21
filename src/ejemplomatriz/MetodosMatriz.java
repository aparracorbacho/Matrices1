/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatriz;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class MetodosMatriz {
    int [][]notas = new int[3][4];
    int []notaMedia = new int[3];
    int []notaMediaAsig = new int[4];
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
         System.out.println("=============\nLas notas   || Media por alumno\n=============");
        for(int f=0;f<notas.length;f++){         //nos movemos por la fila
          for (int c=0;c<notas[f].length;c++){   //nos movemos por la columna
              System.out.print(notas[f][c] + "  ");
          }    
          System.out.println("|| " + notaMedia[f]);
        }
        System.out.println("=============\nMedia por asignatura");
        for (int f=0;f<notaMediaAsig.length;f++){
            System.out.print(notaMediaAsig[f] + "  ");
        }
        System.out.println();
    }
    
    
    public int pedirNota(){
        System.out.println("Introduce a nota");
        Scanner notaTeclado = new Scanner(System.in);
        int nota = notaTeclado.nextInt();
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
