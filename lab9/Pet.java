package lab9;

public class Pet {
    private String name;
    private String type;
    private int healthLevel;
    private int happinessLevel;
    private String currentMood;
    private double age;
    private boolean isOld;

    User owner;

    public Pet(String name, String type, User owner)
    {
        this.name = name;
        this.type = type;   
        this.owner = owner;

        this.healthLevel = 50;
        this.happinessLevel = 50;
        
        this.updateMood();
    
    }

    public void feedPet(){
        
        if(this.healthLevel==100)
        {
            System.out.println("Health is already maxed.");
        }
        if(this.healthLevel<90){
            this.healthLevel = this.healthLevel + 10;
        }
        else
        {
            this.healthLevel=100;
        }

        System.out.println("You have fed with "+this.name+" the "+this.type);

    }
   
    public void playWithPet()
    {
        if(this.happinessLevel==100)
        {
            System.out.println("Happiness is already maxed.");
        }
        if(this.happinessLevel<85){
            this.happinessLevel = this.happinessLevel + 15;
        }
        else
        {
            this.happinessLevel=100;
        }

        System.out.println("You have played with "+this.name+" the "+this.type);
    }
   
    public void groomPet()
    {
        if(this.healthLevel==100)
        {
            System.out.println("Health is already maxed.");
        }
        if(this.healthLevel<85){
            this.healthLevel = this.healthLevel + 15;
        }
        else
        {
            this.healthLevel=100;
        }
    }

    public void updateMood()
    {
        if(this.happinessLevel>70)
        {
            this.currentMood = "Happy";
        }
        else if(this.happinessLevel>50)
        {
            this.currentMood= "Playful";
        }
        else 
        {
            this.currentMood = "Sad";
        }
    }

    public String getPetStatus()
    {   
        String a = "Name: "+this.name+  ", Type: "+ this.type + ", Health: "+this.healthLevel+", Happiness: "+this.happinessLevel + ", Mood: " +this.currentMood;
        return a;
    }

    public void increaseAge()
    {
        this.age = this.age + 0.25;
    }
 


    public void setName(String name)
    {
        this.name = name;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setHealthLevel (int health)
    {
        this.healthLevel = health;
    }
    public void setHappinessLevel (int happiness)
    {
        this.happinessLevel = happiness;
    }
    public void setMood (String mood)
    {
        this.currentMood = mood;
    }
    public void setUser (User theUser)
    {
        this.owner = theUser;
    }
    public void setAge(double age)
    {
        this.age = age;
    }
    public void setFlag(boolean flag)
    {
        this.isOld = flag;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getType() {
        return this.type;
    }
    
    public int getHealthLevel() {
        return this.healthLevel;
    }
    
    public int getHappinessLevel() {
        return this.happinessLevel;
    }
    
    public String getMood() {
        return this.currentMood;
    }
    
    public User getUser() {
        return this.owner;
    }
    public double getAge() {
        return this.age;
    }
    
    public boolean getFlag() {
        return this.isOld;
    }    


    public boolean equals(Pet other)
    {
        boolean result;

        if(this.name.equals(other.getName()) && this.type.equals(other.getType()))
        {
            result = true;
        }
        else
        {
            result = false;
        }

        return result;
    }

    public String toString()
    {
        return this.getPetStatus();
    }



}
