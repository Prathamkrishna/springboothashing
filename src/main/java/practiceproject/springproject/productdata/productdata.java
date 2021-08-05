package practiceproject.springproject.productdata;

public class productdata {

    public String deviceName;

    public void addDevice(String device){
        deviceName = device;
    }
    public String returnDevices(){
        System.out.println(deviceName);
        return deviceName;
    }
}
