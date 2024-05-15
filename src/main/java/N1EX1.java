import java.util.ArrayList;

public class N1EX1 {

    public ArrayList<String> months(){
        /*Crea una clase Java que inserte en una lista ordenada los nombres de los meses del año.
        Verifica con jUnit que la lista tiene 12 posiciones, que no es nula y que en su posición 8
        contiene el nombre 'agosto'*/
        // Create the list
        ArrayList<String> monthsList = new ArrayList<>();

        // Inserting the months in the list
        monthsList.add("January");
        monthsList.add("February");
        monthsList.add("March");
        monthsList.add("April");
        monthsList.add("May");
        monthsList.add("June");
        monthsList.add("July");
        monthsList.add("August");
        monthsList.add("September");
        monthsList.add("October");
        monthsList.add("November");
        monthsList.add("December");

        return monthsList;
    }
}
