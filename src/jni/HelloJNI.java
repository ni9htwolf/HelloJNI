package jni;

public class HelloJNI 
{
    private native void sayHello();
    
    public static void main(String[] args) 
    {
        HelloJNI helloJni = new HelloJNI();
        helloJni.sayHello();
        
    }
    
    static 
    {
        String nativeLibPath = System.getProperty("user.dir");
        nativeLibPath += "/HelloJNI.dll";
        try 
        {
            System.load(nativeLibPath);
	}
	catch(Exception e) 
        {
            System.out.println("Error: cannot load library!");
	}
    }
}

// test for git. First change
// before being commited
// test
// another diff
// test ignoring
// test git commit comand
// test git commit -v