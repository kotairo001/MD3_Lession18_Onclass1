public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();
        numberGenerator1.setPriority(Thread.MIN_PRIORITY);
        numberGenerator2.setPriority(Thread.MAX_PRIORITY);
        numberGenerator1.start();
        numberGenerator2.start();

    }
}
