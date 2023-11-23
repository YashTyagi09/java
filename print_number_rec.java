
public class print_number_rec {
    static void num(int i){
        if(i==0){
            return;

        }
        // System.out.println(i);
        num(i-1);
        System.out.println(i);


    }
    public static void main(String[] args){
        num(10);

    }
    
}
