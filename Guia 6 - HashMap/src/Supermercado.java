import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Supermercado {

	private Map<Long, Producto> productos = new HashMap<>();

	public Supermercado() {

	}

	public Map<Long, Producto> getProductos() {
		return productos;
	}

	public void setProductos(Map<Long, Producto> productos) {
		this.productos = productos;
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
		Producto[] buscado = { null };
		productos.forEach((key, value) -> {
			if (key == idProducto) {
				buscado[0] = value;
			}
		});
		return buscado[0];
	}

	public void modificarPrecio(Long idProducto, Double precio) {
		Producto encontrado = buscarProducto(idProducto);
		if (encontrado != null) {
			encontrado.setPrecio(precio);
			productos.put(idProducto, encontrado);
		}
	}

	public void eliminarProducto(Long idProducto) {
		if (productos.containsKey(idProducto)) {
			productos.remove(idProducto);
		} else {
			System.out.println("No existe el producto: " + idProducto);
		}
	}

	public Double getPrecio(Long idProducto) {
		Producto encontrado = buscarProducto(idProducto);
		double precio = -1;
		if (encontrado != null) {
			precio = encontrado.getPrecio();
		}
		return precio;
	}

	public void imprimirPrecios() {
		productos.forEach((key, value) -> {
			System.out.println("Producto: " + key + " - " + "Informacion: " + value.toString());
		});
	}

	public static String readFile(String route) {
		StringBuilder sb = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new FileReader(route))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void writeFile(Map<Long, Producto> data) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		File file = new File("productos.json");
		try {
			if (!file.exists()) {
				createNewFileWithData(file, data, gson);
			} else {
				if (file.length() == 0) {
					writeDataToFile(file, data, gson);
				} else {
					appendDataToFile(file, data, gson);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createNewFileWithData(File file, Map<Long, Producto> data, Gson gson) throws IOException {
		createFile(file);
		writeDataToFile(file, data, gson);
	}

	private static void createFile(File file) throws IOException {
		file.createNewFile();
	}

	private static void writeDataToFile(File file, Map<Long, Producto> data, Gson gson) throws IOException {
		try (FileWriter writer = new FileWriter(file)) {
			gson.toJson(data, writer);
		}
	}

	private static void appendDataToFile(File file, Map<Long, Producto> data, Gson gson) throws IOException {
		Map<Long, Producto> existingData = readDataFromFile(file, gson);
		existingData.putAll(data);
		writeDataToFile(file, existingData, gson);
	}

	private static Map<Long, Producto> readDataFromFile(File file, Gson gson) throws IOException {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			StringBuilder stringBuilder = new StringBuilder();
			String currentLine;
			while ((currentLine = bufferedReader.readLine()) != null) {
				stringBuilder.append(currentLine.trim());
			}
			return gson.fromJson(stringBuilder.toString(), new TypeToken<Map<Long, Producto>>() {
			}.getType());
		}
	}
}
