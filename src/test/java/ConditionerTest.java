import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    @Test
    public void Temperature(){
        Conditioner cond = new Conditioner(-5, 5);

        Assertions.assertEquals(-5,cond.getMinTemperature());
        Assertions.assertEquals(5, cond.getMaxTemperature());
    }

    }

