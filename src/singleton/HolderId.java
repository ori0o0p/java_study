package singleton;

public class HolderId {
    private HolderId() {}

    private static class Holder {
        private static final HolderId INSTANCE = new HolderId();
    }

    public static HolderId getInstance() {
        return Holder.INSTANCE;
    }
}
