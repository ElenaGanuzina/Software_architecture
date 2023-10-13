package HW_3.DIP;

public class DataBase implements DataSource {

    private Data data;

    @Override
    public Data getData() {
        System.out.println("Got data from database.");
        return data;
    }
    
}
