package Week3;

public class Main {
    public static void main(String[] args) {
        //        First create a new Shopping cart instance, or object
        ShoppingCart cart = new ShoppingCart();
        //        Call addItems on this cart object. Which one of this cart's instance variables change as a result?
        cart.addItems(100);
        //        If you want to know, use the debugger or print to the console
        System.out.println(cart.getTotalAmount());

//        Create a new promo code object, with a promoCode property (String) and a discountPercentage property (double)
        PromotionCode code = new PromotionCode("TWENTY", 0.20);

//        Call cart's applyPromoCode method, but the method requires us to provide a PromoCode object. 
        cart.applyPromoCode(code);

        System.out.println("The total amount is " + cart.getTotalAmount());
        System.out.println("The discount amount is " + cart.getDiscountApplied());

    }
}
