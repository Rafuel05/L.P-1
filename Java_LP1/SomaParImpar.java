package Java_LP1;

public class SomaParImpar {
    public static void main (String args []){
        //int sP = 0;
        //int sI = 0;
        int sI =0,sP =0;
        for (int i =0; i <101; i++){
            if (i%2==0){
                sP = sP + i;
            }
            else{
                sI = sI + i;
                
            }
        }
        System.out.println("par="+sP+" impar="+sI);
    }
}