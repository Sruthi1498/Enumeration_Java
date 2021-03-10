public class Enum_Class {
    public enum COLOR {
        RED(2),BLACK(4), BLUE(6), GREEN(8);
        public int num;

        COLOR(int num) {
            this.num = num;
        }
    }

    public static void main(String[] args) {
        for(COLOR c:COLOR.values())
        {
            System.out.println(c + " " + c.num);
        }
    }
}
