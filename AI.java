package javaSE;

public class AI {
    public String answer(String question){
        String net = null;
        net = handleCanStart(question);
        if (net!=null){
            return net;
        }
        net = handleAskTail(question);
        if (net!=null){
            return net;
        }
        net = unknownAnswer(question);
        return net;
    }

    private  String handleCanStart(String question){
        String[] canStart = new String[]{"会","能","有","敢","在",};
        for (int i = 0; i < canStart.length; i++) {
            if (question.startsWith(canStart[i])){
                return (canStart[i]+"!");
            }
        }
        return null;
    }
    private  String handleAskTail(String question){
        String[] askTail = new String[]{"吗？","吗","吗？ "};
        for (int i = 0; i <askTail.length; i++) {
            if (question.endsWith(askTail[i])){
                return question.replace(askTail[i],"!");

            }
        }
        return null;
    }
    private  String unknownAnswer(String question){
        return question+"!";
    }


}
