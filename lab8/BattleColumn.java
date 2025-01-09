import java.util.Random;

public class BattleColumn 
{
    /*
     * An array of char representing the contents of the column. Each element in the array 
     * corresponds to a column in the grid and can either be an empty space or a Dark Knight.
     */
    private char[] columnElements;

    /*
     * Initializes a new column with a size corresponding to the number of rows in the grid 
     * (SkyBattleGame.ROWS). It calls the generate() method to populate the column with either 
     * empty spaces or Dark Knights depending on the hasDarkKnights parameter.
     */
    public BattleColumn(boolean hasDarkKnights) 
    {
        this.columnElements = new char[SkyBattleGame.ROWS];
        this.generate(hasDarkKnights);
    }

    /*
     * Populates the column by first initializing all positions as empty (initEmptyColumn()), 
     * and then randomly placing Dark Knights if hasDarkKnights is true. It calls addDarkKnights()
     * to handle the placement of Dark Knights.
     */
    public void generate(boolean hasDarkKnights) 
    {
        this.initEmptyColumn();
        
        if (hasDarkKnights) 
        {
            Random random = new Random();
            this.addDarkKnights(random);
        }
    }

    /*
     * Fills the column’s elements array with the empty column symbol (SkyBattleGame.EMPTY_COL_SYMBOL),
     * ensuring that all positions start as empty.
     */
    private void initEmptyColumn() 
    {
        for(int i = 0;i<this.columnElements.length;i++)
        {
            this.columnElements[i] = SkyBattleGame.EMPTY_COL_SYMBOL;
        }
    }

    /*
     * Adds a random number of Dark Knights (between 1 and the configured maximum, 
     * SkyBattleGame.MAX_DARK_KNIGHT_SIZE) to random positions in the column using the Random object. 
     * Each selected position is replaced by the Dark Knight symbol (SkyBattleGame.DARK_KNIGHT_SYMBOL).
     * Notice that if the same location is chosen multiple times, fewer dark nights will be created.
     */
    private void addDarkKnights(Random random) 
    {
        int randomNumber = random.nextInt(SkyBattleGame.MAX_DARK_KNIGHT_SIZE) + 1; 

        int i = 0;
        
        while(i<randomNumber)
        {
            int randomIndex = random.nextInt(10);

            this.columnElements[randomIndex] = SkyBattleGame.DARK_KNIGHT_SYMBOL;
            i++;
        }
    }

    /*
     * Returns the array of char representing the contents of the column. Each element in the array 
     * corresponds to a row and can either be empty or contain a Dark Knight.
     */
    public char[] getElements() 
    {
        return this.columnElements;
    }
}