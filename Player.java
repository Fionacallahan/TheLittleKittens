public class Player { 
    
    private String name;
    private int mistakes;
    private int score;
    private int lives;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMistakes()
    {
        return mistakes;
    }

    public void addMistake(int mistakes)
    {
        this.mistakes = mistakes + 1;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getLives()
    {
        return lives;
    }

    public void setLives(int lives)
    {
        this.lives = lives;

    }

    public void loseLife(int lives)
    {
        this.lives = lives - 1;
    }


}