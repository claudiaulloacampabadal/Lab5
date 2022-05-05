package domain;

import java.util.Calendar;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CircularDoublyLinkedListNGTest {

    public CircularDoublyLinkedListNGTest() {
    }

    @Test
    public void testSomeMethod() throws ListException {
        CircularDoublyLinkedList a = new CircularDoublyLinkedList();
        CircularDoublyLinkedList b = new CircularDoublyLinkedList();
        CircularDoublyLinkedList c = new CircularDoublyLinkedList();
        CircularDoublyLinkedList d = new CircularDoublyLinkedList();
        CircularLinkedList list = new CircularLinkedList();
        System.out.println("Laboratorio 5\n");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2002, 1, 25);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1999, 1, 4);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1997, 1, 5);
        //********************************************
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(1994, 1, 6);
        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(1992, 1, 7);
        Calendar calendar5 = Calendar.getInstance();
        calendar5.set(1988, 1, 8);
        Calendar calendar6 = Calendar.getInstance();
        calendar6.set(1985, 1, 9);
        Calendar calendar7 = Calendar.getInstance();
        calendar7.set(1983, 1, 6);
        //********************************************
        Calendar calendar8 = Calendar.getInstance();
        calendar8.set(1980, 1, 1);
        Calendar calendar9 = Calendar.getInstance();
        calendar9.set(1978, 1, 2);
        Calendar calendar10 = Calendar.getInstance();
        calendar10.set(1974, 1, 6);
        Calendar calendar11 = Calendar.getInstance();
        calendar11.set(1970, 1, 6);
        Calendar calendar17 = Calendar.getInstance();
        calendar17.set(1967, 1, 5);
        //**********************
        Calendar calendar13 = Calendar.getInstance();
        calendar13.set(1965, 1, 6);
        Calendar calendar14 = Calendar.getInstance();
        calendar14.set(1962, 1, 6);
        Calendar calendar15 = Calendar.getInstance();
        calendar15.set(1959, 1, 6);
        Calendar calendar16 = Calendar.getInstance();
        calendar16.set(1955, 1, 6);

        list.add(new Employee(125, "Claudia ", "Ulloa", "informática", calendar.getTime()));
        list.add(new Employee(78, "Mora ", "Fiorella", "administración", calendar1.getTime()));
        list.add(new Employee(7542, "Montoya ", "Maria", "inglés", calendar2.getTime()));
        list.add(new Employee(734722, "Soto ", "Nicolas", "turismo", calendar3.getTime()));
        list.add(new Employee(234325, "Quiros ", "Javier", "agronomía", calendar4.getTime()));
        list.add(new Employee(585, "Hernandez ", "Luis", "diseño publicitario", calendar5.getTime()));
        list.add(new Employee(45, "Alvarado ", "Daniela", "diseño web", calendar6.getTime()));
        list.add(new Employee(32, "Castro ", "Sebastian", "asesor", calendar7.getTime()));
        list.add(new Employee(254, "Sanabria ", "Mario", "doctora", calendar8.getTime()));
        list.add(new Employee(73, "Campabadal ", "Manuel", "derecho", calendar9.getTime()));
        list.add(new Employee(90, "Gomez", "Felipe", "informática", calendar10.getTime()));
        list.add(new Employee(89, "Aguilar", "Eugenia", "administración", calendar11.getTime()));
        list.add(new Employee(520, "Garro", "Tatiana", "inglés", calendar17.getTime()));
        list.add(new Employee(342, "Gomez", "Esteban", "turismo", calendar13.getTime()));
        list.add(new Employee(42, "Pacheco", "Diana", "agronomía", calendar14.getTime()));
        list.add(new Employee(10, "Ledezma", "Viviana", "diseño publicitario", calendar15.getTime()));
        list.add(new Employee(30, "Alfaro", "Paula", "diseño web", calendar16.getTime()));

        a = getAgeList(list, 18, 25);
        System.out.println("Los empleados añadidos que tienen un rango de edad de 18 a 25 en la lista a son:\n");
        System.out.println(a);
        b = getAgeList(list, 26, 40);
        System.out.println("Los empleados añadidos que tienen un rango de edad de 26 a 40 en la lista b son:\n");
        System.out.println(b);
        c = getAgeList(list, 41, 55);
        System.out.println("Los empleados añadidos que tienen un rango de edad de 41 a 55 en la lista c son:\n");
        System.out.println(c);
        d = getAgeList(list, 55, 10000);
        System.out.println("Los empleados añadidos que tienen un rango de edad mayor a 55 en la lista d son:\n");
        System.out.println(d);

    }

    private CircularDoublyLinkedList getAgeList(CircularLinkedList list,
            int low, int high) throws ListException {
        CircularDoublyLinkedList list2 = new CircularDoublyLinkedList();
        for (int i = 1; i <= list.size(); i++) {
            Employee ep = (Employee) list.getNode(i).data;
            if ((ep.getAge() <= high) && (ep.getAge() >= low)) {
                list2.add(ep);
            }
        }
        return !list2.isEmpty() ? list2 : null;
    }

}
