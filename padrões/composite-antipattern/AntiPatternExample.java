import java.util.ArrayList;
import java.util.List;

class MegaMenuBuilder {
    List<String> level1 = new ArrayList<>();
    List<String> level2 = new ArrayList<>();
    List<String> level3 = new ArrayList<>();

    void addLevel1(String label) {
        level1.add(label);
    }

    void addLevel2(String label) {
        level2.add(label);
    }

    void addLevel3(String label) {
        level3.add(label);
    }

    void render() {
        level1.forEach(item -> System.out.println(item));
        level2.forEach(item -> System.out.println("  - " + item));
        level3.forEach(item -> System.out.println("    * " + item));
    }
}

public class AntiPatternExample {
    public static void main(String[] args) {
        MegaMenuBuilder builder = new MegaMenuBuilder();
        builder.addLevel1("Produtos");
        builder.addLevel2("Promoções");
        builder.addLevel3("Natal");
        builder.render();
    }
}
