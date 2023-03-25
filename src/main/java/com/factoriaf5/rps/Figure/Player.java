package com.factoriaf5.rps.models;
public class Player {

    public class Player(){
        private String name = "Player";
        public Player (String name) {
        this.name = "Player";
    }

    
     

    public Object choose(String string) {
        if(string == "Rock"){
            return new Rock();
        } else if (string == "paper") {
            return new Paper();
        } else if (string == "scissors") {
            return new Scissors();
        return null;
    }
    }
}


