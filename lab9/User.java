package lab9;

import java.util.ArrayList;

public class User {
    
    private String name;
    private String password;
    private ArrayList<Pet> pets;
    private int adoptionBudget;

    public User(String name, String password){
        this.name = name;
        this.password = password;

        this.pets = new ArrayList<Pet>();
        this.adoptionBudget = 100;
    }

    public boolean verifyPassword(String tryPassword)
    {
        boolean verification;

        if(this.password.equals(tryPassword))
        {
            verification = true;
        }
        else
        {
            verification = false;
        }

        return verification;
    }

    public void adoptPet (String name, String type)
    {
    
        boolean ableToAdopt= true;;

        String typeOfPet = type;

        int costOfPet = 0;

        if(typeOfPet.equals("Cat"))
        {
            costOfPet = 30;
        }
        else if(typeOfPet.equals("Dog"))
        {
            costOfPet = 40;
        }
        else if(typeOfPet.equals("Rabbit"))
        {
            costOfPet = 20;
        }

        if(this.adoptionBudget<costOfPet)
        {
            ableToAdopt = false;
        }

        if(ableToAdopt)
        {
            Pet newPet = new Pet(name, typeOfPet, this);

            this.adoptionBudget = this.adoptionBudget - costOfPet;

            System.out.println("Pet "+ newPet.getName()+" adopted by user "+ this.name);

            this.pets.add(newPet);

        }
        else
        {
            System.out.println("Budget is not enough.");
        }
    }

    public void adoptPet (Pet existing)
    {
        this.pets.add(existing);
        System.out.println("Pet "+ existing.getName()+ " adopted by user "+this.name);
    }

    public Pet releasePet(Pet toRelease)
    {
        int petIndex = -1;

        for(int i = 0; i<this.pets.size();i++)
        {
            if(this.pets.get(i).equals(toRelease))
            {
                petIndex = i;
                break;
            }
        }

        if(petIndex == -1)
        {   
            System.out.println("There is no pet in the user.");
            return null;
        }
        else
        {
            this.pets.remove(petIndex);
            System.out.println("You have released the "+ toRelease.getName()+" the "+toRelease.getType()+".");
            return toRelease;
        }
    }



    public void setName(String name)
    {
        this.name = name;
    }
    public void setPassword (String password)
    {
        this.password = password;
    }
    public void setBudget (int budget)
    {
        this.adoptionBudget = budget;
    }
    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public int getBudget() {
        return this.adoptionBudget;
    }


    public void displayPets()
    {
        System.out.println("Your Pets:");

        for(int i =0;i<this.pets.size();i++)
        {
            System.out.println(this.pets.get(i).getPetStatus());
        }
    }

    public Pet getByIndex(int index)
    {
        return this.pets.get(index);
    }


    public Pet getPetByName(String petName)
    {
        int index = -1;

        for(int i =0;i<this.pets.size();i++)
        {
            if(this.pets.get(i).getName().equals(petName))
            {
                index = i;
                break;
            }
        }

        if(index==-1)
        {
            System.out.println("There is no pet with this name.");
            
            return null;
        }
        else
        {
            return this.getByIndex(index);
        }
    }

    public ArrayList<Pet> searchPetsByHappiness(int level)
    {
        ArrayList<Pet> greaterThanLevel = new ArrayList<Pet>();

        for(int i = 0;i<this.pets.size();i++)
        {
            if(this.pets.get(i).getHappinessLevel()>= level)
            {
                greaterThanLevel.add(this.pets.get(i));
            }
        }

        return greaterThanLevel;
    }


    public ArrayList<Pet> searchPetsByHealth(int level)
    {
        ArrayList<Pet> greaterThanLevel = new ArrayList<Pet>();

        for(int i = 0;i<this.pets.size();i++)
        {
            if(this.pets.get(i).getHealthLevel()>= level)
            {
                greaterThanLevel.add(this.pets.get(i));
            }
        }

        return greaterThanLevel;
    }

    public double averageHealth()
    {
        int count = this.pets.size();
        int total=0;
       
        for(int i = 0;i<this.pets.size();i++)
        {
            total = total + this.pets.get(i).getHealthLevel();            
        }
        
        return total/count;
    }

    
    public double averageHappiness()
    {
        int count = this.pets.size();
        int total=0;
       
        for(int i = 0;i<this.pets.size();i++)
        {
            total = total + this.pets.get(i).getHappinessLevel();            
        }
        
        return total/count;
    }

    public void displayAverageHealthAndHappiness()
    {
        System.out.print("Average Health: "+ this.averageHealth());
        System.out.println(", Average Happines: "+ this.averageHappiness());
    }
    
    public String toString()
    {
        String output = "Username: "+ this.name + "User budget: " + this.adoptionBudget + "/n";

        for(int i=0; i<this.pets.size();i++)
        {
            output = output + this.pets.get(i).toString() + "/n";
        }

        return output;
    }

    public boolean equals(User other)
    {
        if(this.name.equals(other.getName()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    


}

