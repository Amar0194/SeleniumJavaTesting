package Looping;

public class Break_statement {
    public static void main(String[] args){
        for(int i=300;i<1000;i++){
            if(i%13==0 && i%19==0){
                System.out.println(i);
                continue;
            }
        }
    }
}
