package pe.edu.certus.items;

public class Items {
	String producto;
	String calidad;
	int precio;
	
	Items(String producto, String calidad,int precio){
		this.producto=producto;
		this.calidad=calidad;
		this.precio=precio;
	}
	public String getProducto() {
		return producto;
	}
	public String getCalidad() {
		return calidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setNombre(String producto) {
		this.producto=producto;
	}
	public void setApellido(String calidad) {
		this.calidad=calidad;
	}
	public void setEdad(int precio) {
		this.precio=precio;
	}


}
