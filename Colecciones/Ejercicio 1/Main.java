package Ejer1_Inventario;

import java.util.List;

        public class Main {
            public static void main(String[] args) {
                Inventario inv = new Inventario();

                // 1) Alta de productos
                inv.agregarProducto(new Producto("P-001", "Arroz 1kg", 950, 40, CategoriaProducto.ALIMENTOS));
                inv.agregarProducto(new Producto("P-002", "TV 43\"", 285000, 5, CategoriaProducto.ELECTRONICA));
                inv.agregarProducto(new Producto("P-003", "Remera algodón", 6500, 25, CategoriaProducto.ROPA));
                inv.agregarProducto(new Producto("P-004", "Sábana 2 plazas", 12000, 12, CategoriaProducto.HOGAR));
                inv.agregarProducto(new Producto("P-005", "Yerba 1kg", 2500, 60, CategoriaProducto.ALIMENTOS));

                // 2) Listar
                System.out.println("\n== LISTAR ==");
                inv.listarProductos();

                // 3) Buscar por ID
                System.out.println("\n== BUSCAR P-003 ==");
                Producto buscado = inv.buscarProductoPorId("P-003");
                System.out.println(buscado != null ? buscado : "(no encontrado)");

                // 4) Actualizar stock
                System.out.println("\n== ACTUALIZAR STOCK P-005 a 80 ==");
                inv.actualizarStock("P-005", 80);
                System.out.println(inv.buscarProductoPorId("P-005"));

                // 5) Filtrar por categoría
                System.out.println("\n== FILTRAR: ALIMENTOS ==");
                List<Producto> alimentos = inv.filrarPorCategoria(CategoriaProducto.ALIMENTOS);
                alimentos.forEach(System.out::println);

                // 6) Total de stock
                System.out.println("\n== TOTAL STOCK ==");
                System.out.println(inv.obtenerStock());

                // 7) Mayor stock
                System.out.println("\n== MAYOR STOCK ==");
                System.out.println(inv.obtenerMayorStock());

                // 8) Filtrar por precio [1000..3000]
                System.out.println("\n== PRECIO ENTRE 1000 y 3000 ==");
                inv.filtrarProductoPorPrecio(1000, 3000).forEach(System.out::println);

                // 9) Eliminar por ID
                System.out.println("\n== ELIMINAR P-002 ==");
                System.out.println("Eliminado: " + inv.eliminarProducto("P-002"));
                inv.listarProductos();

                // 10) Categorías disponibles
                System.out.println("\n== CATEGORÍAS DISPONIBLES ==");
                inv.mostrarCategoriasDisponibles();
            }
        }

