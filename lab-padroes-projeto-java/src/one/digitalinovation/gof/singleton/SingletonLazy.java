package one.digitalinovation.gof.singleton;

/**
 * Singleton "pregui�oso". 
 * Assistido da aula da DIO. PASSO A PASSO
 * 
 * @author falvojr
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}