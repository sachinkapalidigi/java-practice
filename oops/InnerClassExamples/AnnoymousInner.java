

abstract class Watch{
    abstract void showTime();
}

class AppleWatch{
    public void displayTime(){
        // Annoymous Object created from abstract class
        Watch w = new Watch(){
            void showTime() {
                System.out.println("Time is 10.20 PM");
            };
        };
        w.showTime();
    }
}

interface Hospital {
    void getHospitalName();
    // void emergencyService();
    int getBed();
    // void getOxygenCylinder();
}

class News {
    int reserve = 10;
    void displayNearestHospital(){

        Hospital appolo = new Hospital(){
            int beds = 100;
            public void getHospitalName(){
                System.out.println("Appolo is the name of the hospital");
            }
            public int getBed(){
                System.out.println("Here are the available beds "+(beds-reserve));
                return beds--;
            }
        };

        appolo.getHospitalName();
        System.out.println("Appolo has "+appolo.getBed()+" beds");
        appolo.getBed();
    }
}

public class AnnoymousInner {
    public static void main(String[] args){
        // 
        AppleWatch aw = new AppleWatch();

        aw.displayTime();

        News republic = new News();
        republic.displayNearestHospital();
    }
}
