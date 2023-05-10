/**
 * Clase que representa un Cliente
 *
 */
public class Cliente extends Persona {
	
	//Atributos
	private Long numeroCliente;
	
	
	//Constructores
	public Cliente() {
		
	}
	
	public Cliente(Long numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	//Métodos
	//Override: significa que el método de la superclase está sobreescrito
	@Override
	public void modificarStock(Producto producto, int cantidad) {
		System.out.println("El cliente " + numeroCliente + " compró " + cantidad 
				+ " unidades del producto " + producto.getNombre());
		producto.restarStock(cantidad);
	}

}
