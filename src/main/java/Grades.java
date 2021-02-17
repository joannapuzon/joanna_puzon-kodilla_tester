public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
    }
        this.grades[this.size] = value;
        this.size++;
    }
    public int lastGrade(int size) {
            return size;
    }
        public static double arithmeticAverage ( int [] grades){
            double sumOfElements = 0.0;
            int size = grades.length;

            for (double i : grades) {
                sumOfElements += i;
            }
            return (size == 0) ? 0 : sumOfElements / size;
        }
    }








