
public class Signals {
    private String name;

    private Signals(String name) {
        this.name = name;
    }

    private static final String UP = new String("up");
    private static final String DOWN = new String("down");
    private static final String LEFT = new String("left");
    private static final String RIGHT = new String("right");


    public static String getIndex(String elem) {
        switch (elem.toUpperCase()) {
            case "UP": return "0";
            case "DOWN": return "1";
            case "LEFT": return "2";
            case "RIGHT": return "3";
            default: break;
        }
        return "Out of borders";
    }

    public static String getSignalByIndex(String elem) {
        switch (elem.toUpperCase()) {
            case "0": return "UP";
            case "1": return "DOWN";
            case "2": return "LEFT";
            case "3": return "RIGHT";
            default: break;
        }
        return "Out of borders";
    }

    public static String[] getValues() {
        return new String[] {UP,DOWN,LEFT, RIGHT};
    }

    public static void main(String[] args) {
        System.out.println(Signals.DOWN);
        String [] newsign = Signals.getValues();
        System.out.println(newsign[3]);
    }

}
