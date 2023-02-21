package Carrito;

public class App {

	public static void main(String[] args) {
		
		//Crear nuevo cliente
		
		Cliente cliente = new Cliente();
		
		cliente.setDni("123456789X");
		cliente.setNombre("Blas de los Montes");
		
		Carrito carrito = new Carrito();
		imprimirLista();
		carrito.setCliente(cliente);
		
		Ropa poncho = new Ropa();
		poncho.setDescripcion("Poncho");
		poncho.setPrecio(20);
		poncho.setTalla("XL");

	}
	
	public static void imprimirLista() {
		Carrito carrito = new Carrito();
		if(carrito.getListaArticulos().isEmpty()) {
			System.out.println("Tu lista de articulos esta vacia");
		}else {
			System.out.println(carrito.getListaArticulos());
		}
	}

}
