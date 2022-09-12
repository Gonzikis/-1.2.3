public class Main {
    public static void main(String[] args) {
        //Задание 6
        System.out.println("Задание 6");
        var boxer1weight = 78.2;
        var boxer2weight = 82.7;
        System.out.println("Общий вес двух бойцов: " + (boxer1weight + boxer2weight) + "кг");
        System.out.println("Разница в весе двух бойцов: " + (boxer2weight - boxer1weight) + "кг");
        //Задание 7
        System.out.println("Задание 7");
        System.out.println("Разница в весе двух бойцов 1 способ: " + (boxer2weight - boxer1weight) + "кг");
        System.out.println("Разница в весе двух бойцов 2 способ: " + (boxer2weight % boxer1weight) + "кг");
        //Задание 8
        System.out.println("Задание 8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmployees = totalWorkingHours / hoursPerDay;
        System.out.println("Если в компании работает " + ( totalEmployees ) + " человек,");

        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * hoursPerDay;
        System.out.println("Если в компании работает " +  totalEmployees  + " человек, то всего " +  totalWorkingHours  + " часа работы может быть поделено между сотрудниками");








    }
}