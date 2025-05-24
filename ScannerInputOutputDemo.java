import java.util.Scanner;

class ScannerInputOutputDemo
{
    public static void main(String[] args)
    {
        String a;
        System.out.println("Enter Data ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextLine();
        System.out.println("Get Data "+a);
    }
}