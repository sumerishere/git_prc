import java.util.Scanner;
class Diff{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter int a :");
        int a = sc.nextInt();
        System.out.print("enter int b :");
        int b = sc.nextInt();
        
        if (a > b){
            int sub = a-b;
            System.out.println("the substraction of a and b :"+sub);
        }else{
            int sub2 = b-a;
            System.out.println("the substraction of a and b :"+sub2);
        }
        

    }
}