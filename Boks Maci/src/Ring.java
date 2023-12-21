public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            Fighter firstFighter = Fighter.getRandomStarter(f1, f2);
            Fighter secondFighter = (firstFighter == f1) ? f2 : f1;

            System.out.println("Maça İlk " + firstFighter.name + " Başlıyor!");

            while (f1.health > 0 && f2.health > 0) {
                // Dövüş döngüsü
                secondFighter.health = firstFighter.hit(secondFighter);
                if (isWin()) {
                    break;
                }

                firstFighter.health = secondFighter.hit(firstFighter);
                if (isWin()) {
                    break;
                }

                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }


    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}