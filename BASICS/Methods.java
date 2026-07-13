public class Methods {
    static void print2KaTable() {
        for ( int i=1; i<=10; i++){
            int ans = 2*i ;
            System.out.println("--> :"+ans);
        }
    }

    static void printSum (int x, int y){
        System.out.println ("SUM :"+(x+y));
    }
    public static void main ( String args []){
        System.out.println ("Hi");
        print2KaTable();
        System.out.println ("Bye");
        printSum(5,10);
    }
}
