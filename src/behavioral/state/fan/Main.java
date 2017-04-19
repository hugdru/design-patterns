package behavioral.state.fan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        CeilingFanContext ceilingFanContext = new CeilingFanContext();
        while (true) {
            System.out.print("Press ENTER to pull");
            getLine();
            ceilingFanContext.pull();
        }
    }

    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}
