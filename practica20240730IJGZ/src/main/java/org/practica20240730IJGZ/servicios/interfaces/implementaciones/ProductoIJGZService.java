package org.practica20240730IJGZ.servicios.interfaces.implementaciones;

import org.practica20240730IJGZ.modelos.ProductoIJGZ;
import org.practica20240730IJGZ.repositorios.IProductoRepositoryIJGZ;
import org.practica20240730IJGZ.servicios.interfaces.IProductoIJGZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductoIJGZService implements IProductoIJGZService {

    @Autowired
    private IProductoRepositoryIJGZ productoRepositoryIJGZ;
    @Override
    public Page<ProductoIJGZ> buscarTodosPaginados(Pageable pageable) {
        return productoRepositoryIJGZ.findAll(pageable);
    }

    @Override
    public List<ProductoIJGZ> obtenerTodos() {
        return productoRepositoryIJGZ.findAll();
    }

    @Override
    public Optional<ProductoIJGZ> buscarPorId(Integer id) {
        return productoRepositoryIJGZ.findById(id);
    }

    @Override
    public ProductoIJGZ crearOEditar(ProductoIJGZ producto) {
        return productoRepositoryIJGZ.save(producto);
    }

    @Override
    public void eliminarPorId(Integer id) {
        productoRepositoryIJGZ.deleteById(id);
    }

  

}
