import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         University, School, Car жана Person деген класс тузунуз

         Алардын свойстваларын ойлоп табыныз

         Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек

         Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз

         Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз  **/

        Person person = new Person();
        person.setName("Eldiyar");
        person.setSurname("Avazbekov");
        person.setAge(18);

        Person person1 = new Person();
        person1.setName("Beka");
        person1.setSurname("Bekov");
        person1.setAge(23);

        Person person2 = new Person();
        person2.setName("Jyldyz");
        person2.setSurname("Avazbekova");
        person2.setAge(22);

        Person[] namesss = {person,person1,person2};
        String countName = null;
        String countSurname = null;
        int count = 0;
        for (Person person2Fullstag : namesss) {


            countName = person2Fullstag.getName();
            countSurname = person2Fullstag.getSurname();
            count = person2Fullstag.getAge();

            System.out.println("Persondun aty: " + countName);
            System.out.println("Persondun surnamemi: " + countSurname);
            System.out.println("Persondun agegi: " + count);
        }



        System.out.println("----------------------------------");




        Car car = new Car();
        car.setNameCar("BMW");
        car.setVolume(6.6);
        car.setColor("black");

        Car car1 = new Car();
        car1.setNameCar("Mersedes-Benz");
        car1.setVolume(6.3);
        car1.setColor("white");

        Car car2 = new Car();
        car2.setNameCar("Tayota");
        car2.setVolume(8.8);
        car2.setColor("white");


        Car[] namessCar = {car,car1,car2};
        String countNameCar = null;
        double countValumeCar = 0D;
        String countColorCar = null;

        for (Car cars: namessCar){
            countNameCar = cars.getNameCar();
            countValumeCar = cars.getVolume();
            countColorCar = cars.getColor();;

            System.out.println("Cardyn aty: " + countNameCar);
            System.out.println("Cardyn valumu: " + countValumeCar);
            System.out.println("Cardyn coloru: " + countColorCar);
        }


        System.out.println("-------------------------------------------");




        School school = new School();
        school.setStudent(800);
        school.setTeacher(35);
        school.setKabinet(35);

        School school1 = new School();
        school1.setStudent(700);
        school1.setTeacher(20);
        school1.setKabinet(23);

        School school2 = new School();
        school2.setStudent(650);
        school2.setTeacher(20);
        school2.setKabinet(30);

        School[] namesssSchool = {school, school1,school2};
        int countStudent = 0;
        int countTeacher = 0;
        int countkabinet = 0;
        for (School schools : namesssSchool) {


            countStudent = schools.getStudent();
            countTeacher = schools.getTeacher();
            countkabinet = schools.getKabinet();

            System.out.println("Schooldun ichindegi okuuchulardyn kolichestvasy: " + countStudent);
            System.out.println("Schooldun ichindegy mugalimderdin kolichestvasy: " + countTeacher);
            System.out.println("Schooldun ichindegy kabinetterdin kolichestvasy: " + countkabinet);
        }



        System.out.println("--------------------------------------");




        University university = new University();
        university.setStudent(599);
        university.setAdress("Grazhdanskaya 119");
        university.setNameUniversity("Peaksoft House");

        University university1 = new University();
        university1.setStudent(300);
        university1.setAdress("Uchkun 34");
        university1.setNameUniversity("Motion Veb");

        University university2 = new University();
        university2.setStudent(499);
        university2.setAdress("Vostok 5");
        university2.setNameUniversity("Manas");

        University[] universitys = {university,university1,university2};
        int countKolichestvaStudent = 0;
        String countAdress = null;
        String countNameUnuversity = null;

        for (University universitySSS : universitys){

            countKolichestvaStudent = universitySSS.getStudent();
            countAdress = universitySSS.getAdress();
            countNameUnuversity = universitySSS.getNameUniversity();

            System.out.println("Studentterdin kolichestvasy: " + countKolichestvaStudent);
            System.out.println("University adressi: " + countAdress);
            System.out.println("University aty: " + countNameUnuversity);
        }
    }
}