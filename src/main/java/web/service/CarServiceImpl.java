package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    List<Car> carsList = new ArrayList<>();
    {
        carsList.add(new Car("yamaha", 600, 2012));
        carsList.add(new Car("honda", 400, 2011));
        carsList.add(new Car("kawasaki", 300, 2010));
        carsList.add(new Car("suzuki", 200, 2009));
        carsList.add(new Car("KTM", 150, 2008));
    }
    public List<Car> getCars(int count){
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
