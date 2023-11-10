package seminars.second.hw;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUpVehicles(){
        car = new Car("someCompany", "someModel", 1970);
        motorcycle = new Motorcycle("someCompany", "someModel", 1970);
    }

    @AfterEach
    void destroyVehicles(){
        car = null;
        motorcycle = null;
    }

    @Test
    @DisplayName("Car является экземпляром транспортного средства")
    void checkIsinstanceOf(){
        assertInstanceOf(Vehicle.class, car, "car не является транспортным средством");
    }

    @Test
    @DisplayName("Car создается с 4-мя колесами")
    void checkCarHasFourWheels(){
        assertEquals(4, car.getNumWheels(), "у car количество колёс не равно 4");
    }

    @Test
    @DisplayName("Motorcycle создается с 2-мя колесами")
    void checkMotorcycleHasFourWheels(){
        assertEquals(2, motorcycle.getNumWheels(), "у motorcycle количество колёс не равно 4");
    }

    @Test
    @DisplayName("Car развивает скорость 60 в режиме тестового вождения")
    void checkCarSpeedInTestDriveMode(){
        car.testDrive();
        assertEquals(60, car.getSpeed(), "у car скорость в режиме тестового вождения не равна 60");
    }

    @Test
    @DisplayName("Motorcycle развивает скорость 75 в режиме тестового вождения")
    void checkMotorcycleSpeedInTestDriveMode(){
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed(), "у Motorcycle скорость в режиме тестового вождения не равна 75");
    }


    @Test
    @DisplayName("Car скорость 0 в режиме парковки")
    void checkCarSpeedInParkMode(){
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed(), "у car скорость в режиме парковки не равна 0");
    }

    @Test
    @DisplayName("Motorcycle скорость 0 в режиме парковки")
    void checkMotorcycleSpeedInParkMode(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed(), "у Motorcycle скорость в режиме парковки не равна 0");
    }



}