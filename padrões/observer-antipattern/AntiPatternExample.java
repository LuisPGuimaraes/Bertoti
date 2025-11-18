import java.util.List;

class LegacyNewsDatabase {
    private String lastHeadline = "";

    String fetchLatestHeadline() {
        return lastHeadline;
    }

    void save(String headline) {
        this.lastHeadline = headline;
    }
}

class DashboardClient {
    private final LegacyNewsDatabase database;

    DashboardClient(LegacyNewsDatabase database) {
        this.database = database;
    }

    void refreshLoop() {
        String headline = database.fetchLatestHeadline();
        System.out.println("[Dashboard] Consultando banco manualmente: " + headline);
    }
}

class MobileClient {
    private final LegacyNewsDatabase database;

    MobileClient(LegacyNewsDatabase database) {
        this.database = database;
    }

    void refreshLoop() {
        System.out.println("[Mobile] Polling... nada novo");
    }
}

public class AntiPatternExample {
    public static void main(String[] args) {
        LegacyNewsDatabase db = new LegacyNewsDatabase();
        db.save("Breaking News!");

        List.of(new DashboardClient(db), new MobileClient(db))
            .forEach(DashboardClient::refreshLoop);
    }
}
