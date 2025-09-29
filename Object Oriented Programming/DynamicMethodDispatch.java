class Phone{
    void showTime(){
        System.out.println("Time is 9 AM");
    }
    void on(){
        System.out.println("Turning on Phone");
    }
}

class SmartPhone extends Phone{
    @Override
    void on() {
        System.out.println("Turning on SmartPhone");
    }

    void music(){
        System.out.println("Playing Music");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();  // Upcasting (Allowed, as SmartPhone is a Phone)
        obj.showTime();  // Calls Phone's showTime()
        obj.on();  // Calls SmartPhone's on() due to overriding
        // obj.music();  // Error: Cannot find symbol, as reference type is Phone
        // This is called dynamic method dispatch
        // The method to be called is determined at runtime based on the actual object type, not the reference type.
        // This is a runtime polymorphism feature in Java.
        // The opposit3e is not possible 
        // SmartPhone obj2 = new Phone();  // Not allowed, as Phone is not a SmartPhone

        SmartPhone obj2 = new SmartPhone();  // No upcasting, reference type is SmartPhone
        obj2.showTime();  // Calls Phone's showTime()
        obj2.on();  // Calls SmartPhone's on()
        obj2.music();  // Calls SmartPhone's music()
    }
}
