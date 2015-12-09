package sk.upjs.ics.paz1c.jtable;

public enum DaoFactory {
    INSTANCE;

    public HockeyPlayersDao getHockeyPlayersDao() {
        return new HockeyPlayersDao();
    }
}
