package Class25;

public abstract class SmartWatch {
    private int RAM;
    protected int ROM;
    double displaySize;
    public String make;
    //instance variable are all above!!!
    static boolean showTime=true;

   public SmartWatch(int RAM,int ROM,double displaySize,String make){//now those are local variables!!!
      this.RAM=RAM;  //this. keyword has been used to
       this.ROM=ROM;
       this.displaySize=displaySize;
       this.make=make;
    }
    public abstract void showHealthTips();//first specify the access modifiers, then non access modifiers, then return type amd then method name
    public void updateOS(){
        checkOSUpdate();
        downloadUpdate();
        installUpdate();
        System.out.println("Updating the OS");
    }
    private void checkOSUpdate(){
        System.out.println("Checking if update is available");
    }
    private void downloadUpdate(){
        System.out.println("downloading the update");
    }
    private void installUpdate() {
        System.out.println("install the update");
    }
    static void displayTime(){
        System.out.println("Display time");
}
}
class AppleWatch extends SmartWatch{

    public AppleWatch(int RAM, int ROM, double displaySize, String make) {
        super(RAM, ROM, displaySize, make);
    }

    public void showHealthTips(){
        System.out.println("use the Health App to check the available");
    }
}
