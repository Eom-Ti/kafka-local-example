package com.example.coin.data.log;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.ZonedDateTime;

public record CoinPriceDiff(
        String market,
        BigDecimal diff,
        ZonedDateTime candleTime
) {
    public boolean isIncrease() {
        return diff.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isSame() {
        return diff.equals(BigDecimal.ZERO.setScale(6, RoundingMode.HALF_UP));
    }
}
