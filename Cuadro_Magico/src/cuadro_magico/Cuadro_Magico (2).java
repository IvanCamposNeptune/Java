package cuadro_magico;

public class Cuadro_Magico {

    public static void main(String[] args) {
        
   int n = 7;

   int i_ant = 0;
   int j_ant = 0;

   int punto_ini = n/2;

   int [] [] matriz_magica = new int [n] [n];

   int temp = 1;

   for (int i=0;i<n;i++){
     for(int j=0;j<n;j++){
       matriz_magica[i] [j] = 0;
     }

   }

   int i = 0;
   int j = punto_ini;

   while (temp != (n*n)+1){
     if (matriz_magica[i] [j] == 0) {
       matriz_magica[i] [j] = temp;
     }else{
       i = i_ant +1;
       j = j_ant;
       matriz_magica [i] [j]=temp;
     }

    i_ant = i;
    j_ant = j;

    temp++;
    j++;
    i--;
    if(i<0 && j==n) {
      i = n -1;
      j = 0;
    }else if( i < 0){
      i = i + n;
    }else if(j==n){
      j = 0;
    }
   }

    for(int x=0;x<n;x++){
     String resultado = "";
     for (int y=0; y<n;y++){
       resultado = resultado + "\t" + matriz_magica[x] [y];
     }
    System.out.println(""+resultado);
   }
        
    }
    
}
