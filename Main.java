public class Main {
    public static void main(String[] args) {
        int personalAccount = 100;
        int replenishmentAmount = 100;
        boolean bonus = true;
        int bonusReplenishment;
        if (replenishmentAmount >= 1000) {
            bonusReplenishment = replenishmentAmount / 100;
        } else {
            bonusReplenishment = 0;
        }
        System.out.println(personalAccount + replenishmentAmount + bonusReplenishment);
    }
}
