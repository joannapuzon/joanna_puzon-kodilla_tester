public class Random {
    int sum;
    int maxNum;
    int minNum;
    int result;

    public Random(int sum, int maxNum, int minNum, int result) {
        this.result = result;
        this.sum = sum;
        this.maxNum = maxNum;
        this.minNum = minNum;

    }

    public Random() {
        Random random = new Random();
    }

    public int getMaxNum() {
        Random MaxNum = new Random();
        if (getResult() >= maxNum) {
            maxNum = getResult();
        }
        return maxNum;
    }

    public int getMinNum() {
        Random MinNum = new Random();
        if (nextInt(31) < maxNum) {
            minNum = getResult();
        }
        return minNum;
    }

    private int nextInt(int i) {
        return i;
    }

    private int getResult() {
        return result;
    }

    public int getSum() {
        return sum;
    }
}