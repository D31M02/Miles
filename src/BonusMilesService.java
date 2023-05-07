public class BonusMilesService {
    public int calculate(int cost) {
        int bonusScale = 20;
        int bonusMiles = cost / bonusScale;
        return bonusMiles;
    }
}
