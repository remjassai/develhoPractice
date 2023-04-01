package Challenges.shopCatalog;

public interface Discount {

    /***
     * applies discount to product (modifies the discount attribute of that object)
     * @param discount to apply
     */
    void applyDiscount(double discount);

    /***
     * returns the discounted price of the object
     * @return the total discounted price based on the discount applied to that object
     */
    double calculateDiscountPrice();


}
