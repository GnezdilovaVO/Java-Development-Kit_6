package org.example;

public class BehindTheScenes {
    int numberDoorPrize;
    int numberDoorPlayer;
    int numberDoorLeading;

    public BehindTheScenes(int numberDoorPrize) {
        this.numberDoorPrize = numberDoorPrize;
    }

    public int getNumberDoorPrize() {
        return numberDoorPrize;
    }

    public int getNumberDoorPlayer() {
        return numberDoorPlayer;
    }

    public int getNumberDoorLeading() {
        return numberDoorLeading;
    }

    public void setNumberDoorPlayer(int numberDoorPlayer) {
        this.numberDoorPlayer = numberDoorPlayer;
    }

    public void setNumberDoorLeading(int numberDoorLeading) {
        this.numberDoorLeading = numberDoorLeading;
    }
}
