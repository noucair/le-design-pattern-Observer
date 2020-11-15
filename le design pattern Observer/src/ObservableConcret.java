package obs;
import java.util.List;
import java.util.ArrayList;

public class ObservableConcret implements Observable{
	 private List<Observer> observers=new ArrayList<>();
	    private int etat;
		public int getEtat() {
			return etat;
		}

		public void setEtat(int etat) {
			this.etat = etat;
			notifyObservers();
		}

		@Override
		public void addObserver(Observer o) {
			observers.add(o);
			
		}

		@Override
		public void deleteObserver(Observer o) {
			observers.remove(o);
			
		}

		@Override
		public void notifyObservers() {
			for(Observer o:observers) {
				o.update(etat);
			}
				
		}
}
