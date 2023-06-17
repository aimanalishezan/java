/*
 * unary oparator
 * +----use for decide the oparande that its possitive
 * -    use for decide tha oparande that its nagative
 * ++------increement
 * --     decreement
 * *****three is two types of increement\decreement
 * x++----increement x by one after useit
 * ++x----increement x by one before useit
 * y--    decreement y by one after use
 * --y----decreement y by one before useit
 */


public class unary {
    public static void main(String[] args) {
        int x=10;
        int y=+x;//means x is possitive
        System.out.println("positive x="+y);
        y=-x;//means x is nagative
        System.out.println("nagative x="+y);
        y=x++;//use after work
        System.out.println("x++:"+y);
        y=x;//when its called second time then increement
        System.out.println("when its called second time :"+y);
        x=10;//re enter the value beceause its collabs with x++
        y=++x;
        System.out.println("++x:"+y);
        x=10;
        y=--x;//pre decreement
        System.out.println("--x:"+y);
        x=10;
        y=x--;//1st initialize
        System.out.println("when its called one time x--:"+y);
        y=x;//2nd initialize
        System.out.println("when its called second time then x ="+y);
    }
}
