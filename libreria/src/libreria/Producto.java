package libreria;

public abstract class Producto {
	// Declaramos variables para las clases hijas, Libro y Revista
	protected double precio;
	protected int cantidad;
	protected int codigo;
	protected String titulo;
	protected String editor;
	protected String fechaPublicacion;

	// Constructor del producto con todos sus parametros
	public Producto(double precio, int cantidad, int codigo, String titulo, String editor, String fechaPublicacion) {
		this.precio = precio;
		this.cantidad = cantidad;
		this.codigo = codigo;
		this.titulo = titulo;
		this.editor = editor;
		this.fechaPublicacion = fechaPublicacion;
	}

	// Para modificar los parametros del titulo y cantidad
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	// Metodos getters
	public String getTitulo() {
		return titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getEditor() {
		return editor;
	}

	public double getPrecio() {
		return precio;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

}
