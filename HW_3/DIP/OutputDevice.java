package HW_3.DIP;

public class OutputDevice {
    public DataSource dataSource;

    public OutputDevice(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void displayData(){
        Data data = dataSource.getData();
        System.out.println(data);
    }
}
