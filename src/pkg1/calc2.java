package pkg1;

public class calc2 extends calc{

    public void add(int x, int y) // override method as known as Run time Polymorphism
    {
        super.add(x, y);
        int c=x+y;
                System.out.println(c);
    }
    public void mul(int x,int y,int z)//method Overloading as known compile time Polymorphism
    {
        int c=x+y+z;
    System.out.println("multiplication calc2"+c);
    }

    public void div ()
    {
        System.out.println("division");

    }
}
