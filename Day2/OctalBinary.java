import java.util.Scanner;
class OctalBinary {
    static int toOctal(int decimal){
        int num = decimal;
        int rem = 0;
        String converted = "";
        while(num!=0){
            rem = num%8;
            converted = rem + converted;
            num = num/8;
        }
        return Integer.parseInt(converted);
    }
    static int toBinary(int decimal){
        int num = decimal;
        int rem = 0;
        String converted = "";
        while(num!=0){
            rem = num%2;
            converted = rem + converted;
            num = num/2;
        }
        return Integer.parseInt(converted);
    }
    static int BinaryOctal(int number, boolean isBinary){
        int num = number;
        int deci = 0;
        int n = 0;
        while(num>0){
            int temp = num%10;
            if(isBinary){
                deci += temp*Math.pow(2, n);
            } else {
                deci += temp*Math.pow(8, n);
            }
            num = num/10;
            n++;
        }
        if(isBinary){
            return toOctal(deci);
        } else {
            return toBinary(deci);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal;
        int octal;
        int binary;
        int choice;
        System.out.println("Choose an operation:\n 1) Decimal to Octal\n 2) Decimal to Binary\n 3) Binary to Octal\n 4) Octal to Binary\n");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter a decimal: ");
                decimal = sc.nextInt();
                System.out.printf("The converted octal is: %d", toOctal(decimal));
                break;
            case 2:
                System.out.println("Enter a decimal: ");
                decimal = sc.nextInt();
                System.out.printf("The converted binary is: %d", toBinary(decimal));
                break;
            case 3:
                System.out.println("Enter a Binary: ");
                binary = sc.nextInt();
                System.out.printf("The converted octal is: %d", BinaryOctal(binary, true));
                break;
            case 4:
                System.out.println("Enter an Octal: ");
                octal = sc.nextInt();
                System.out.printf("The converted binary is: %d", BinaryOctal(octal, false));
                break;
            default:
                System.out.println("Enter a valid choice please");
                break;
        }
    }
}
