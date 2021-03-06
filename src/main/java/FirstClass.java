
public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1200, 2020);
        Notebook heavyNotebook = new Notebook(2000, 500, 2017);
        Notebook oldNotebook = new Notebook(1600, 2100, 2016);

        displayNotebookParameters(notebook);
        displayNotebookParameters(heavyNotebook);
        displayNotebookParameters(oldNotebook);
    }

    private static void displayNotebookParameters(Notebook oldNotebook) {
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPriceAndYear();
    }
}