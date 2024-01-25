package com.olympus.olympushotel.repositories;

import com.olympus.olympushotel.entities.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabitacionRepository extends JpaRepository<Habitacion, Long> {
}
