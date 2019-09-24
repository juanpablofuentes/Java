select * from categorias;

select * from categorias join productos on categorias.idcategoria=productos.idcategoria;

select proveedores.nombre proveedor, productos.nombre producto, precio from
proveedores join producto_proveedor on proveedores.idproveedor=producto_proveedor.idproveedor
join productos on producto_proveedor.idproducto=productos.idproducto;