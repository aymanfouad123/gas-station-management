public class GasStation implements ExamObserver{

    private double gprice;

    public GasStation(){};

    public double getGasPrice() {
        return gprice;
    }

    @Override
    public void update(double gasPrice) {
        this.gprice = gasPrice;
    }
}
