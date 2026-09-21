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
package model;

public class SecurityAnalyst {

    // Instance fields
    private String analystName;
    private String certification;
    private int yearsExperience;
    private boolean activeIncident;

    // Default constructor
    public SecurityAnalyst() {
        this.analystName = "Unknown";
        this.certification = "None";
        this.yearsExperience = 0;
        this.activeIncident = false;
    }

    // Non default constructor
    public SecurityAnalyst(String analystName, String certification, int yearsExperience, boolean activeIncident) {
        this.analystName = analystName;
        this.certification = certification;
        this.yearsExperience = yearsExperience;
        this.activeIncident = activeIncident;
    }

    // Investigate Method
    public String investigate() {
        return this.analystName + " is investigating a potential security incident.";
    }

    @Override
    public String toString() {
        return "SecurityAnalyst{" +
                "analystName='" + analystName + '\'' +
                ", certification='" + certification + '\'' +
                ", yearsExperience=" + yearsExperience +
                ", activeIncident=" + activeIncident +
                '}';
    }

    // Getters and Setters
    public String getAnalystName() {
        return analystName;
    }

    public void setAnalystName(String analystName) {
        this.analystName = analystName;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public boolean isActiveIncident() {
        return activeIncident;
    }

    public void setActiveIncident(boolean activeIncident) {
        this.activeIncident = activeIncident;
    }

}