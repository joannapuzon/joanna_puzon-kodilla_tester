public class Application {

    public static void main(String[] args) {

        Human human = new Human("Adam", 40.5, 178);
        System.out.println(Human.name + " " + Human.age + " " + Human.height);
        Human.checkAgeAndHeight();

    }
}