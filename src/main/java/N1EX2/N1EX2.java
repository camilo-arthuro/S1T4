package N1EX2;

import java.util.ArrayList;

public class N1EX2 {
    /*Crea una clase llamada CalculoDni que calcule la letra del DNI al recibir el número como parámetro.
    Crea una clase jUnit que verifique su correcto funcionamiento, parametrizándola para que el test reciba
    un espectro de datos amplio y valide si el cálculo es correcto para 10 números de DNI predefinidos*/

    public static void runProgram(){
        int dni1 = 12345678;
        String letterDni = "";
        N1EX2 exercise = new N1EX2();
        ArrayList<Integer> dniList = exercise.dniList();

        for (int i = 0; i < dniList.size(); i++) {
            letterDni = calculoDni(dniList.get(i));
            System.out.println("DNI: " + dniList.get(i) + "-" + letterDni);
        }
    }

    public static ArrayList<Integer> dniList(){
        final ArrayList<Integer> numList = new ArrayList<>();

        numList.add(12345678);
        numList.add(87654321);
        numList.add(12348765);
        numList.add(87651234);
        numList.add(12783456);
        numList.add(87126534);
        numList.add(98765432);
        numList.add(12093487);
        numList.add(90785634);
        numList.add(21436587);

        return numList;
    }

    public static String calculoDni(int dni){
        String letter = "";
        int resto = dni % 23;
        int[] numResto = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        String[] letterDni = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X",
                "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        for (int i = 0; i < numResto.length; i++) {
            if(numResto[i] == resto){
                letter = letterDni[i];
            }
        }
        return letter;
    }
}
