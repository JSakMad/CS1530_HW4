package edu.pitt.se;

public class PatientDataStrategy implements DataProcessingStrategy {
 
    public String process(String text){
    
        // Patient processing
        String result = text;

        // Check record structure
        if (!result.contains("Name") || !result.contains("Condition")) {
            return "Invalid patient record.";
        }

        // Anonymize name (naive)
        result = result.replaceAll("Name: [A-Za-z ]+", "Name: *****");

        return "[PATIENT] " + result;
    }

}
