package Entity;

public class Menu {
    int id;
    String title;
    int parent_id;

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public Menu(int id, String title, int parent_id) {
        this.id = id;
        this.title = title;
        this.parent_id = parent_id;
    }
}
