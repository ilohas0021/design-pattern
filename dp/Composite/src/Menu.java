import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    Iterator iterator = null;
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) { menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent) { menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

    public Iterator createIterator() {
        if (iterator == null)
            iterator = new CompositeIterator(menuComponents.iterator());
        return iterator;
    }
}