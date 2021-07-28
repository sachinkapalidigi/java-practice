
class HondaCity {
    static long price = 10_000_000;
    int a,b = 10;
    static double onRoadPrice(String city){
        switch (city) {
            case "delhi":
                return price+price*0.1;
            case "karnataka":
                return price+price*0.3;
            default:
                return price+price*0.2;
        }
    }
}



public class StaticPractice {
    public static void main(String[] args){
        // 
        System.out.println(HondaCity.price);
        System.out.println(HondaCity.onRoadPrice("kerala"));

        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();
        h1.price = 10_000_001;
        System.out.println(h2.price);
    }
}
