package test;


public class LH {
 
    private static LH instance;
    private LH(){};
    public static LH getinstance(){
    	if(instance==null){
    		instance=new LH();
    	}
		return instance;
    }
}
