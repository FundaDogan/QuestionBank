package Practice.week8;

import java.time.LocalDate;

public class Q02_MarketProductExpirationDate {

    // Type code to receive the name, price and expiration date of the product

    String productName;
    double productPrice;
    String expirationDate;

    public Q02_MarketProductExpirationDate(String name, double productPrice,int monthLeft) {
        this.productName = name;
        this.productPrice = productPrice;
        expirationDate = LocalDate.now().plusMonths(monthLeft).toString();
    }

    public Q02_MarketProductExpirationDate(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }


}
