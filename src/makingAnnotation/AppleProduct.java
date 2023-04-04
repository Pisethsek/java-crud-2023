package makingAnnotation;

@SmartPhone
public class AppleProduct {

    private Integer code;
    private String model;
    private Integer year;

    @Bluetooth(speed = "5GHz")
    private AppleBluetooth appleBluetooth;

    public AppleProduct(){}
   
    @Override
    public String toString() {
        return "AppleProduct [code=" + code + ", model=" + model + ", year=" + year + ", appleBluetooth="
                + appleBluetooth + "]";
    }

    public AppleProduct(Integer code, String model, Integer year, AppleBluetooth appleBluetooth) {
        this.code = code;
        this.model = model;
        this.year = year;
        this.appleBluetooth = appleBluetooth;
    }

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public AppleBluetooth getAppleBluetooth() {
        return appleBluetooth;
    }
    public void setAppleBluetooth(AppleBluetooth appleBluetooth) {
        this.appleBluetooth = appleBluetooth;
    }
    
}
