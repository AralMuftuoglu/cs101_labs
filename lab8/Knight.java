public class Knight 
{
    // Instance Variables
    private int coordinateY; // y-coordinate of the Knight
    private int currentHealth; // current health points of the Knight
    private char visualSymbol; // visual symbol of the Knight

    /*
     * Initializes the Knight with a specified y position, health, and a visual symbol. It sets the 
     * health using the setHealth() method to ensure the value is non-negative.
     */
    public Knight(int y, int health, char symbol) 
    {
        this.coordinateY = y;
        this.setHealth(health);
        this.visualSymbol = symbol;
    }

    /*
     * Returns true if the Knight’s health is greater than zero, meaning the Knight is still alive; 
     * otherwise, returns false.
     */
    public boolean isAlive() 
    {
        boolean isAlive;

        if(this.currentHealth>0){
            isAlive = true;
        }
        else{
            isAlive = false;
        }

        return isAlive;
    }

    /*
     * Returns a string representation of the Knight, including its symbol and a visual representation
     * of its health using the ‘*’ symbol. The number of asterisks corresponds to the Knight's health.
     */
    public String toString() 
    {
        String stringKnight;

        stringKnight = "Knight: symbol (" + this.visualSymbol + "), health (";

        for(int i=0;i<this.currentHealth;i++){
            stringKnight = stringKnight + "*";
        }

        stringKnight = stringKnight + ")";

        return stringKnight;
    }

    // Getters & Setters
    public int getHealth() 
    {
        return this.currentHealth;
    }

    public int getY() 
    {
        return this.coordinateY;
    }

    public char getSymbol() 
    {
        return this.visualSymbol;
    }

    public void setY(int y) 
    {
        this.coordinateY = y;
    }

    /*
     * Sets the Knight’s health to the provided value, but ensures the health is never set to a value 
     * below 0 using Math.max(health, 0)
     */
    public void setHealth(int health) 
    {
        this.currentHealth = Math.max(health, 0);
    }
}