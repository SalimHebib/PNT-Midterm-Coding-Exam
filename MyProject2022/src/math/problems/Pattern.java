package math.problems;

public class Pattern {

    public static void main(String[] args) {

        Pattern.pattern();
    }

    public static int pattern(){
        int i;

        for(i = 100; i >= 0; i--) {
            if(i >= 90 && i <= 100){
                i = i ;
            }else if(i <= 90 && i >= 70){
                i --;
            }else if(i <= 70 && i >= 40){
                i -= 2;
            }else{
                i -= 3;
            }
            System.out.print(i+",");

        }
        return i;
    }

}
