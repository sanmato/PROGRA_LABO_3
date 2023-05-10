/**
 * Superclase de la jerarquía Cliente y Proveedor
 *
 */
public abstract class Persona {
	
	//Este método es abstract porque Cliente y proveedor hacen implementaciones distintas
	public abstract void modificarStock(Producto producto, int cantidad);

}
