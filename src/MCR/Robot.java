package MCR;

public class Robot {

    public static int min = 1;
    public static int max = 10;
    public static int maxrun = 200;

    public static String Name = "Бостон";
    public static int Run = min + (int) (Math.random() * maxrun);
    public static int Jump = min + (int) (Math.random() * max);
}
