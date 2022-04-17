package com.cts.carstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.carstore.exception.ApplicationException;
import com.cts.carstore.model.Car;
import com.cts.carstore.model.CarSearch;

@Service
public class CarStoreService {

	public List<Car> getCarSearchResult(CarSearch carSearch)
									throws ApplicationException {
		//Add code here..
		List<Car> list=new ArrayList<Car>();
		List<Car> available=buildCars();
		if(carSearch.getBudgetUpto().startsWith("Below"))
			throw new ApplicationException();
		
		int budgetLimit=Integer.parseInt(carSearch.getBudgetUpto().substring(0,2).trim());
		for(Car car:available) {
			if(car.getBrandName().equalsIgnoreCase(carSearch.getBrand())&&
					car.getFuelType().equalsIgnoreCase(carSearch.getFuelType())
					&& car.getPrice()<=budgetLimit) {
				list.add(car);
			}
		}
		
		return list;  //TODO, modify this return value
	}

	
	// DO NOT CHANGE THIS METHOD 
	//DO NOT CHANGE CODE WITHIN METHOD
	private List<Car> buildCars() {
		List<Car> cars = new ArrayList<Car>();
		// brand,modelName,price,fuelType,seatingCapacity
		Car car1 = new Car("Maruti Suzuki", "Swift", 5.20, "Petrol", 21.21, 5);
		Car car2 = new Car("Maruti Suzuki", "Alto", 3, "Petrol", 22.05, 5);
		Car car3 = new Car("Maruti Suzuki", "Ertiga LXi", 7.5, "Petrol", 19.01, 7);
		Car car4 = new Car("Maruti Suzuki", "Ertiga VXi", 8.9, "CNG", 26.2, 7);
		Car car5 = new Car("Maruti Suzuki", "WagonR", 4.5, "Petrol", 20.52, 5);
		Car car6 = new Car("Maruti Suzuki", "WagonR LXi", 5.20, "CNG", 32.52, 5);
		Car car7 = new Car("Honda", "Amaze", 6.20, "Petrol", 18.6, 5);
		Car car8 = new Car("Honda", "Amaze1.2E MT", 7.6, "Diesel", 24.7, 5);
		Car car9 = new Car("Honda", "Amaze1.5E MT", 8, "Diesel", 25.2, 5);
		Car car10 = new Car("Honda", "City", 9.30, "Petrol", 17.4, 5);
		Car car11 = new Car("Mahindra", "KUV100", 5.6, "Petrol", 15, 6);
		Car car12 = new Car("Toyota", "Yaris", 8.8, "Petrol", 18.1, 5);
		Car car13 = new Car("Hundai", "Aura", 7.30, "CNG", 20.5, 5);
		Car car14 = new Car("Hundai", "Creta", 9.9, "Petrol", 21.5, 5);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		cars.add(car8);
		cars.add(car9);
		cars.add(car10);
		cars.add(car11);
		cars.add(car12);
		cars.add(car13);
		cars.add(car14);

		return cars;
	}	 	  	 	      	      	 	      	   	 	

}
