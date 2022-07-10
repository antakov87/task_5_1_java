public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(20000, true);
        System.out.println(expected + "== ? ==" + actual);

    }
}
