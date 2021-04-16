public class Task6D {
    public static void main(String args[]){
        System.out.println("Figure D");
        for(int x = 1; x <= 5; x++){
            for(int y = 1; y <= (5-x); y++){
                System.out.print(" ");
            }
            for(int z = 0; z < (x + (x-1)); z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
