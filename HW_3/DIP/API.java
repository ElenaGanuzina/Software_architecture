package HW_3.DIP;

public class API implements DataSource {
    private Data data;

    @Override
    public Data getData() {
        System.out.println("Got data from API.");
        return data;
    }
    
}
