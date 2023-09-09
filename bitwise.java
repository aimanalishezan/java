public class bitwise {
    public static void main(String[] args) {
        int a=32;
        int b=12;
        int c;
        c=a&b;
        System.out.println("and is :"+c);
        c=a|b;
        System.out.println("or is :"+c);
        c=a^b;
        System.out.println("exor is :"+c);
        c=a>>1;
        System.out.println("right shift:"+c);
        c=a<<1;
        System.out.println("right shift:"+c);
    }
}
