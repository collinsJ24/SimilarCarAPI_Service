package com.kliptokon.similar.car.service;

import com.kliptokon.similar.car.entity.CarMake;
import com.kliptokon.similar.car.entity.CarVIN;

import java.util.List;

public interface CarService {

    List<CarMake> getCarMakeInformation(Integer make_id);

    List<CarMake> getAllCars();

    List<CarVIN> getVIN_Details(String VIN);

}
