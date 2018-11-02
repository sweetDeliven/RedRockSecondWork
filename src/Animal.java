 abstract class Animal {
   protected int legs;
   protected String action;
   protected String name;

   abstract void  eat(String food);
   abstract void  sleep(int hours);
 }

 class Cat extends Animal{
    public Cat(int legs,String action,String name){
        this.legs =legs;
        this.action=action;
        this.name=name;
    }

    public void eat(String food){
        System.out.println(name+"likes"+action+" he eat "+food);
    }

    public void sleep(int hours){
        System.out.println(name+" sleeps for"+hours+" hours");
    }
 }

 class Dog extends Animal{
     public Dog(int legs,String action,String name) {
         this.legs =legs;
         this.action=action;
         this.name=name;
     }
     public void eat(String food){
         System.out.println(name+"likes"+action+" he eat "+food);
     }
     public String sleep(){
         return "good dog";
     }
     public void sleep(int hours){
         System.out.println(name+" sleeps for"+hours+" hours");
     }

 }

 class Human extends Animal{
     public Human(int legs,String action,String name){
         this.legs =legs;
         this.action=action;
         this.name=name;
     }

     public void eat(String food){
         System.out.println(name+"likes"+action+" he eat "+food);
     }
     public void sleep(int hours){
         System.out.println(name+" sleeps for"+hours+" hours");
     }
 }

