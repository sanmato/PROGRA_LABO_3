/**
 * Clase que representa un Proveedor
 *
 */
public class Proveedor extends Persona {

	//Métodos
	//Override: significa que el método de la superclase está sobreescrito
	@Override
	public void modificarStock(Producto producto, int cantidad) {
		System.out.println("Se incrementó el stock del producto " + producto.getNombre());
		producto.sumarStock(cantidad);
	}

}
