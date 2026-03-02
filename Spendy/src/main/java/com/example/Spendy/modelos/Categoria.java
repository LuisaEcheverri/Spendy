package com.example.Spendy.modelos;

import java.time.LocalDate;

import jakarta.persistence.Entity;

//las anotaciones se copian encima donde quiero dar funcionalidad
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

 // anotación de Springboot para poder crear una tabla de base de datos 
 @Entity

 // asigna nombre a la tabla 
 @Table(name = "categoria")
 //Crear llaves primarias (UUAD)

public class Categoria {
    //Para especificar cuál srá la primary key de la tabla
    @Id
    //Para decirle que la base de datos se va a encargar de generar el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
   

    //id,nombre,fechaCreacion,responsable,justificacion
    private Integer id;
    private String nombre;
    private LocalDate fechaCreacion;
    private String responsable;
    private Integer edad;
    private String justificacion;

    // Nuevos atributos
    private Double presupuestoAsignado;
    private Double montoGastado;
    private String estado;
    private Integer prioridad;
    private String tipo; //→ Define si la categoría es fija, variable, ocasional, etc
    public Categoria(Integer id, String nombre, LocalDate fechaCreacion, String responsable, Integer edad,
            String justificacion, Double presupuestoAsignado, Double montoGastado, String estado, Integer prioridad,
            String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.responsable = responsable;
        this.edad = edad;
        this.justificacion = justificacion;
        this.presupuestoAsignado = presupuestoAsignado;
        this.montoGastado = montoGastado;
        this.estado = estado;
        this.prioridad = prioridad;
        this.tipo = tipo;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public String getResponsable() {
        return responsable;
    }
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getJustificacion() {
        return justificacion;
    }
    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
    public Double getPresupuestoAsignado() {
        return presupuestoAsignado;
    }
    public void setPresupuestoAsignado(Double presupuestoAsignado) {
        this.presupuestoAsignado = presupuestoAsignado;
    }
    public Double getMontoGastado() {
        return montoGastado;
    }
    public void setMontoGastado(Double montoGastado) {
        this.montoGastado = montoGastado;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Integer getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}







