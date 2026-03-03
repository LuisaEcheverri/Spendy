package com.example.Spendy.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // Esta clase Java representa una tabla en la base de datos
@Table(name = "usuarios")  // Especifica el nombre de la tabla en la base de datos

public class Usuario {
 //id,nombres,tipodoc,documento,edad
 // Correo, telefono, salario, genero, contraseña

@Id // Indica que este campo es la clave primaria de la tabla
@GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica que el valor de este campo se generará automáticamente por la base de datos


private Integer id;
private String nombres;
private String tipoDocumento; 
private String documento;
private Integer edad;
private String correo;
private String telefono;    
private Double salario;
private String genero;
private String contraseña;

public Usuario() {
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getNombres() {
    return nombres;
}

public void setNombres(String nombres) {
    this.nombres = nombres;
}

public String getTipoDocumento() {
    return tipoDocumento;
}

public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
}

public String getDocumento() {
    return documento;
}

public void setDocumento(String documento) {
    this.documento = documento;
}

public Integer getEdad() {
    return edad;
}

public void setEdad(Integer edad) {
    this.edad = edad;
}

public String getCorreo() {
    return correo;
}

public void setCorreo(String correo) {
    this.correo = correo;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public Double getSalario() {
    return salario;
}

public void setSalario(Double salario) {
    this.salario = salario;
}

public String getGenero() {
    return genero;
}

public void setGenero(String genero) {
    this.genero = genero;
}

public String getContraseña() {
    return contraseña;
}

public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
}




}
