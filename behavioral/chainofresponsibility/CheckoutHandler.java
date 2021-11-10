package behavioral.chainofresponsibility;

public abstract class CheckoutHandler {

    protected CheckoutHandler nextHandler;

    public abstract void handlCheckout();

    public void setNextHandler(CheckoutHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
