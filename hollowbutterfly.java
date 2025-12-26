public class hollowbutterfly {
    public static void main(String[] args)
    {
        for(int i=1;i<6;i++)
        {
            for(int j=1;j<=i;j++)
            {if(i==3 && j==2|| (i==4 && (j==2 || j==3)) || i==5 && (j==2 || j==3||j==4))
                {System.out.print(" ");}
                else{
                    System.out.print("*");
                }
            }
            for(int j=1;j<=10-2*i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==3 && j==2|| (i==4 && (j==2 || j==3)) || i==5 && (j==2 || j==3||j==4))
                {
                    System.out.print(" ");
                }
                else{
                System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
        {
            for(int j=1;j<=i;j++)
            {if(i==3 && j==2|| (i==4 && (j==2 || j==3)) || i==5 && (j==2 || j==3||j==4))
                {System.out.print(" ");}
                else{
                    System.out.print("*");
                }
            }
            for(int j=1;j<=10-2*i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==3 && j==2|| (i==4 && (j==2 || j==3)) || i==5 && (j==2 || j==3||j==4))
                {
                    System.out.print(" ");
                }
                else{
                System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

    }

