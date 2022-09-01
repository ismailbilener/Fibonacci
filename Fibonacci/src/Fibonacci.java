public class Fibonacci {
    public static void main(String[] args) {
        int sayi1,sayi2,total;
        sayi1=0;
        sayi2=1;
        for(int i=1; i<9; i++){
            total=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=total;
            System.out.println(total);
        }
    }
}
