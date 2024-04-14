package control;

public class Nr2 {
    public static void main(String[] args) {
        int[] mass={5,31,2,7,4,85,19,101};
        int x=mass[0];

        for(int i=1;i<mass.length;i++){
            if(mass[i]>x){
                x=mass[i];
            }
        }
        System.out.println(x);
    }
}
