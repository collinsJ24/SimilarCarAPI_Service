package com.kliptokon.similar.car.controllers;


import com.kliptokon.similar.car.entity.CarMake;
import com.kliptokon.similar.car.entity.CarVIN;
import com.kliptokon.similar.car.model.CarResponse;
import com.kliptokon.similar.car.service.CarService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }


    @GetMapping(path="/cars")
    //@RequestMapping(value = "/car/{make_id}/",method = RequestMethod.GET)
    public List<CarMake> getAllCarMakes(){
        List<CarResponse> response = new ArrayList<>();
        List<CarMake> carMakes = carService.getAllCars();
        BeanUtils.copyProperties(carMakes, response);
        return carMakes;
    }

   @GetMapping(path="/{make_id}")
    //@RequestMapping(value = "/car/{make_id}/",method = RequestMethod.GET)
    public List<CarMake> getCarMakeModels(@PathVariable Integer make_id){
        List<CarResponse> response = new ArrayList<>();
        List<CarMake> carModels = carService.getCarMakeInformation(make_id);
        BeanUtils.copyProperties(carModels, response);
        return carModels;
    }

    @GetMapping(path="/cars/VIN/{VIN}")
    public List<CarVIN> getCarVinDetails(@PathVariable String VIN){
        List<CarVIN> carVinDetails = carService.getVIN_Details(VIN);
        return carVinDetails;

    }

}
