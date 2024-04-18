import java.util.*;

public class UnliCallTextPackage implements UnliCallOffer {

    private static Map<String, String> unliCallOfferMap = new HashMap<>();

    static {
        unliCallOfferMap.put("Smart",
                "Do not offer any free calls or texts, and you will be charged per use.");
        unliCallOfferMap.put("Globe",
                "Comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        unliCallOfferMap.put("Ditto",
                "Includes unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        String result = "";

        if (!unliCallText) {
            result = "Do not offer any free calls or texts, and you will be charged per use.";
        } else {
            result = unliCallOfferMap.getOrDefault(telcoName, "Telco Name not Found");
        }

        return result;
    }

    public String showUnliCallsTextOffer(TelcoSubscription telco) {
        // TODO Auto-generated method stub
        return this.showUnliCallsTextOffer(telco.getTelcoName(), telco.isUnliCallText());
    }
}