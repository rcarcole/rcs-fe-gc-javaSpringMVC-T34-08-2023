package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ENUM.Trabajo;
import entities.Empleado;

public interface EmpleadoRepository extends JpaRepository <Empleado, Long>{

	List<Empleado> findByTrabajo(Trabajo trabajo);

}