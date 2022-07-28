package com.formacionbdi.app.productos.models.service;

import java.util.List;

import com.formacionbdi.app.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
