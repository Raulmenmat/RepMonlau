/*
26/01/2021
Autor:Andres Martinez
*/
package pz1;


public class Pz1 {


    public static void main(String[] args) {
        
        int day=12, month=9, year=2021;
        String dayString = functionBirthDay(day, month, year);
        System.out.println("******** Andres Martinez **********");
        System.out.println("International programmer day: " + dayString);
    }
    private static String functionBirthDay(int day, int month, int year) {
        //Zeller
        String dayString;
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;        
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        dayString = week[d];
        return dayString;
    }
    
}

