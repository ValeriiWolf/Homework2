// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task13();
        task45();
        task68();
    }

    public static void task13 () {
        System.out.println("Задача 1");
        var dog =8.0;
        var cat =3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 2");
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 3");
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task45 () {
        System.out.println("Задача 4");
        var friend=19;
        System.out.println(friend);
        friend=friend*2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
    }

    public static void task68 () {
        System.out.println("Задача 6");
        var massBoxer1=78.2;
        var massBoxer2=82.7;
        var sumMass= massBoxer1+massBoxer2;
        var massDifference= massBoxer2 - massBoxer1;
        System.out.println("Общий вес двух бойцов "+sumMass+"кг");
        System.out.println("Разница между весами бойцов "+massDifference+"кг");
        System.out.println("Задача 7");
        var massDifference1= massBoxer2 % massBoxer1;
        var massDifference2= massBoxer2 - massBoxer1;
        System.out.println("Разница между весами бойцов "+massDifference1+"кг");
        System.out.println("Разница между весами бойцов "+massDifference2+"кг");
        System.out.println("Задача 8");
        var sumTimeWork=640;
        var employeesWorkTime=8;
        var employee= sumTimeWork/employeesWorkTime;
        System.out.println("Всего работников в компании — "+employee+" человек");
        employee=employee+94;
        employeesWorkTime=sumTimeWork/employee;
        System.out.println("Если в компании работает "+employee+" человек, то всего "+employeesWorkTime+" часов работы может быть поделено между сотрудниками");

    }
}