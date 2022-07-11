package Entidad;

public class Persona {
	private String nombre;
	private String apellido;
	private String domicilio;
	private String documento;

	public Persona() {
	}
	public Persona(String nombre, String apellido, String domicilio, String documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
}
