import java.util.*;
public class switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch(button)
        {
            case 1:
            System.out.print("Hello");
            break;
            case 2:
            System.out.print("Namastr");
            break;
            case 3:
            System.out.print("Bonjor");
            break;
            default:
            System.out.print("Invalid button");
        }

    }

    
}
/* switch(variable){
    case 1:st 1
    break;
    case 2:st 2
    break;
    case 3:st 3
    break;
    default:
}*/