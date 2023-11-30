package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyAbstract;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar extends CurrencyAbstract {

    public AustralianDollar(){
        this.name = "AUSTRALIAN_DOLLAR";
        this.currencyType = CurrencyType.getTypeOfCurrency(this);
    }

}
