package obs;
public class Observer1 implements Observer {
	@Override
	public void update(int o) {
		System.out.println("Observateur 1");
		System.out.println("R�sultat :"+o*3);
		
	}
}
