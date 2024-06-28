import java.util.Scanner;

public class day {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter day's number:");
        int day=input.nextInt();
        if (day==1) {
            System.out.println("Its a Monday!");
        }
        else if (day==2) {
            System.out.println("It's a Tuesday!");
        }
        else if (day==3) {
            System.out.println("It's a Wednesday!");
        } 
        else if (day==4) {
            System.out.println("It's a Thursday!");
        } 
        else if (day==5) {
            System.out.println("It's a Friday!");
        } 
        else if (day==6) {
            System.out.println("It's a Saturday!");
        } 
        else if (day==7) {
            System.out.println("It's a Sunday!");
        } 
        else{
            System.out.println("Invalid day number!\nEnter number 1 to 7.");
        }

        Scanner inputn =new Scanner(System.in);
        System.out.println("Enter day's number:");
        int dayn=inputn.nextInt();
        switch(dayn){
            case 1:
            System.out.println("Its a Monday!");
            break;
            case 2:
            System.out.println("It's a Tuesday!");
            break;
            case 3:
            System.out.println("It's a Wednesday!");
            break;
            case 4:
            System.out.println("It's a Thursday!");
            break;
            case 5:
            System.out.println("It's a Friday!");
            break;
            case 6:
            System.out.println("It's a Saturday!");
            break;
            case 7:
            System.out.println("It's a Sunday!");
            break;
            default:
            System.out.println("Invalid day number!\nEnter number 1 to 7.");
        }
    }
}