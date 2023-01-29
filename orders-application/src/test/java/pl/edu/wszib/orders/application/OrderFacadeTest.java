package pl.edu.wszib.orders.application;

import org.junit.jupiter.api.Test;
import pl.edu.wszib.orders.api.order.OrderFacadeApi;
import pl.edu.wszib.orders.api.order.OrderResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderFacadeTest {

    private final OrderFacadeApi orderFacade = new OrderFacade();

//    OrderResult create();

    @Test
    public void should_be_able_to_create_order() {
        // given:

        // when:
        OrderResult orderResult = orderFacade.create();

        // then:
        assertTrue(orderResult.isSuccess());
    }

    @Test
    public void should_create_order_without_items() {

    }

//    OrderResult getById(String orderId);

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
    public void should_be_able_to_find_not_existing_order() {

    }

//    OrderResult addProduct(String orderId, String productId);

    @Test
    public void should_be_able_to_add_product_to_order() {

    }

    @Test
    public void should_increase_item_amount_by_one_if_product_already_exists_in_order() {

    }

    @Test
    public void should_not_be_able_to_add_product_to_non_existing_order() {

    }

    @Test
    public void should_be_able_to_add_product_item_after_it_was_removed_from_order() {

    }

    @Test
    public void should_not_be_able_to_add_not_existing_product_to_order() {

    }

//    OrderResult removeProduct(String orderId, String productId);

    @Test
    public void should_not_be_able_to_remove_non_existing_product_item() {

    }

    @Test
    public void should_not_be_able_to_remove_from_non_existing_order() {

    }

    @Test
    public void should_be_able_to_remove_product_from_order() {

    }

    @Test
    public void should_be_able_to_remove_product_when_item_amount_higher_than_one() {

    }

    @Test
    public void should_not_change_other_order_items_when_removing_particular_product() {

    }

//    OrderResult increaseProductQuantity(String orderId, String productId);

    @Test
    public void should_increase_product_quantity_by_one() {

    }

    @Test
    public void should_be_able_to_add_product_if_it_did_not_exists() {

    }

    @Test
    public void should_not_be_able_to_increase_for_invalid_order() {

    }

    @Test
    public void should_not_be_able_to_increase_product_quantity_for_invalid_product() {

    }

//    OrderResult decreaseProductQuantity(String orderId, String productId);

    @Test
    public void should_be_able_to_decrease_product_quantity() {

    }

    @Test
    public void should_not_be_able_to_decrease_quantity_below_one() {

    }

    @Test
    public void should_not_be_able_to_decrease_for_invalid_order() {

    }

    @Test
    public void should_not_be_able_to_decrease_product_quantity_for_invalid_product() {

    }

//    OrderResult setProductQuantity(String orderId, String productId, Integer quantity);

    @Test
    public void should_be_able_to_set_item_amount_only_to_positive_integers() {

    }

    @Test
    public void should_not_be_able_to_set_quantity_for_invalid_order_id() {

    }

    @Test
    public void should_add_item_to_order_if_it_did_not_exist_in_order() {

    }

    @Test
    public void should_not_be_able_to_add_invalid_product_to_order() {

    }
}
