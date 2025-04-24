import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Todo todo1 = new Todo("Walk the dog", false, 0, 3, "dog");
        Todo todo2 = new Todo("Pay the bills", false, 1, 1, "bills");

        ArrayList<Todo> todoList = new ArrayList<>();
        todoList.add(todo1);
        todoList.add(todo2);
        System.out.println(todoList);

        ObjectMapper map = new ObjectMapper();
        map.writeValue(new File("data.json"),todoList);
    }
}
class Todo{
    private String body;
    private boolean done;
    private int id;
    private int priority;
    private String title;

    public Todo(String body, boolean done, int id, int priority, String title) {
        this.body = body;
        this.done = done;
        this.id = id;
        this.priority = priority;
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Todo{" +
                        "body='" + body + '\'' +
                        ", done=" + done +
                        ", id=" + id +
                        ", priority=" + priority +
                        ", title='" + title + '\'' +
                        '}';
    }
}
