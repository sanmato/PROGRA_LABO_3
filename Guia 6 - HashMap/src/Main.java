import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.google.gson.Gson;

public class Main {

	private static final Long ID_LECHE = 1L;
	private static final double PRECIO_LECHE = 5.49;
	private static final Long ID_ACEITE = 2L;
	private static final double PRECIO_ACEITE = 24.99;
	private static final Long ID_HARINA = 3L;
	private static final double PRECIO_HARINA = 16.35;
	

	public static void main(String[] args) {
		
		Producto leche = new Producto(ID_LECHE, "leche", 3, 5.49);
		Producto aceite = new Producto(ID_ACEITE, "aceite", 5, 24.99);
		Producto harina = new Producto(ID_HARINA, "harina", 4, 16.35);
		Producto queso = new Producto(4L, "queso", 3, 28.99);
//		
//		//No se puede hacer new de una clase abstracta!!! Por eso uso la jerarquía
		Persona cliente = new Cliente(1L);
		Persona proveedor = new Proveedor();
//		
		System.out.println("Total leche antes de que llegue el proveedor: " + leche.getStock());
		proveedor.modificarStock(leche, 5);
		System.out.println("Total leche después del proveedor: " + leche.getStock());
//		
		System.out.println("Total aceite antes de que llegue el cliente: " + aceite.getStock());
		cliente.modificarStock(aceite, 1);
		System.out.println("Total aceite después del cliente: " + aceite.getStock());
//		
//		
		Supermercado supermercado = new Supermercado();
		supermercado.agregarProducto(aceite.getId(), aceite);
		supermercado.agregarProducto(leche.getId(), leche);
		supermercado.agregarProducto(harina.getId(), harina);
		
		//supermercado.imprimirPrecios();

		Gson gson = new Gson();

		/*try{
			FileWriter writer = new FileWriter("productos.json");
			gson.toJson(supermercado, writer);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		String json = supermercado.readFile("productos.json");

		supermercado = gson.fromJson(json, supermercado.getClass());

		supermercado.agregarProducto(queso.getId(), queso);

		String nuevoJson = gson.toJson(supermercado);

		try(FileWriter writer = new FileWriter("productos.json", true)) {
			gson.toJson(writer);
			writer.flush();
			writer.close();
		} catch(Exception e) {
			e.printStackTrace();
		}


	}

}
