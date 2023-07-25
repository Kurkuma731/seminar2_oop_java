import java.util.LinkedList;
import java.util.Queue;

class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<String> queue = new LinkedList<>();

    @Override
    public boolean enqueue(String person) {
        return queue.offer(person);
    }

    @Override
    public String dequeue() {
        return queue.poll();
    }

    @Override
    public int queueSize() {
        return queue.size();
    }

    @Override
    public void clearQueue() {
        queue.clear();
    }

    @Override
    public void addPerson(String person) {
        enqueue(person);
        System.out.println(person + " добавлен в очередь магазина.");
    }

    @Override
    public void removePerson() {
        String person = dequeue();
        if (person != null) {
            System.out.println(person + " удален из очереди магазина.");
        } else {
            System.out.println("Очередь магазина пуста.");
        }
    }

    @Override
    public void update() {
        // Add your logic to update the market here
    }
}