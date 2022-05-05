
package domain;

import java.util.Calendar;
import org.testng.annotations.Test;


public class CircularLinkedListNGTest {
    
    public CircularLinkedListNGTest() {
    }

    @Test
    public void testSomeMethod() throws ListException {
        CircularLinkedList list = new CircularLinkedList();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2001, 1, 3);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1997, 1, 5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1993, 1, 7);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(1991, 1, 9);
        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(1982, 1, 3);
        Calendar calendar5 = Calendar.getInstance();
        calendar5.set(1969, 1, 10);
        Calendar calendar6 = Calendar.getInstance();
        calendar6.set(1964, 1, 25);
        Calendar calendar7 = Calendar.getInstance();
        calendar7.set(1961, 1, 14);
        Calendar calendar8 = Calendar.getInstance();
        calendar8.set(1958, 1, 13);
        Calendar calendar9 = Calendar.getInstance();
        calendar9.set(1956, 1, 7);
        System.out.println("Laboratorio 5 Grupo #3\n");
        list.add(new Employee(125, "Ulloa ", "Claudia", "informática", calendar.getTime()));
        list.add(new Employee(78, "Mora", " Fiorella", "administración", calendar1.getTime()));
        list.add(new Employee(7542, "Montoya ", "Maria", "inglés", calendar2.getTime()));
        list.add(new Employee(734722, "Soto", "Nicolas", "turismo", calendar3.getTime()));
        list.add(new Employee(234325, "Quiros", "Javier", "agronomía", calendar4.getTime()));
        list.add(new Employee(585, "Hernandez", "Luis", "diseño publicitario", calendar5.getTime()));
        list.add(new Employee(45, "Alvarado", "Daniela", "diseño web", calendar6.getTime()));
        list.add(new Employee(32, "Castro", "Sebastian", "asesor", calendar7.getTime()));
        list.add(new Employee(254, "Sanabria", "Mario", "doctor", calendar8.getTime()));
        list.add(new Employee(75, "Campabadal", "Manuel", "abogado", calendar9.getTime()));
        
        System.out.println("Los empleados de la empresa con un rango de edad de 18 hasta los 25 son los siguientes:\n");
        System.out.println(getAgeList(list, 18, 25).toString());
        System.out.println("Los empleados de la empresa con un rango de edad de 26 hasta los 40 son los siguientes:\n");
        System.out.println(getAgeList(list, 26, 40).toString());
        System.out.println("Los empleados de la empresa con un rango de edad de 41 hasta los 55 son los siguientes:\n");
        System.out.println(getAgeList(list, 41, 55).toString());
        System.out.println("Los empleados de la empresa con un rango mayor a 55 son :\n");
        System.out.println(getAgeList(list, 55, 10000).toString());
        
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Los detalles del asesor son:\n");
        System.out.println(getTitleList(list, "asesor"));
        System.out.println("\nLos detalles del informático son:\n");
        System.out.println(getTitleList(list, "informática"));
    }
    //Este metodo retorna una lista circular con los rangos de edades
    //indicadas
    private CircularLinkedList getAgeList(CircularLinkedList list,
        int low, int high) throws ListException {
        CircularLinkedList list2 = new CircularLinkedList();
        for (int i = 1; i <= list.size(); i++) {
            Employee ep = (Employee) list.getNode(i).data;
            if ((ep.getAge() <= high) && (ep.getAge() >= low)) {
                list2.add(ep);
            }
        }
        return !list2.isEmpty() ? list2 : null;
    }
    
    private CircularLinkedList getTitleList(CircularLinkedList list,String title) throws ListException{
       CircularLinkedList list3=new CircularLinkedList();
       for (int i = 1; i <= list.size(); i++) {
            Employee ep = (Employee) list.getNode(i).data;
            if (ep.getTitle().equals(title)) {
                list3.add(ep);
            }
        }
       return !list3.isEmpty() ? list3 : null;
    }

}//END END
