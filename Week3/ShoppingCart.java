package Week3;

public class ShoppingCart {
    private double totalAmount;
    private double discountApplied;
    private PromotionCode promoCode;

//    We initialize all the instance variables to 0
    public ShoppingCart() {
        this.totalAmount = 0;
        this.discountApplied = 0;
        this.promoCode = null;
    }

//    This method says that in order to complete, we need to provide a PromotionCode whenever we use this method
    public void applyPromoCode(PromotionCode code) {
//        Once we have the promo code object here, we can access
//        the properties of the object and extract the data in the PromotionCode object and store the extracted values in another variable
        double percentDiscount = code.getDiscountPercentage();

//        Update discountApplied to a new value
        discountApplied = totalAmount*percentDiscount;
//        Update totalAmount
//        This does not create a NEW variable, it only updates the existing variable
//        A new variable is created only when we write -> int totalAmount = 100; (has the datatype in front of the variable name)
        this.totalAmount = totalAmount  - discountApplied;
        System.out.println("Your promo code was accepted, your new balance is " + totalAmount);
    }

    public void addItems(double amount) {
//        Update total amount
        this.totalAmount = totalAmount+amount;
        System.out.println("You've added an item that cost " + amount + ", your new balance is " + totalAmount);
    }

    public void removeItems(double amount) {
//        update total Amount
        this.totalAmount = totalAmount-amount;
        System.out.println("You've added an item that cost " + amount + ", your new balance is " + totalAmount);
    }

    public void removePromoCode() {
//        Update totalAmount
        this.totalAmount = totalAmount + discountApplied;
//        Update discountApplied
        this.discountApplied = 0;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(double discountApplied) {
        this.discountApplied = discountApplied;
    }

    public PromotionCode getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(PromotionCode promoCode) {
        this.promoCode = promoCode;
    }

}
