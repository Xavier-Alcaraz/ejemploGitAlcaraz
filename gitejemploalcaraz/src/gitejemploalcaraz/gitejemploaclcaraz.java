/*
//19/02/2021
//proyecto practica alcaraz barreu
 */
package gitejemploalcaraz;

/**
 *
 * @author Xavier
 */
public class gitejemploaclcaraz    {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day=28, month=5, year=2001;
        String stDat=birthday_zeller(day, month, year);
        System.out.println("Mi cumpleaños: " + stDat + " " + day + "/" + month + "/" + year);
        
    }

    private static String birthday_zeller(int day, int month, int year) {
        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int a, y, m, d;
        a = (14 - month) / 12;
        y = year - a;
        m = month + 12 * a - 2;
        d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];
    }
    
}

