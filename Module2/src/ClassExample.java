class WeekDay{
    int number;
    String name;
}
public class ClassExample {
    public static void main(String[] args) {
        WeekDay day = new WeekDay();
        day.number = 1;
        day.name = "Sunday";
        System.out.println(day.number + " " + day.name);
    }
}