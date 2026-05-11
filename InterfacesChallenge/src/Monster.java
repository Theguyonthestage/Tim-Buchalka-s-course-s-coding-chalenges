import java.util.ArrayList;

public class Monster implements ISaveable{
    private String monsterName;
    private int monsterHealth;
    private String monsterAttack;

    public Monster(String monsterName, int monsterHealth, String monsterAttack) {
        this.monsterName = monsterName;
        this.monsterHealth = monsterHealth;
        this.monsterAttack = monsterAttack;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getMonsterHealth() {
        return monsterHealth;
    }

    public void setMonsterHealth(int monsterHealth) {
        this.monsterHealth = monsterHealth;
    }

    public String getMonsterAttack() {
        return monsterAttack;
    }

    public void setMonsterAttack(String monsterAttack) {
        this.monsterAttack = monsterAttack;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> save = new ArrayList<>();
        save.add(monsterName);
        save.add(String.valueOf(monsterHealth));
        save.add(monsterAttack);
        return save;

    }

    @Override
    public void read(ArrayList<String> values) {
        setMonsterName(values.get(0));
        setMonsterHealth(Integer.parseInt(values.get(1)));
        setMonsterAttack(values.get(2));
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterName='" + monsterName + '\'' +
                ", monsterHealth=" + monsterHealth +
                ", monsterAttack='" + monsterAttack + '\'' +
                '}';
    }
}