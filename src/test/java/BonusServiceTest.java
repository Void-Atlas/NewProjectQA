import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered1 = true;
        long expected = 30;
        long actual = service.calculate(amount, registered1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered2 = true;
        long expected = 500;
        long actual = service.calculate(amount, registered2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered3 = false;
        long expected = 10;
        long actual = service.calculate(amount, registered3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForZeroAmount() {
        BonusService service = new BonusService();
        long amount = 0;
        boolean registered4 = true;
        long expected = 0;
        long actual = service.calculate(amount, registered4);
        Assertions.assertEquals(expected, actual);
    }
}