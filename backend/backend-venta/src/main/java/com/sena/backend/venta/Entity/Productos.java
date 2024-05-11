package com.sena.backend.venta.Entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos extends ABaseEntity {
    @Column(name = "nombre_producto", length = 45, nullable = false)
    private String nombreProducto;

    @Column(name = "descripcion", length = 45, nullable = false)
    private String descripcion;

    @Column(name = "cantidad", length = 45, nullable = false)
    private Integer cantidad;

    @Column(name = "precio", precision = 9, scale = 2, nullable = false)
    private BigDecimal precio;

    @Column(name = "procentale_iva", length = 45, nullable = false)
    private Integer procentaleIva;

    @Column(name = "procentale_descuento", length = 45, nullable = false)
    private Integer procentajeDescuento;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getProcentaleIva() {
        return procentaleIva;
    }

    public void setProcentaleIva(Integer procentaleIva) {
        this.procentaleIva = procentaleIva;
    }

    public Integer getProcentajeDescuento() {
        return procentajeDescuento;
    }

    public void setProcentajeDescuento(Integer procentajeDescuento) {
        this.procentajeDescuento = procentajeDescuento;
    }







    
}