public class Fish implements Prey, Predator {
  
    @Override
    public void flee() {
        System.out.println("The fish flees.");
    }
  
    @Override
    public void hunt() {
        System.out.println("The fish hunts.");
    }
  
}
