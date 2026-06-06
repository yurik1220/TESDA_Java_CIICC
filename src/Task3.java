public class Task3 {
    static void main() {
        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        boolean b1 = a == d;
        boolean b2 = d.equals(b + "!");
        boolean b3 = c.equals(a);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        if(b1 && b2 && b3) {
            System.out.println("Success!");
        }

    }
}
