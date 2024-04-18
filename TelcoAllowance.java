import java.util.*;

public class TelcoAllowance implements UsagePromo {

    private static Map<String, Integer> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", 15);
        allowanceMap.put("Globe", 10);
        allowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        // TODO Auto-generated method stub
        int dataAllowance = allowanceMap.get(telcoName);

        return "Offers a data allowance of " + dataAllowance + " GB for " + money + " pesos per month";
    }

    public String showAllowance(TelcoSubscription telco) {
        // TODO Auto-generated method stub
        return this.showAllowance(telco.getTelcoName(), telco.getPromoPrice());
    }

}