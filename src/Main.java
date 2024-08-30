public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(100,"Rashid");
        Cliente c2 = new Cliente(200,"Fabian");
        Cliente c3 = new Cliente(100,"Rashid");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c3 == c1);

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c3.equals(c3));
    }
}
