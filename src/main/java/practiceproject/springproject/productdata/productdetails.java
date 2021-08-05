package practiceproject.springproject.productdata;

import practiceproject.springproject.productdata.productdata;

public class productdetails {

    public String addProduct(int[] device){
        new hashing().create(device, device.length);
        return "Done";
    }

    public boolean returnProduct(int num){
        return new hashing().search(num);
    }
}
