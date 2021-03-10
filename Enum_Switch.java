public class Enum_Switch {
    public enum COLOR {
        RED, GREEN, BLUE, BLACK;

        public static void main(String[] args) {
            COLOR c = COLOR.RED;

            switch(c)
            {
                case RED:
                    System.out.println("RED");
                    break;
                case BLUE:
                    System.out.println("BLUE");
                    break;
                case BLACK:
                    System.out.println("BLACK");
                    break;
                case GREEN:
                    System.out.println("GREEN");
                    break;
                default:
                    System.out.println("others");
            }
        }
    }
}
