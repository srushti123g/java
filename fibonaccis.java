public class fibonaccis {
    public static void main(String[] args)
    {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(1);
        for(int i=0;i<=10;i++){
            int m=a+b;
            a=b;
            b=m;

        
            System.out.println(m);

        }
    }

}
