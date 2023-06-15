package com.github.curriculeon;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate()/CurrencyType.getTypeOfCurrency(this).getRate();
    }
}
