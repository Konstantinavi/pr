package planes;

public class MyPlane extends Plane {
    
    public MyPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }

    @Override
    public String toString() {
        return "MyPlane{" +
                "super=" + super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

