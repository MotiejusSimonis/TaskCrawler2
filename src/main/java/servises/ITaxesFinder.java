package servises;

import java.math.BigDecimal;

public interface ITaxesFinder {
    BigDecimal find(String sourceCode, BigDecimal price);
}
