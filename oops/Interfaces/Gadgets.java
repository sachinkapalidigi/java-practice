

class Phone {
    public void call(){
        System.out.println("Call made from phone");
    }
    public void sms(){
        System.out.println("SMS from phone");
    }
}

interface Camera {
    public void click();
    public void record();
}

interface MusicPlayer {
    public void play();
    public void pause();
    public void stop();
}


class SmartPhone extends Phone implements Camera, MusicPlayer{
    // add override annotation on all
    public void click(){
        System.out.println("click from smart phone camera");
    }
    public void record(){
        System.out.println("record from smart phone camera");
    }
    public void play(){
        System.out.println("play from smart phone music player");
    }
    public void pause(){
        System.out.println("pause smart phone music");
    }
    public void stop(){
        System.out.println("stop playing music");
    }

    public void call(){
        System.out.println("call from smart phone");
    }
}

public class Gadgets {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.call();
        s1.sms();

        Phone p1 = new SmartPhone();
        p1.call();
        p1.sms();

        Camera c1 = new SmartPhone();
        c1.click();
        c1.record();

        MusicPlayer mp1 = new SmartPhone();
        mp1.play();
        mp1.stop();

        Phone p2 = new Phone();
        p2.call();
        p2.sms();
    }
}
