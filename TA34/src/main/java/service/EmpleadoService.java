package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.EmpleadoRepository;
import ENUM.Trabajo;
import entities.Empleado;

import java.util.List;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    public Empleado getEmpleado(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    public Empleado createOrUpdateEmpleado(Empleado empleadoDTO) {
        return empleadoRepository.save(empleadoDTO);
    }

    public void deleteEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }

    public List<Empleado> getEmpleadosByTrabajo(Trabajo trabajo) {
        return empleadoRepository.findByTrabajo(trabajo);
    }
}
