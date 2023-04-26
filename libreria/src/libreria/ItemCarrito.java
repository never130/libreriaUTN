package libreria;

public class ItemCarrito {
	// Declaro clase Producto y cantidad
	Producto producto;
	int cantidad;
	boolean esFisica;

	// Constructor de la clase
	public ItemCarrito(Producto producto, int cantidad, boolean esFisica) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.esFisica = esFisica;
	}

	// Condicionamos si la copia es fisica o digital
	public String getCopia() {
		return esFisica ? "Fisica" : "Digital";
	}

	// Hacemos el calculo con los porcentajes dados
	public double precio() {
		if (producto instanceof Libro) {
			return esFisica ? producto.getPrecio() * 1.18 * cantidad : producto.getPrecio() * 1.08 * cantidad;
		} else {
			return esFisica ? producto.getPrecio() * 1.22 * cantidad : producto.getPrecio() * 1.12 * cantidad;
		}

	}

}
