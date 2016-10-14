package com.fabiana.game;


public class World {
    private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
    private int score;
    
    public void update(float deta){
        pacman.update();
    }

    World(PacmanGame pacmanGame) {
        this.pacmanGame = pacmanGame;
        
        maze = new Maze();
           
        pacman = new Pacman(60,60,this);
        score = 0;
        
    }

    Pacman getPacman() {
        return pacman;
    }
    
    Maze getMaze(){
        return maze;
    }
    
    public void increaseScore(){
        score += 1;
    }
    
    public int getScore(){
        return score;
    }
}
