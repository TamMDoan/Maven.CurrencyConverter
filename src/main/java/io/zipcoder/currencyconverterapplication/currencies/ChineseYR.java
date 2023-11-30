package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR extends CurrencyAbstract {
    public ChineseYR(){
        this.name = "CHINESE_YR";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }
}
