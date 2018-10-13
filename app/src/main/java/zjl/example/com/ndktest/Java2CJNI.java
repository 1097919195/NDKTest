package zjl.example.com.ndktest;

/**
 * Created by Administrator on 2018/10/13 0013.
 */

public class Java2CJNI {
    static {
        System.loadLibrary("Java2C");
    }
    public native String java2C();
}
