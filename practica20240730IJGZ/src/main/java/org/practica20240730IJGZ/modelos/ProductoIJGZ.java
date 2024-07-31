package org.practica20240730IJGZ.modelos;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "productosIJGZ")
public class ProductoIJGZ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank(message = "El nombre es requerido")
    public String nombreIJGZ;

    @NotBlank(message = "La descripción es requerida")
    public String descripcionIJGZ;

    @NotNull(message = "El precio es requerido")
    public BigDecimal precioIJGZ;

    @Temporal(TemporalType.DATE)
    public LocalDate fechaVencimientoIJGZ;

    @NotNull(message = "El estatus es requerido")
    public Byte estatusIJGZ;

    @NotNull(message = "La existencia es requerida")
    public Integer existenciaIJGZ;

    public ProductoIJGZ() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreIJGZ() {
        return nombreIJGZ;
    }

    public void setNombreIJGZ(String nombreIJGZ) {
        this.nombreIJGZ = nombreIJGZ;
    }

    public String getDescripcionIJGZ() {
        return descripcionIJGZ;
    }

    public void setDescripcionIJGZ(String descripcionIJGZ) {
        this.descripcionIJGZ = descripcionIJGZ;
    }

    public BigDecimal getPrecioIJGZ() {
        return precioIJGZ;
    }

    public void setPrecioIJGZ(BigDecimal precioIJGZ) {
        this.precioIJGZ = precioIJGZ;
    }

    public LocalDate getFechaVencimientoIJGZ() {
        return fechaVencimientoIJGZ;
    }

    public void setFechaVencimientoIJGZ(LocalDate fechaVencimientoIJGZ) {
        this.fechaVencimientoIJGZ = fechaVencimientoIJGZ;
    }

    public Byte getEstatusIJGZ() {
        return estatusIJGZ;
    }

    public void setEstatusIJGZ(Byte estatusIJGZ) {
        this.estatusIJGZ = estatusIJGZ;
    }

    public Integer getExistenciaIJGZ() {
        return existenciaIJGZ;
    }

    public void setExistenciaIJGZ(Integer existenciaIJGZ) {
        this.existenciaIJGZ = existenciaIJGZ;
    } 

}
