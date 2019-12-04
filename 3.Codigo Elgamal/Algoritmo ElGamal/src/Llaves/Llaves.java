package Llaves;



public class Llaves {

    public static int hallarA(int p, int g, int a) {
        int A;
        A=(int) (Math.pow(g,a))%p;
        return A;
       
    }
    public static int hallarO(int p,int q){
    int O;
        O=((p-1)*(q-1));
        return O;
    }
    public static int hallarD(int e, int o,int j){
        int op=0;
        op=((e*j)/o);
        if(op==1){
            return j;
        }else{
            j+=1;
            return hallarD(e,o,j);
        }
                
        
        
    }
    
}
