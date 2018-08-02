package repository;

import Entity.Vehicle;

import java.util.HashMap;
import java.util.Map;

//There can be different repository for each entities
public class VehicleRepository {
    private Map<String, Vehicle> vehicles = new HashMap<>();

    public void createVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getType(), vehicle);
    }

    public Vehicle readVehicle(String vehicleType) {
        return vehicles.get(vehicleType);
    }

    public HashMap<String, Vehicle> readVehicles() {
        return new HashMap<>(vehicles);
    }

    public void deleteVehicle(String vehicleType) {
        vehicles.remove(vehicleType);
    }

}