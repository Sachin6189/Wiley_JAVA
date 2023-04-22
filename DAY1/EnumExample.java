package DAY1;
enum WeekDay{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}


public class EnumExample {
    public static void main(String[] args) {
    WeekDay day = WeekDay.Sunday;
    System.out.println(day);
    System.out.println();

    
    for(WeekDay wd:WeekDay.values()){
        System.out.println(wd);
    }
}}
