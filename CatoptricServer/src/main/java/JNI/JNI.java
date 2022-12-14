package JNI;

public class JNI {
    static {
        System.loadLibrary("catoptric_cpp"); // Load native library libcatoptric_cpp.so (Unixes)
                                     // This library contains a native method called test()
     }
    public native void test();
    public native void quit();
    public native void reset();
    public native void move(int motor, int position, int row, int col, int surface);
}