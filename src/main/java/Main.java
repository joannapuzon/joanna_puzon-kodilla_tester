public class Main {
    public static void main(String[] args) {
        User joanna = new User("Joanna", 27);
        User marcin = new User("Marcin", 30);
        User kasia = new User("Kasia", 47);
        User tomek = new User("Tomek", 53);

        User[] users = {joanna, marcin, kasia, tomek};

        System.out.println(average(users));

        for (int i = 0; i < users.length; i++) {
            if(users[i].wiek < average(users)){
                System.out.println(users[i].imie + " wiek jest mniejszy od sredniej");
            } else {
                System.out.println(users[i].imie + " wiek jest wiekszy od sredniej");
            }
        }

    }

    private static double average(User[] users) {
        int numberOfElements = users.length;
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].wiek;
        }
        return result/numberOfElements;
    }
}

