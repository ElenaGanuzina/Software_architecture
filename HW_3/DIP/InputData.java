package HW_3.DIP;

public class InputData implements DataSource{
    private Data data;

    @Override
    public Data getData() {
        System.out.println("Got data from input source.");
        return data;
    }
    
}
