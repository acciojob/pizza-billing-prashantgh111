package com.driver;

public class Pizza {

    private int price; // consider total price. but further it will be changed
    private Boolean isVeg;
    private String bill;    //by default its give u null value; so set it to emty string

    // take another variables makes complete code
    private int cheesePrice;  // its fixed in Discription(Optional)
    private int toppingPrice;
    private int paperBagPrice; // (optional)
    //private int bestPriceOfPizza;

    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;  // for paper bag
    private boolean isBillGenerate;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // yaha start hoga logic of the App

        // check type of pizza and set pricess according to type
        // Veg pizza base price = 300 Non-veg pizza base price = 400
        if(isVeg){
            this.price=300; //veg pizza
            this.toppingPrice=70;  // topping for veg pizza
        }
        else{
            this.price=400;
            this.toppingPrice=120;
        }
         this.cheesePrice=80; // same for both
         this.paperBagPrice=20; // (optional) u can add it directly fixed price is 20
         //this.bestPriceOfPizza=price;
         this.bill="";
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    // niche ke 3 function user kitni bhi bar call kare bill me uska price
    // ek bar hi add hona chahiye; so upar hame 3 boolean variable liye hai
    public void addExtraCheese(){
        if(!isCheeseAdded){
            this.price+=cheesePrice;
            this.isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingAdded){
            this.price+=toppingPrice;
            this.isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded) {
            //this.price+=20;
            this.price += paperBagPrice;
            this.isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // here we have to generate bill according to given format
        // so we have to concantinate given string with given output string
        // or ek bat ek bar bill generate ho gaya to firse nhi hona chahiye

        if(!isBillGenerate) {
            //this.bill+="Base Price Of The Pizza:"+this.price;
            // ->this.price karoge to ye change go gayi hai total price milegi. so aapko given ouput format print karna hai to aap base price ko kisi
            // variable me store karke usko yaha add kar sakte ho.
           // this.bill += "Base Price Of The Pizza:" + this.bestPriceOfPizza+"\n";   //other wise app constructor me likho;
            // if person ask for extra cheese then only price added in bill
            if(isCheeseAdded){
                this.bill+="Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            // same for Topping .if person ask for topping
            if(isToppingAdded){
                this.bill+="Extra Toppings Added: "+this.toppingPrice+"\n";
            }
            if(isTakeAwayAdded){
                this.bill+="Paperbag Added: "+this.paperBagPrice+"\n";
            }
            this.bill+="Total Price: "+this.price+"\n";
           this.isBillGenerate=true;
        }
        return this.bill;
    }
}
