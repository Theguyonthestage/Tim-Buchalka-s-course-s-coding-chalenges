import java.util.ArrayList;

public class Player implements ISaveable{

    private String playerName;
    private int playerHealth;
    private String playerWeapon;

    @Override
    public ArrayList<String> write() {
        ArrayList<String> save = new ArrayList<>();
        save.add(playerName);
        save.add(String.valueOf(playerHealth));
        save.add(playerWeapon);
        return save;
    }

    @Override
    public void read(ArrayList<String> values) {
        setPlayerName(values.get(0));
        setPlayerHealth(Integer.parseInt(values.get(1)));
        setPlayerWeapon(values.get(2));
    }

    public Player(String playerName, int playerHealth, String playerWeapon) {
        this.playerName = playerName;
        this.playerHealth = playerHealth;
        this.playerWeapon = playerWeapon;
    }
    @Override
    public String toString() {
        return "Player{" +
                "name='" + playerName + '\'' +
                ", health=" + playerHealth +
                ", weapon='" + playerWeapon + '\'' +
                '}';
    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public String getPlayerWeapon() {
        return playerWeapon;
    }

    public void setPlayerWeapon(String playerWeapon) {
        this.playerWeapon = playerWeapon;
    }
}