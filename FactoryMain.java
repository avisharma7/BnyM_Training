import com.phone.Android;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;
import com.phone.os;
public class FactoryMain {
    public static void main(String [] args){
        OperatingSystemFactory osf = new OperatingSystemFactory();
        os obj = osf.getInstance("");
        obj.specs();
    }
}
