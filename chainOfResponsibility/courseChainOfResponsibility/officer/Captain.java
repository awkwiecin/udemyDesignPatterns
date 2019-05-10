package pl.awkwiecin.chainOfResponsibility.courseChainOfResponsibility.officer;

import co.devfoundry.chainOfResponsibility.courseChainOfResponsibility.message.Message;
import pl.awkwiecin.chainOfResponsibility.courseChainOfResponsibility.message.Message;

public class Captain extends Officer{

    private static final int CODE = 50;
    private static final String NAME = "Kapitan Rokokowski";



    @Override
    public void processMessage(Message message) {

        if (message.getOfficerRank().equals(OfficerRank.CAPTAIN)
                && message.getCode()==CODE)
            System.out.println(NAME + " otrzymał wiadomość: " +message.getContent() );
        else
            getSuperiorOfficer().processMessage(message);

    }
}
