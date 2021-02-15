
public class Notebook {
    String weight;
    int price;
    int year;


    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPriceAndYear() {
        if (price < 600 && year < 2019) {
            System.out.println("This notebook is very cheap and quite old");
        } else if (price > 600 && price < 2000 && year > 2019 ) {
            System.out.println("This notebook is quite expensive and new.");
        } else {
            System.out.println("This notebook is expensive but very old. ");
        }
    }
}




