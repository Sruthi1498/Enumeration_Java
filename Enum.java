public class Enum {
    public enum Color {RED, GREEN, BLUE, BLACK}

    public static void main(String[] args) {
        for (Enumeration.Color c: Enumeration.Color.values())
        {
            System.out.println(c);
        }
        System.out.println(Color.valueOf("RED"));
        System.out.println(Color.valueOf("GREEN").ordinal());
        System.out.println(Color.BLACK.ordinal());

    }
}
