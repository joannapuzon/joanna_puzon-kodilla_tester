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

    public int lastGrade() {
        return grades[size-1];
    }

    public double arithmeticAverage() throws Exception {
        if(size == 0){
            throw new Exception("size is 0");
        }
        double sumOfElements = 0.0;
        int size = grades.length;

        for (double i : grades) {
            sumOfElements += i;
        }
        return sumOfElements / size;
    }

    public int[] getGrades() {
        return grades;
    }
}