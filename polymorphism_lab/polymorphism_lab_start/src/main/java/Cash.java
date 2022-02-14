public class Cash implements IPay {
    private int amount;

    public Cash(int amount) {
        this.amount = amount;
    }

    public String pay() {
        return "Cash is good";
    }
}
