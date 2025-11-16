package Ejer1_Inventario;

public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public Producto(String id, String nombre, double precio, CategoriaProducto categoria) {

        if (id == null || id.isBlank()) throw new IllegalArgumentException("Id Obligatorio");
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre Obligatorio");
        if (precio < 0 )throw new IllegalArgumentException("El precio no puede ser negativo");
        if (cantidad < 0) throw new IllegalArgumentException("La cantidad no puede ser negativa");
        if (categoria == null) throw new IllegalArgumentException("Categoria Obligatoria");

        this.id = id.trim();
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isBlank()) throw new IllegalArgumentException("Nombre Obligatorio");
        this.nombre = nombre.trim();
    }

    public void setPrecio(double precio) {
        if(precio < 0) throw new IllegalArgumentException("el precio no puede ser negativo");
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        if(cantidad < 0) throw new IllegalArgumentException("la cantidad no puede ser negativa");
        this.cantidad = cantidad;
    }

    public void setCategoria(CategoriaProducto categoria) {
        if(categoria == null) throw new IllegalArgumentException("Categoria Obligatoria");
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }


    public void mostrarInfo() {
        String desc = "-";
        if (categoria != null) {
            desc = categoria.getDescripcion();
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
}














