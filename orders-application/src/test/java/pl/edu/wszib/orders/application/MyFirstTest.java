package pl.edu.wszib.orders.application;

import org.junit.jupiter.api.Test;
import pl.edu.wszib.orders.api.order.OrderFacadeApi;
import pl.edu.wszib.orders.api.order.OrderResult;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyFirstTest {

    private final OrderFacadeApi orderFacade = new OrderFacade();

    @Test
    public void should_be_able_to_create_order() {
        //TODO: task1 impl
    }
    @Test
    public void should_be_able_to_find_existing_order_by_id() {
        // given: we have properly created order
        String existingOrderId = orderFacade.create().success().id();

        // when:
        OrderResult result = orderFacade.getById(existingOrderId);

        // then: result is success
        assertTrue(result.isSuccess());

        // and: resulting order has the same id as we looked for
        assertEquals(existingOrderId, result.success().id());
    }

    @Test
    public void should_sum_values() {
        int result = sum(1, 2, 3, 4, 5);
        assertEquals(12, result);
    }

    public static Integer sum(int... integers) {
        return IntStream.of(integers).sum();
    }


}
