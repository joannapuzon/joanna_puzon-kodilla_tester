public class GradesApp {
    public static void main(String[] args) throws Exception {
        Grades grades = new Grades();

        grades.add(10);
        grades.add(10);
        grades.add(10);
        grades.add(10);
        grades.add(10);
        grades.add(10);
        grades.add(10);
        grades.add(10);
        grades.add(10);
        grades.add(8);

        for(int i = 0; i<grades.getGrades().length; i++){
            System.out.println(grades.getGrades()[i]);
        }

        System.out.println("last element " + grades.lastGrade());
        System.out.println("average " + grades.arithmeticAverage());
    }
}
