/**
 * Clase que representa un Producto
 *
 */
public class Producto {
	
	//Atributos
	private Long id;
	private String nombre;
	private int stock;

	private double precio;
	
	//Constructores
	//Ejemplo 1: Constructor vacío
	public Producto() {
		
	}
	
	//Ejemplo 2: Inicializa el producto de nombre "nombre" con stock "stock"
	public Producto(String nombre, int stock, double precio) {
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}

	//Ejemplo 3: Prestar atención al uso de "this"
	public Producto(Long id, String nombre, int stock, double precio) {
		this(nombre, stock, precio);
		this.id = id;
	}
	

	//Métodos
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void sumarStock(int cantidad) {
		this.stock += cantidad;
	}
	
	public void restarStock(int cantidad) {
		this.stock -= cantidad;
	}

	@Override
	public String toString() {
		return 	"nombre='" + nombre + '\'' +
				", stock=" + stock +
				", precio=" + precio;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			if (o instanceof Producto) {
				return this.getId().equals(((Producto) o).getId()) && 
						this.getNombre().equals(((Producto) o).getNombre()) && 
						this.getStock() == ((Producto) o).getStock();
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		 final int prime = 31;
		 int result = 1;
		 result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		 return result;
	}
 	
}
