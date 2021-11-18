package com.kliptokon.similar.car.repo;

import com.kliptokon.similar.car.entity.CarMake;
import com.kliptokon.similar.car.model.CarResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepo extends CrudRepository<CarMake, CarResponse> {

    @Query(value="select * from car_makes group by make_id order by make",nativeQuery=true)
    List<CarMake> findAllCars();
}
