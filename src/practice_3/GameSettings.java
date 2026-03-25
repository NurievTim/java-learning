package practice_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int players){
        maxPlayers = players;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            this.currentPlayers += 1;
        }
        else {
            System.out.println("Нельзя добавить больше игроков. Максимальное кол-во");
        }
    }

    void printGameStatus() {
        System.out.println(this.gameName + ", " + this.currentPlayers + ", " + maxPlayers);
    }
}
