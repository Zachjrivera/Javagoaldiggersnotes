package ooppractice;

public class Laptop {
    final int mousePad = 1;
    final int keyBoard = 1;
    String brand;
    String processor;
    String ram;
    String hardDrive;
    int usbslots;
    int screenSize;
    String [] colors ={"Silver","Black","Rose Gold"};


    public Laptop (String brand,int screenSize,String processor,String ram,String hardDrive,int usbSlots)
    {
        this.brand=brand;
        this.screenSize=screenSize;
        this.processor=processor;
        this.ram=ram;
        this.hardDrive=hardDrive;
        this.usbslots=usbSlots;
    }

    public String powerOn()
    {
         return brand + " Laptop turns on";
    }

         public String loadOS()
        {
             return brand +  " Computer loads and displays operating system";
        }

            public String Batterylife()
            {
                return " Battery life is at -- %";
            }
                public String loadUserSettings()
                {
                    return "User settings loaded displaying background";
                }




}
