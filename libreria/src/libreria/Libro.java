package libreria;

public class Libro extends Producto {
	// Variable unica de Libro
	private String autor;

	// Constructor de la clase Libro
	public Libro(double precio, int cantidad, int codigo, String titulo, String autor, String editor,
			String fechaPublicacion) {
		super(precio, cantidad, codigo, titulo, editor, fechaPublicacion);
		this.autor = autor;
	}

	// Obtencion del autor mediante get
	public String getAutor() {
		return autor;
	}
}
