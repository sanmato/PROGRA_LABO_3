public class Customer {
    private PaymentMethod paymentMethod;
    private CustomerType type;
    private Integer itemQuantity;

    public Customer(PaymentMethod paymentMethod, CustomerType type, Integer itemQuantity) {
        this.paymentMethod = paymentMethod;
        this.type = type;
        this.itemQuantity = itemQuantity;
    }

    public Customer() {
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "Customer [paymentMethod=" + paymentMethod + ", type=" + type + ", itemQuantity=" + itemQuantity + "]";
    }

    public int calculateTimeInCheckout() {
        int baseTime = itemQuantity * 30;
        double timeModifier = 1.0;

        switch (type) {
            case COMUN:
                timeModifier += 0.15;
                break;
            case JUBILADO:
                timeModifier += 0.25;
                break;
            case EMBARAZADA:
                timeModifier += 0.20;
                break;
        }

        switch (paymentMethod) {
            case EFECTIVO:
                timeModifier += 0.10;
                break;
            case TARJETA_SIN_PROBLEMAS:
                timeModifier += 0.15;
                break;
            case TARJETA_CON_PROBLEMAS:
                timeModifier += 0.50;
                break;
        }
        return (int) (baseTime * timeModifier);
    }

}
