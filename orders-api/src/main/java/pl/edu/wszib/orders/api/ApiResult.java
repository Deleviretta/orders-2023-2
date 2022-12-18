package pl.edu.wszib.orders.api;

public interface ApiResult<TSuccess, TError> {
    TSuccess success();

    TError error();

    default boolean isSuccess() {
        return success() != null;
    }

    default boolean isError() {
        return !isSuccess();
    }
}
