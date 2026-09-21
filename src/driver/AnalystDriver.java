/*
 * Matthew Flynn - mflynn4
 * CIS171 Tues Afternoon
 * Date:09/20/2026
 * Operating System: MacOS
 * IDE: IntelliJ
 * Program Description(short): Program that tracks security analysts
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or unmodified
 * Documentation of Resources Used: Module Videos
 */
package driver;

import model.SecurityAnalyst;

public class AnalystDriver {
    public static void main(String[] args) {

// Creating the default analyst using default constructor
        System.out.println("Default Object:\n");
        SecurityAnalyst analyst1 = new SecurityAnalyst();
        System.out.println(analyst1);
        System.out.println();

// Using setter methods to add analyst info
        System.out.println("After Using Setters:\n");
        analyst1.setAnalystName("Elena Ellen");
        analyst1.setCertification("CEH");
        analyst1.setYearsExperience(4);
        analyst1.setActiveIncident(true);
        System.out.println(analyst1);
        System.out.println();
// Creating second analyst
        System.out.println("Non-Default Object:\n");
        SecurityAnalyst analyst2 = new SecurityAnalyst("Marcus Vance", "CISA", 6, false);
        System.out.println(analyst2);
        System.out.println();
// Using setter methods to change existing info
        System.out.println("After Name Change:\n");
        analyst2.setAnalystName("Marcus Cass");
        analyst2.setCertification("CISSP");
        System.out.println(analyst2);
        System.out.println();
// Using a getter method to read one piece of info (certification)
        System.out.println("Certification:\n");
        System.out.println(analyst2.getCertification());
        System.out.println();
// Running custom investigate method for analysts
        System.out.println("Investigate Method:\n");
        System.out.println(analyst1.investigate());
        System.out.println(analyst2.investigate());

    }
}