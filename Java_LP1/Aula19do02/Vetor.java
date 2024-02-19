package Java_LP1.Aula19do02;

public class Vetor {
    public static void main(String[] args) {
      //  int v [] = new int[10];
      //   for(int i =0;i <v.length;i++)
      //  {
      //      v[i]= i * 2;
      //      System.out.println(v[i]);
      //  }   
      
      int x [][] = new int [3][3];
      for(int i = 0; i<3; i++){
        System.out.print("\n");
        for(int j =0; j<3; j++){
            x[i][j] = i+j;
            System.out.print(x[i][j]+"\t");
        }
      }
    }
}
