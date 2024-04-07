class Animal {
    public void eat(){
        System.out.println("Ominiverous diet!");
    }
}
 class Lion extends Animal{
     @Override
     public void eat() {
         System.out.println("Carniverous diet!");
     }
 }

 class Test {
     public static void main(String[] args) {
         Animal a = new Lion();
         a.eat();
     }
 }