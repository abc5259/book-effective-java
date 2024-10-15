package item3;

public class ElvisV2 {
    private static final ElvisV2 INSTANCE = new ElvisV2();
    private ElvisV2() {}
    public static ElvisV2 getInstance() {
        return INSTANCE;
    }
}
