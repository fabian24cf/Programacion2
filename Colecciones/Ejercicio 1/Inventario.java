package Ejer1_Inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private final List<Producto> productos = new ArrayList<>();

    public boolean agregarProducto(Producto p){
        if (p == null) return false;
        if (buscarProductoPorId(p.getId())!= null) return false;
        return productos.add(p);
    }

    public void listarProductos(){
        if (productos.isEmpty()){
            System.out.println("El inventario esta Vacio");
            return;
        }
        for (Producto p : productos){
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        if (id == null) return null;
        String clave = id.trim();
        for (Producto p : productos) {
            if (p.getId().equals(clave)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id) {
        if (id == null) return false;
        String clave = id.trim();
        return productos.removeIf(p -> p.getId().equals(clave));
    }

    public boolean actualizarStock(String id, int nuevaCantidad){
        if (nuevaCantidad < 0) throw new IllegalArgumentException("cantidad invalida");
        Producto p = buscarProductoPorId(id);
        if (p == null) return false;
        p.setCantidad(nuevaCantidad);
        return true;
    }

    public List<Producto>filrarPorCategoria(CategoriaProducto categoria){
        List<Producto> out = new ArrayList<>();
        for (Producto p : productos){
            if(p.getCategoria() == categoria){
                out.add(p);
            }
        }
        return out;
    }

    public int obtenerStock(){
        int total = 0;
        for (Producto p : productos){
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerMayorStock(){
        if(productos.isEmpty()) return null;
        Producto max = productos.get(0);
        for (Producto p : productos){
            if(p.getCantidad() > max.getCantidad()){
                max = p;
            }
        }
        return max;
    }

    public List<Producto> filtrarProductoPorPrecio(double min, double max){
        if (min > max) throw new IllegalArgumentException("El minimo no puede ser mayor que el maximo");
        List<Producto> out = new ArrayList<>();
        for (Producto p : productos){
            double precio = p.getPrecio();
            if (precio >= min & precio <= max){
                out.add(p);
            }
        }
        return out;
    }

    public void mostrarCategoriasDisponibles(){
        for(CategoriaProducto c : CategoriaProducto.values()){
            System.out.println(c.name()+"-" + c.getDescripcion());
        }
    }

    public List<Producto> getProductos(){
        return new ArrayList<>(productos);
    }


}
