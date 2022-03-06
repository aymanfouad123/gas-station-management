import java.util.ArrayList;

public class LocalOffice implements ExamObserver, ExamObservable{

    private ArrayList<ExamObserver> localStationSub;
    private double gprice;

    public LocalOffice(){
    	 localStationSub = new ArrayList<ExamObserver>();
    };

    @Override
    public void add(ExamObserver station) {
        localStationSub.add(station);
    }

    @Override
    public void remove(ExamObserver station) {
        localStationSub.remove(station);
    }

    @Override
    public void pushUpdate() {
        for (ExamObserver obs : localStationSub){
            obs.update(this.gprice);
        }
    }

    @Override
    public void update(double gPrice) {
        this.gprice = gPrice;
    }
}
