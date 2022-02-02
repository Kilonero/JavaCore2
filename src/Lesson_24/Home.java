package Lesson_24;

import java.util.HashMap;
import java.util.Map;

public class Home {
    private Map<Integer, String> rooms;

    public Home() {
     rooms = new HashMap<>();
    }

    public void settle(int room, String lastName) {
        rooms.put(room, lastName);
    }

    public void evict(int room) {
        rooms.remove(room);
    }

    public String who(int room) {
        return rooms.get(room);
    }

    public boolean isEmpty(int room) {
        return rooms.containsKey(room);
    }

    public int count() {
        return rooms.size();
    }

    @Override
    public String toString() {
        String result = "";
        for (Map.Entry<Integer, String> entry : rooms.entrySet()) {
            result = result + entry.getKey() + " -> " + entry.getValue() + " \n ";
        }
        return result;
    }
}
