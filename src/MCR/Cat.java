package MCR;

public class Cat {

    public static int min = 1;
    public static int max = 7;
    public static int maxrun = 150;

    public static String Name = "Мурзик";
    public static int Run = min + (int) (Math.random() * maxrun);
    public static int Jump = min + (int) (Math.random() * max);
}
