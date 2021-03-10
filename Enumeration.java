public class Enumeration {
    public enum Color {RED, GREEN, BLUE, BLACK}

    public static void main(String[] args) {
        for (Color c:Color.values())
        {
            System.out.println(c);
        }
    }
}
