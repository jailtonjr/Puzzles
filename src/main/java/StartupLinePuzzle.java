import java.util.Arrays;

/**
 * Project: Puzzles
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: StartupLinePuzzle
 */
public class StartupLinePuzzle {

    public static void main(String[] args) {

        final int MAX_EMPLOYEE = 10;
        boolean[] PLC = new boolean[10];
        //first employee set all PLC as RUN mode = true
        Arrays.fill(PLC, true);

        for (int employee = 1; employee <= MAX_EMPLOYEE; employee++) {
            for (int i = 0; i < PLC.length; i++) {
                if ((i + 1) % (employee + 1) == 0) {

                    System.out.println("PLC: " + i + " Employee: " + employee);
                    // set PLC program mode = false / run mode = true
                    PLC[i] = !PLC[i];
                }
            }
        }

        printPLCRunModeOn(PLC);
    }

    private static void printPLCRunModeOn(boolean[] plc) {
        int PLCRunMode = 0;
        for (int i = 0; i < plc.length; i++) {
            if (plc[i]) {
                PLCRunMode++;
            }
        }

        System.out.println("Quantity of PLC in RUN mode is:" + PLCRunMode);
    }


}
