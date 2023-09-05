package controller;

import entities.Empleado;
import service.EmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ENUM.Trabajo;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

 private EmpleadoService empleadoService;

 @Autowired
 public EmpleadoController(EmpleadoService empleadoService) {
	this.empleadoService = empleadoService;
}

@GetMapping
 public List<Empleado> getAllEmpleados() {
     return empleadoService.getAllEmpleados();
 }

 @GetMapping("/{id}")
 public Empleado getEmpleado(@PathVariable Long id) {
     return empleadoService.getEmpleado(id);
 }

 @PostMapping("/new")
 public Empleado createEmpleado(@RequestBody Empleado empleadoDTO) {
     return empleadoService.createOrUpdateEmpleado(empleadoDTO);
 }

 @PutMapping("/{id}")
 public Empleado updateEmpleado(@PathVariable Long id, @RequestBody Empleado empleadoDTO) {
     return empleadoService.createOrUpdateEmpleado(empleadoDTO);
 }

 @DeleteMapping("/{id}")
 public void deleteEmpleado(@PathVariable Long id) {
     empleadoService.deleteEmpleado(id);
 }

 @GetMapping("/byTrabajo/{trabajo}")
 public List<Empleado> getEmpleadosByTrabajo(@PathVariable Trabajo trabajo) {
     return empleadoService.getEmpleadosByTrabajo(trabajo);
 }
}
