package Week3;

public class PromotionCode {
    private String promoCode;
    private double discountPercentage;

    public PromotionCode(String promoCode, double discountPercentage) {
        this.promoCode = promoCode;
        this.discountPercentage = discountPercentage;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
