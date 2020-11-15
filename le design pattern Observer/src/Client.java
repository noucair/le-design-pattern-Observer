
package obs;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObservableConcret sujet=new ObservableConcret();
		Observer1 obs1=new Observer1();
		sujet.addObserver(obs1);
		Observer2 obs2=new Observer2();
		sujet.addObserver(obs2);
		sujet.setEtat(8);
		sujet.setEtat(7);
		sujet.deleteObserver(obs1);
	

	}

}
