import org.junit.jupiter.api.Test;
import ru.netology.services.FreelancerVacationService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerVacationServiceTest {
    @Test
    public void calculateVacationMonths() {
        FreelancerVacationService service = new FreelancerVacationService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = service.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expected, actual);
    }
}
