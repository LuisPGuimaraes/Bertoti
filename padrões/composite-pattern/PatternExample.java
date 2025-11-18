import java.util.ArrayList;
import java.util.List;

abstract class MenuComponent {
    abstract void render(String indent);
}

class MenuItem extends MenuComponent {
    private final String label;

    MenuItem(String label) {
        this.label = label;
    }

    @Override
    void render(String indent) {
        System.out.println(indent + "- " + label);
    }
}

class MenuGroup extends MenuComponent {
    private final String label;
    private final List<MenuComponent> children = new ArrayList<>();

    MenuGroup(String label) {
        this.label = label;
    }

    void add(MenuComponent component) {
        children.add(component);
    }

    @Override
    void render(String indent) {
        System.out.println(indent + label);
        children.forEach(child -> child.render(indent + "  "));
    }
}

public class PatternExample {
    public static void main(String[] args) {
        MenuGroup root = new MenuGroup("Menu Principal");
        MenuGroup produtos = new MenuGroup("Produtos");
        produtos.add(new MenuItem("Novidades"));
        produtos.add(new MenuItem("Promoções"));
        root.add(produtos);
        root.add(new MenuItem("Contato"));

        root.render("");
    }
}
