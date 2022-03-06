import java.util.ArrayList;

public class HeadOffice implements ExamObservable{

    private ArrayList<ExamObserver> headStationSub;
    private double gprice;

    public HeadOffice(){
    	headStationSub = new ArrayList<ExamObserver>();
    };

    @Override
    public void add(ExamObserver gstation) {
        headStationSub.add(gstation);
    }

    @Override
    public void remove(ExamObserver gstation) {
        headStationSub.remove(gstation);
    }

    @Override
    public void pushUpdate() {
        for (ExamObserver obs : headStationSub){
            obs.update(this.gprice);
        }
    }

    public void setPrice(double gprice){
        this.gprice = gprice;
        pushUpdate();
    }

}
