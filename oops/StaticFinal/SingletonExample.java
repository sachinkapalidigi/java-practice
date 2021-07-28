
class CoffeeMachine {
    private float coffeeQty;
    private float waterQty;
    static private CoffeeMachine myMachine = null;

    private CoffeeMachine(){
        coffeeQty = 1f;
        waterQty = 0.2f;
    }

    static public CoffeeMachine getInstance(){
        if(myMachine == null){
            myMachine = new CoffeeMachine();
        }
        return myMachine;
    }

    public float getCoffeeQty(){
        return coffeeQty;
    }
    public float getWaterQty(){
        return waterQty;
    }
    private void setCoffeeQty(float coffee){
        this.coffeeQty = coffee;
    }
    public float addCupOfCoffee(){
        setCoffeeQty(this.coffeeQty+1);
        return getCoffeeQty();
    }
}


public class SingletonExample {
    public static void main(String[] args){
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        CoffeeMachine c2 = CoffeeMachine.getInstance();
        c1.addCupOfCoffee();
        // same instance is modified
        System.out.println("c2 coffee qty is "+c2.getCoffeeQty());
        System.out.println("c1 coffee qty is "+c1.getCoffeeQty());
    }
}
