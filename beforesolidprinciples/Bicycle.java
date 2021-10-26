package beforesolidprinciples;

public class Bicycle extends Transportation{


    @Override
    public void delivers_through_Vehicle()  // Violates Liskov because Bicycle will not have engine
    {
        throw new UnsupportedOperationException();
    }

}

