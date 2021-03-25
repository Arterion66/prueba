package tienda;
public class Producto {
public int unidades;
public double precio;
public String nombre_producto;
public int getUnidades() {
return unidades;
}
public void setUnidades(int unidades) {
this.unidades = unidades;
}
public double getPrecio() {
return precio;
}
public void setPrecio(double precio) {
this.precio = precio;
}
public String getNombre_producto() {
return nombre_producto;
}
public void setNombre_producto(String nombre_producto) {
this.nombre_producto = nombre_producto;
}
public boolean quedan_unidades() {
if (this.unidades>0)
return true;
else
return false;
}
}
