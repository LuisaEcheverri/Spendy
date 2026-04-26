package com.example.Spendy.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.Spendy.modelos.MetodoPago;
import com.example.Spendy.repositorios.IMetodoPagoRepositorio;

@Service
public class MetodoPagoServicio {

    @Autowired
    private IMetodoPagoRepositorio repositorio;

    // Servicio para guardar un método de pago
    public MetodoPago guardar_metodoPago(MetodoPago datosMetodoPago) {

        if (datosMetodoPago.getNombre() == null || 
            datosMetodoPago.getNombre().isBlank() || 
            datosMetodoPago.getNombre().isEmpty()) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "El nombre del método de pago es obligatorio"
            );
        }

        return repositorio.save(datosMetodoPago);
    }

    // Servicio para listar todos los métodos de pago en BD
    public List<MetodoPago> listar_MetodosPago() {
        return repositorio.findAll();
    }

    // Servicio para buscar método de pago por id
    public MetodoPago buscarPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }

    // Servicio para eliminar un método de pago
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }

    // Servicio para actualizar un método de pago
    public MetodoPago actualizar(Long id, MetodoPago nuevo) {
        MetodoPago existente = repositorio.findById(id).orElse(null);

        if (existente != null) {
            existente.setNombre(nuevo.getNombre());
            return repositorio.save(existente);
        }
        return null;
    }
}