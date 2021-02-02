
public class LeapYear {
    public static void main(String[] args) {

        int rok = 2021;


        if (rok%4 == 0 || rok%100 == 0 || rok%400 == 0){
            System.out.println("Rok Przestępny");
        } else if (rok%4 == 1 || rok%400 == 1) {
            System.out.println("Rok Nie Przestępny");
        } else
        {
            System.out.println("Rok Nie Przestępny");
        }
    }
}