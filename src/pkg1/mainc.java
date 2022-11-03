package pkg1;

public class mainc {
    public static void main(String[] args) {
        calc2 c=new calc2();
                c.mul(10,5);
        c.div();
        c.add(10,20);
    }
}
// static keyword allocates a memmory direct so does not ovrride,
// using final keyword achieving constant method in all over program.