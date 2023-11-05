import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class ToyStore {
    
    private PriorityQueue<Toy> toys;
    
    public ToyStore(String toy1, String toy2, String toy3) {
        toys = new PriorityQueue<>();
        String[] toy1Info = toy1.split(" ");
        String[] toy2Info = toy2.split(" ");
        String[] toy3Info = toy3.split(" ");
        
        Toy t1 = new Toy(Integer.parseInt(toy1Info[0]), toy1Info[1], Integer.parseInt(toy1Info[2]));
        Toy t2 = new Toy(Integer.parseInt(toy2Info[0]), toy2Info[1], Integer.parseInt(toy2Info[2]));
        Toy t3 = new Toy(Integer.parseInt(toy3Info[0]), toy3Info[1], Integer.parseInt(toy3Info[2]));
        
        toys.add(t1);
        toys.add(t2);
        toys.add(t3);
    }
    
    public void writeToResultFile() {
        try {
            FileWriter writer = new FileWriter("result.txt");
            
            for (int i = 0; i < 10; i++) {
                writer.write(getToy().toString());
                writer.write("\n");
            }
            
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private Toy getToy() {
        int randomNum = (int) (Math.random() * 100);
        
        if (randomNum < 20) {
            return toys.poll();
        } else if (randomNum < 40) {
            toys.peek();
            return toys.poll();
        } else {
            toys.peek();
            toys.peek();
            return toys.poll();
        }
    }
    
    public static void main(String[] args) {
        ToyStore store = new ToyStore("1 2 constructor", "2 2 robot", "3 6 doll");
        store.writeToResultFile();
    }
}

class Toy implements Comparable<Toy> {
    
    private int id;
    private String name;
    private int weight;
    
    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    @Override
    public int compareTo(Toy o) {
        return weight - o.getWeight();
    }
    
    @Override
    public String toString() {
        return id + " " + name;
    }
}
