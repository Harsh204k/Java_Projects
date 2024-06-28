public class swap{
    public static void main(String[] args)
    {
        int x=30;
        int y=20;
        System.out.println("Before Swapping: x="+x+" & y="+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping: x="+x+" & y="+y);
        System.out.println("\n");
        System.out.println("METHOD-2\n");
        int a=10;
        int b=20;
        System.out.println("Before Swapping: a="+a+" & b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping: a="+a+" & b="+b);
    }
}