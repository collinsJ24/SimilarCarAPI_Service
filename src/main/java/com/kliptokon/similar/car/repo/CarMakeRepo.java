package com.kliptokon.similar.car.repo;

import com.kliptokon.similar.car.entity.CarMake;
import com.kliptokon.similar.car.model.CarResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarMakeRepo extends CrudRepository<CarMake, CarResponse> {

    @Query(value="select * from car_makes c where c.make_id = :make_id",nativeQuery=true)
    List<CarMake> findCarInfo(@Param("make_id") Integer make_id);
}
