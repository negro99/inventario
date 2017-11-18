/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Roberto
 */
public class Registrar_Producto {
    private String codigoEAN;
    private String nombre_corto;
    private String nombre_largo;
    private String descripcion;
    private String precio_venta;
    private String precio_compra;
    private String largo;
    private String ancho;
    private String alto;
    private String stock;
    private String categoria;
    private String fecha_de_vencimiento;
    
    public Registrar_Producto(String codigoEAN, String nombre_corto, String nombre_largo, String descripcion, String precio_venta, String precio_compra, String largo, String ancho, String alto, String stock,String categoria, String fecha_de_vencimiento) {
        this.codigoEAN = codigoEAN;
        this.nombre_corto = nombre_corto;
        this.nombre_largo = nombre_largo;
        this.descripcion = descripcion;
        this.precio_venta = precio_venta;
        this.precio_compra = precio_compra;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.categoria = categoria;
        this.fecha_de_vencimiento = fecha_de_vencimiento;
    }

    public String getCodigoEAN() {
        return codigoEAN;
    }

    public void setCodigoEAN(String codigoEAN) {
        this.codigoEAN = codigoEAN;
    }

    public String getNombre_corto() {
        return nombre_corto;
    }

    public void setNombre(String nombre_corto) {
        this.nombre_corto = nombre_corto;
    }
      public String getNombre_largo() {
        return nombre_largo;
    }

    public void setNombre_largo(String nombre_largo) {
        this.nombre_largo = nombre_largo;
    }

    public String getDescrpcion() {
        return descripcion;
    }

    public void setDescrpcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(String precio_compra) {
        this.precio_compra = precio_compra;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }
    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }
    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }
        public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecha_de_vencimiento() {
        return fecha_de_vencimiento;
    }

    public void setFecha_de_vencimiento(String fecha_de_vencimiento) {
        this.fecha_de_vencimiento = fecha_de_vencimiento;
    }


}
