import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Supermercado {

	private Map<Long, Producto> productos = new HashMap<>();
	
	public Supermercado() {
		
	}

	@Override
	public String toString() {
		return "Supermercado{" +
				"productos=" + productos +
				'}';
	}

	public void agregarProducto(Long idProducto, Producto value) {
		productos.put(idProducto, value);
	}

	public Producto buscarProducto(Long idProducto) {
		Producto[] buscado = {null};
		productos.forEach((key, value) -> {
			if(key == idProducto) {
				buscado[0] = value;
			}
		});
		return buscado[0];
	}
	
	public void modificarPrecio(Long idProducto, Double precio) {
		Producto encontrado = buscarProducto(idProducto);
		if(encontrado != null) {
			encontrado.setPrecio(precio);
			productos.put(idProducto, encontrado);
		}
	}
	
	public void eliminarProducto(Long idProducto) {
		if (productos.containsKey(idProducto)) {
			productos.remove(idProducto);
		}
		else {
			System.out.println("No existe el producto: " + idProducto);
		}
	}
	
	public Double getPrecio(Long idProducto) {
		Producto encontrado = buscarProducto(idProducto);
		double precio = -1;
		if(encontrado != null) {
			precio = encontrado.getPrecio();
		}
		return precio;
	}
	
	public void imprimirPrecios() {
		productos.forEach((key, value) -> {
			System.out.println("Producto: "+key+" - "+"Informacion: "+value.toString());
		});
	}

	public static String readFile(String route) {
		StringBuilder sb = new StringBuilder();

		try(BufferedReader br = new BufferedReader(new FileReader(route))) {
			String line;
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
				e.printStackTrace();
		}
		return sb.toString();
	}
}
