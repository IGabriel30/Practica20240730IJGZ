package org.practica20240730IJGZ.servicios.interfaces;

import java.util.List;
import java.util.Optional;

import org.practica20240730IJGZ.modelos.ProductoIJGZ;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductoIJGZService {

    Page<ProductoIJGZ> buscarTodosPaginados(Pageable pageable);

    List<ProductoIJGZ> obtenerTodos();

    Optional<ProductoIJGZ> buscarPorId(Integer id);

    ProductoIJGZ crearOEditar(ProductoIJGZ producto);

    void eliminarPorId(Integer id);
}
