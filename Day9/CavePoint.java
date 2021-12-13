public class CavePoint {
    public static int k_defaultHeight = Integer.MAX_VALUE;

    private int m_x;
    private int m_y;
    private int m_height;
    private CavePoint m_up;
    private CavePoint m_down;
    private CavePoint m_left;
    private CavePoint m_right;

    public CavePoint() {
        m_x = Integer.MIN_VALUE;
        m_y = Integer.MIN_VALUE;
        m_height = k_defaultHeight;
        m_up = null;
        m_down = null;
        m_left = null;
        m_right = null;
    }

    public CavePoint(int x, int y) {
        m_x = x;
        m_y = y;
        m_height = k_defaultHeight;
        m_up = null;
        m_down = null;
        m_left = null;
        m_right = null;
    }

    public CavePoint(int x, int y, int height) {
        m_x = x;
        m_y = y;
        m_height = height;
        m_up = new CavePoint();
        m_down = new CavePoint();
        m_left = new CavePoint();
        m_right = new CavePoint();
    }

    public CavePoint(int x, int y, int height, CavePoint up, CavePoint down, CavePoint left, CavePoint right) {
        m_x = x;
        m_y = y;
        m_height = height;
        m_up = up;
        m_down = down;
        m_left = left;
        m_right = right;
    }

    public int getX() {
        return m_x;
    }

    public int getY() {
        return m_y;
    }

    public int getHeight() {
        return m_height;
    }

    public void setUp(CavePoint up) {
        m_up = up;
    }

    public void setDown(CavePoint down) {
        m_down = down;
    }

    public void setLeft(CavePoint left) {
        m_left = left;
    }

    public void setRight(CavePoint right) {
        m_right = right;
    }

    public boolean isLower(CavePoint other) {
        return (m_height < other.getHeight());
    }

    public boolean isLowestPoint() {
        return (isLower(m_up) && isLower(m_down) && isLower(m_left) && isLower(m_right));
    }
}
