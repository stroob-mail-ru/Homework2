public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

        System.out.println();
        System.out.println("Задача 2");

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

        System.out.println();
        System.out.println("Задача 3");

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog " + dog);
        System.out.println("cat " + cat);
        System.out.println("paper " + paper);

        System.out.println();
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println("friend " + friend);
        friend = friend + 2;
        System.out.println("friend " + friend);
        friend /= 7;
        System.out.println("friend " + friend);

        System.out.println();
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println("frog " + frog);
        frog *= 10;
        System.out.println("frog " + frog);
        frog /= 3.5;
        System.out.println("frog " + frog);
        frog += 4;
        System.out.println("frog " + frog);

        System.out.println();
        System.out.println("Задача 6");

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var twoBoxersTotalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух бойцов равна " + twoBoxersTotalWeight + " кг");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Рззница в весе " + weightDifference + " кг");

        System.out.println();
        System.out.println("Задача 7");

        System.out.println("Рззница в весе при вычетании " + weightDifference + " кг");
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Рззница в весе с функцией остаток от деления " + weightDifference + " кг");

        System.out.println();
        System.out.println("Задача 8");

        var workingHoursTotal = 640;
        var employeesWorkingHours = 8;
        var employeesTotal = workingHoursTotal / employeesWorkingHours;
        System.out.println("Всего работников в компании - " + employeesTotal + " человек");
        employeesTotal += 94;
        workingHoursTotal =  employeesTotal * employeesWorkingHours;
        System.out.println("Если в компании работает " + employeesTotal + " человека, то всего " + workingHoursTotal + " часа работы может быть поделено между сотрудниками");

    }
}