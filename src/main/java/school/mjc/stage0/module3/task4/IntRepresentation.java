package school.mjc.stage0.module3.task4;

public class IntRepresentation {
    public static void main(String[] args) {
        char [] chars = {'c', 'h', 'a', 'r'};

        for(char c : chars) {
           int intRepresentation = (int) c;
            System.out.println("Character " + c + " Integer " + intRepresentation);
        }
    }
}
