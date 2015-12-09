package sk.upjs.ics.paz1c.jtable;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class HockeyPlayersTableModel extends AbstractTableModel {
    public static final String UNKNOWN_VALUE = "???";
    private HockeyPlayersDao hockeyPlayersDao = DaoFactory.INSTANCE.getHockeyPlayersDao();

    public static final int COLUMN_COUNT = 3;

    public static final int COLUMN_NAME = 0;

    public static final int COLUMN_JERSEY = 1;

    public static final int COLUMN_TEAM = 2;

    public static final String[] COLUMN_NAMES = { "ID", "Name", "Jersey", "Team" };

    @Override
    public int getRowCount() {
        return getPlayers().size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_COUNT;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Player player = getPlayers().get(rowIndex);
        switch (columnIndex) {
            case COLUMN_NAME:
                return player.getName();
            case COLUMN_JERSEY:
                return player.getJerseyNumber();
            case COLUMN_TEAM:
                return player.getTeam();
            default:
                return UNKNOWN_VALUE;
        }
    }

    private List<Player> getPlayers() {
        return hockeyPlayersDao.list();
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }

    public Player getPlayerAt(int index) {
        return getPlayers().get(index);
    }
}
