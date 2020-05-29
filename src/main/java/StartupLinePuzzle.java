import java.util.Arrays;

/**
 * Project: Puzzles
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: StartupLinePuzzle
 */

/*For the one thousand one hundred PLCs on each line and one thousand one hundred
 employees at the plant that participate in this the startup. The plant manager asks
 the first employee to go to every PLC and place it in RUN mode. Then he has the
 second employee go to every second PLC and place it in Program mode. The third
 goes to every third PLC and, if it is in PROGRAM mode, they place it in RUN mode,
 and if it is in RUN mode, they place it in PROGRAM mode. The fourth employee does
 this to every fourth PLC, and so on. After the process is completed with the one
 thousand one hundredth employee, how many PLCs are in RUN mode?*/


public class StartupLinePuzzle {

    public static void main(String[] args) {

        final int MAX_EMPLOYEE = 1100;
        boolean[] PLC = new boolean[1100];
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
