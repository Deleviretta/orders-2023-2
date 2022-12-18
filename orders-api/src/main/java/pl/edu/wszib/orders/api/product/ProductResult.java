package pl.edu.wszib.orders.api.product;

// TODO TASK: use generic type (ApiResult) to reduce duplicated code
public interface ProductResult {
    ProductApi success();

    ProductError error();

    default boolean isSuccess() {
        return success() != null;
    }

    default boolean isError() {
        return !isSuccess();
    }

}
