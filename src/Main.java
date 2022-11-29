public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4.0;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println(totalWeight);
        var weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println(weightDifference);
        var weightDifference2 = weightSecondBoxer % weightFirstBoxer ;
        System.out.println(weightDifference2);

        var hoursWork = 640;
        var hoursOneWorker = 8;
        var amounWorkers = hoursWork / hoursOneWorker;
        System.out.println("Всего работников в компании — " + amounWorkers + " человек");
        amounWorkers = amounWorkers + 94;
        hoursWork = hoursOneWorker *  amounWorkers;
        System.out.println("Если в компании работает " + amounWorkers + " человек, то всего " + hoursWork + " часов работы может быть поделено между сотрудниками");

    }
}