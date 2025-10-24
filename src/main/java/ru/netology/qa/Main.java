public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount1 = 1000;
        boolean registered1 = true;
        long bonus1 = service.calculate(amount1, registered1);
        System.out.println("Сумма: " + amount1 + ", Зарегистрирован: " + registered1 + ", Бонус: " + bonus1);

        long amount2 = 1_000_000;
        boolean registered2 = true;
        long bonus2 = service.calculate(amount2, registered2);
        System.out.println("Сумма: " + amount2 + ", Зарегистрирован: " + registered2 + ", Бонус: " + bonus2);

        long amount3 = 1000;
        boolean registered3 = false;
        long bonus3 = service.calculate(amount3, registered3);
        System.out.println("Сумма: " + amount3 + ", Зарегистрирован: " + registered3 + ", Бонус: " + bonus3);

        long amount4 = 0;
        boolean registered4 = true;
        long bonus4 = service.calculate(amount4, registered4);
        System.out.println("Сумма: " + amount4 + ", Зарегистрирован: " + registered4 + ", Бонус: " + bonus4);
    }
}