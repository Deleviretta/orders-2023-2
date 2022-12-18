package pl.edu.wszib.orders.api.order;

public interface OrderFacadeApi {
    OrderResult createOrder(OrderCreateApi orderCreate);

    OrderResult getOrder(String orderId);

    /**
     * Adds one product to the specified order
     * @param orderId order identifier to which we want to add product
     * @param productId product identifier which we want to add to order
     * @return operation result
     */
    OrderResult addProduct(String orderId, String productId);

    /**
     * Remove a product from the order
     * @param orderId order identifier for which we want to remove product
     * @param productId product identifier which we want to remove
     * @return operation result
     */
    OrderResult removeProduct(String orderId, String productId);

    /**
     * Increases product quantity by one for the specified order
     * @param orderId order identifier for which we want to increase product quantity
     * @param productId product identifier which quantity we want to increase
     * @return operation result
     */
    OrderResult increaseProductQuantity(String orderId, String productId);

    /**
     * Decreases product quantity by one for the specified order, quantity can go below (or to) 0
     * @param orderId order identifier for which we want to decrease product quantity
     * @param productId product identifier which quantity we want to decrease
     * @return operation result
     */
    OrderResult decreaseProductQuantity(String orderId, String productId);

    /**
     * Updates product quantity for specified order; quantity can't be lower or equal to 0
     * @param orderId order identifier for which we want to change product number
     * @param productId product identifier for which we want to update quantity
     * @param newQuantity new amount of product in order
     * @return operation result
     */
    OrderResult setProductQuantity(String orderId, String productId, int newQuantity);
}
