/* MechanicGarske.java
SELF-GRADE BOTTOM
Extra instance variables added. Must add two extra related instance variables to the MechanicShop class
1. what is the first instance vasriable? - repairTime
2. What is the second instance variable? - warranty
Have you modified the constructor and toString method?
have you added the getter and the setter methods for the extra instance variables you added?
Extra methods added, the method must do something, printing information is not accepted. Must add methods to simulate the real Mechanic shop.
Extra method must be something related to the mechanic shop. Unrelated redundant  methods will not be accepted
1. what is the extra method to have more functionality to the class?          - isPremiumRepair
2. what is the  second extra  method to have more functionality to the aclss? - applyWarrantyDiscount
*/
public class MechanicGarske
{
    //no code here
}


/* This class create a service quote for
a mechanic shop. At mechanic parts are
being repaired. for every part there is
a price for the part and a price for the
labor. Customers can use coupon to get
discount */
class MechanicShop
{
    // INSTANCE VARIABLES
    // Declare the instance varibale given in th documnet
    private String name;
    private String part;
    // declare the rest of the instance variables
    private double partPrice;
    private double laborPrice;
    private double coupon;
    // declare the extra required variables. Must be related to the Mechanic shop
    private int repairTime;   // the time it takes to complete labor
    private boolean warranty; // does it have warranty or not

    // CONSTRUCTOR
    /* constructor: sets the instance varibales
    using the paramters being passed to it. Must
    include the extra instance variables you declared */
    public MechanicShop(String name, String part, double partPrice,
                        double laborPrice, double coupon,
                        int repairTime, boolean warranty) {
        //set name to shopName
        this.name = name;
        //set partCharge to pPrice
        this.part = part;
        // setlaborCharge to LPrice
        this.partPrice = partPrice;
        //set part to partName
        this.laborPrice = laborPrice;
        //set coupon to coup
        this.coupon = coupon;
        //initalize the extra instance variables you declared
        this.repairTime = repairTime;
        // set instance varaible repairTime and warranty
        this.warranty = warranty;
    }

    // GETTER
    //getter methods: all of the following methods must be declared public
    //getName() should return the intance variable name
    public String getName() {
        return name;
    }
    //getPart() should return the part
    public String getPart() {
        return part;
    }
    //getPartCharge() should return the intance variable partCharge
    public double getPartPrice() {
        return partPrice;
    }
    //getLaborCharge() should return the intance variable laborCharge
    public double getLaborPrice() {
        return laborPrice;
    }
    //getCoupon() should return the intance variable coupon
    public double getCoupon() {
        return coupon;
    }
    //getter methods for the extra instance variables you declared
    public int getRepairTime() {
        return repairTime;
    }
    public boolean getWarranty() {
        return warranty;
    }

    // SETTER
    //list of the setter methods, these methods
    //are public and have void return type
    public void setName(String newName) {
        //sets name to n
        name = newName;
    }
    public void setPart(String newPart) {
        //sets part to new newPart;
        part = newPart;
    }
    public void setPartPrice(double newPartPrice) {
        //sets partCharge to newCharge
        partPrice = newPartPrice;
    }
    public void setLaborPrice(double newLaborPrice) {
        //sets laborCharge  to newLaborCharge;
        laborPrice = newLaborPrice;
    }
    public void setCoupon(double newCoupon) {
        //sets coupon to newCoupon
        coupon = newCoupon;
    }
    //setter methods for the extra instance variables you added
    public void setRepairTime(int newRepairTime) {
        //sets coupon to newCoupon
        repairTime = newRepairTime;
    }
    public void setWarranty(boolean newWarranty) {
        //sets coupon to newCoupon
        warranty = newWarranty;
    }

    /* This method finds the sum of the
    part charge and labor charge and
    returns the total cost */
    public double getTotal() {
        // set the total price to total and return
        double total = partPrice + laborPrice;
        return total;
    }

    /*This method calculates the total
    after applying the coupon */
    public double getTotalAfterDiscount() {
        // set cost to the total minus discount
        double cost = getTotal() - getDiscount();
        return cost;
    }

    /*This method calculates the amount
    of the discount based on the coupon */
    public double getDiscount() {
        // set discount to total price * coupon / 100 to get %
        double discount = (getTotal() * coupon) / 100;
        return discount;
    }

    /* Addition
    This method returns true or false
    and if the repair cost or labor is
    more than 250 it is a premium repair */
    public boolean isPremiumRepair() {
        return laborPrice > 250 || partPrice > 250;
    }

    /* Addition
    this method applies a warranty
    discount if they have a warranty
    with company */
    public void applyWarrantyDiscount() {
        if (warranty) {
            double discountAmount = getTotal() * 0.05; // 5% discount
            laborPrice -= discountAmount;
        }
    }


    /* creates a String representing an object
    ot ServiceQuote, and returns the string.
    Must include the extra instance variables
    you added */
    public String toString() {
        //declare a variable called discount of type
        //double and set it to the method call getDiscount
        double discount = getDiscount();
        //declare a variable of double called cost
        //and set it to the method call getTotal
        double cost = getTotal();
        //declare a varibale called finalCost and set it to cost - discount
        double finalCost = cost - discount;
        //String prints the
        String s ="Welcome to " + name + " mechanic shop\n" +  "Summary of charges\n";
        s = s + "Part: " + part;
        // s to instance varaible repairTime
        s = s + "\nLabor hours: " + repairTime;
        // s to instance varaible warranty
        s = s + "\nWarranty: " + (warranty ? "Yes" : "No");
        //add the instance varibale partCharge to s
        s = s + "\nPart cost: " + partPrice;
        //add the instance varibale laborCharge to s
        s = s + "\nLabor cost: " + laborPrice;
        //add the instance varibale coupon to s
        s = s + "\nDiscount: " + coupon;
        //add discount that was calculated in this method
        s = s + "\nDiscount amount: " + discount;
        // add cost that was calculated in this method
        s = s + "\n Total: " + cost;
        //add finaCost that was calculated in this methodto s
        s = s + "\n Total after discount: " + finalCost;
        s = s + "\n______________________________________________\n";
        return s;
    }
}


/*Create code similar to the given driver.
This driver has 20 points out of 100 points
This driver must be your own creation. copying
any code from the given Driver will get zero points
Must call the methods you implemented in your class.
Must be as long as the given Driver */
class YourDriver
{
    public static void main(String[] args) {
        // set the enviroment varaibles
        MechanicShop oilChange = new MechanicShop("QuickLube", "Oil Change", 50, 25, 10, 1, false);
        MechanicShop engineRepair = new MechanicShop("EnginePros", "Engine Repair", 600, 800, 15, 10, true);
        MechanicShop tires = new MechanicShop("QuickLube", "Tire replacement", 150, 100, 5, 2, true);
        MechanicShop brakeFluid = new MechanicShop("Midas", "Replace brake fluid", 50, 120, 0, 2, false);

        // print the original
        System.out.println(oilChange);
        System.out.println(engineRepair);
        System.out.println(tires);
        System.out.println(brakeFluid);
        double finalCost = oilChange.getTotalAfterDiscount()+engineRepair.getTotalAfterDiscount()+tires.getTotalAfterDiscount()+brakeFluid.getTotalAfterDiscount();
        System.out.println("Amount to pay: "+ finalCost);

        System.out.println("\nPremium Repair Check:");
        System.out.println("Is " + engineRepair.getPart() + " a premium repair? " + engineRepair.isPremiumRepair());
        System.out.println("Is " + oilChange.getPart() + " a premium repair? " + oilChange.isPremiumRepair());
        System.out.println("Is " + tires.getPart() + " a premium repair? " + tires.isPremiumRepair());
        System.out.println("Is " + brakeFluid.getPart() + " a premium repair? " + brakeFluid.isPremiumRepair());

        System.out.println("\nApplying warranty discount to Engine Repair...\n");
        oilChange.applyWarrantyDiscount();
        engineRepair.applyWarrantyDiscount();
        tires.applyWarrantyDiscount();
        brakeFluid.applyWarrantyDiscount();

        System.out.println("\n\nAfter making changes:\n***************************************************\n ");
        System.out.println(oilChange);
        System.out.println(engineRepair);
        System.out.println(tires);
        System.out.println(brakeFluid);
        finalCost = oilChange.getTotalAfterDiscount()+engineRepair.getTotalAfterDiscount()+tires.getTotalAfterDiscount()+brakeFluid.getTotalAfterDiscount();
        System.out.println("Amount to pay: "+ finalCost);

        System.out.println("\nUpdating Oil Change details...");
        oilChange.setLaborPrice(40);
        oilChange.setCoupon(15);
        System.out.println(oilChange);
    }
}


/* Driver class runs different senarios
to test the implemtned code. */
class Driver
{
    public static void main(String[] args) {
        MechanicShop brake = new MechanicShop("Midas", "Brake", 300, 500, 20, 4, false);
        MechanicShop transmission = new MechanicShop("Midas", "Transmission", 199, 355, 12, 10, true);
        MechanicShop lights = new MechanicShop("Midas", "lights", 355, 657, 20, 2, false);
        MechanicShop clutch = new MechanicShop("Midas", "clutch", 700, 500, 15, 6, true);

        System.out.println(brake);
        System.out.println(transmission);
        System.out.println(lights);
        System.out.println(clutch);
        double finalCost = brake.getTotalAfterDiscount()+transmission.getTotalAfterDiscount()+lights.getTotalAfterDiscount()+clutch.getTotalAfterDiscount();
        System.out.println("Amount to pay: "+ finalCost);

        brake.setCoupon(40);
        transmission.setPartPrice(155);
        lights.setLaborPrice(450);
        clutch.setCoupon(25);

        System.out.println("\n\nAfter making changes:\n***************************************************\n ");
        System.out.println(brake);
        System.out.println(transmission);
        System.out.println(lights);
        System.out.println(clutch);
        finalCost = brake.getTotalAfterDiscount()+transmission.getTotalAfterDiscount()+lights.getTotalAfterDiscount()+clutch.getTotalAfterDiscount();
        System.out.println("Amount to pay: "+ finalCost);

        System.out.println("\nWarranty Check:");
        System.out.println("Does Clutch repair have warranty? " + clutch.getWarranty());
    }
}

/*==============================SELF GRADE===================================*/
/*
Name: Aidan Garske
Date: 11/26/24
I gave myself a 100% because...
- Extra feature abs value 40 pts
- Properly named my Class as 'MechanicGarske'         5pts
- Proper indentation followed                         5pts
- Descriptive well-placed comments                    5pts
- Program builds and runs                             50pts
- Follows requirements.                               30pts
- Self-grade                                          5pts
total:                                                105pts
percent:                                              100%
Testimony: I have done all the coding myself without getting help from any
resources: Aidan Garske
*/
/*===========================================================================*/
