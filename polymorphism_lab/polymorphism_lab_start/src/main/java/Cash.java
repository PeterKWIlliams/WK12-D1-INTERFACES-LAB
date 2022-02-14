public class Cash implements IPay {
    private int amount;

    public Cash(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String pay() {
        return "I paid";
    }
}
