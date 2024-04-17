public class DogDrip {
    String[] mentValidationResult = {"웃김","적당히 웃김","안 웃김","🤬😡😠"};
    public String reaction(String result){
        if(result == "웃김") return "ㅋㅋ";
        else if(result == "적당히 웃김") return "ㅋㅋㅋㅋㅋ";
        else if(result == "안 웃김") return "뭐함?";
        else return "🤬😡😠";
    }
    public String validation(String ment){
        int randomNumber = (int)(Math.random() * mentValidationResult.length);
        String result = mentValidationResult[randomNumber];
        return reaction(result);
    }
    public String dripGo(String ment){
        return validation(ment);
    }
    public static void main(String[] args) {
        DogDrip drip1 = new DogDrip();
        String dayoungReaction = drip1.dripGo("다영아 컴퓨터가 되어야지");
        System.out.println(dayoungReaction);
    }
}

