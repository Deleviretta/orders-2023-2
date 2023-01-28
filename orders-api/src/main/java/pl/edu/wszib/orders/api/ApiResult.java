package pl.edu.wszib.orders.api;

public interface ApiResult<TSuccess extends ApiSuccess, TError extends Enum<?>> {
    TSuccess success();

    TError error();

    default boolean isSuccess() {
        return success() != null;
    }

    default boolean isError() {
        return !isSuccess();
    }
}
