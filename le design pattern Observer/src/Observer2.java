
package obs;

public class Observerer2 implements Observer  {
	@Override
	public void update(int o) {
		System.out.println("Observateur 2");
		System.out.println("Résultat :"+o*6);
		
	}
}
