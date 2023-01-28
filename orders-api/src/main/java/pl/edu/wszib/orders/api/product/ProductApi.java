package pl.edu.wszib.orders.api.product;

import pl.edu.wszib.orders.api.ApiSuccess;

import java.math.BigDecimal;

public interface ProductApi extends ProductCreateApi, ApiSuccess {
    String id();

    @Override
    String name();

    // or JSR 354
    // https://github.com/JavaMoney/jsr354-api
    // https://github.com/JavaMoney/jsr354-ri
    @Override
    BigDecimal price();
}
