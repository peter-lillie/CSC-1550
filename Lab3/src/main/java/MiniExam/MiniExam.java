package MiniExam;

public class MiniExam {
    public static void main(String[] args) {
        double x = 5/2;
        double y = (5/2);
        String name = "George W. Bush";

        System.out.println(x + "\n" + y);

        try {
            System.out.println(1 / 0);
        }
        catch(Exception e) {
            System.out.println("Runtime Error");
        }

        System.out.println(name.length());
        System.out.println("1 big bad wolf\t8 the 3 little pigs\n4 dinner\r2night");
    }
}
