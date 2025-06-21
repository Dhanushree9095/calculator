class WaterTank {
    int capacity = 50; // Starting water level
}

class Inlet extends Thread {
    WaterTank tank;
    Inlet(WaterTank tank) {
        this.tank = tank;
    }

    public void run() {
        if (tank.capacity < 80) {
            tank.capacity += 10;
            System.out.println("Inlet ON - Capacity: " + tank.capacity + "L");
        }
    }
}

class Outlet extends Thread {
    WaterTank tank;
    Outlet(WaterTank tank) {
        this.tank = tank;
    }

    public void run() {
        if (tank.capacity > 80) {
            tank.capacity -= 10;
            System.out.println("Outlet ON - Capacity: " + tank.capacity + "L");
        }
    }
}

class WaterController extends Thread {
    WaterTank tank;
    WaterController(WaterTank tank) {
        this.tank = tank;
    }

    public void run() {
        System.out.println("Starting WaterController...");
        
        if (tank.capacity < 80) {
            Inlet inlet = new Inlet(tank);
            inlet.start();
        } else if (tank.capacity > 80) {
            Outlet outlet = new Outlet(tank);
            outlet.start();
        } else {
            System.out.println("Water level is stable at 80L");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        WaterTank tank = new WaterTank();             // Shared tank
        WaterController controller = new WaterController(tank);
        controller.start();                           // Start monitoring
    }
}
