package asylum.nursebot.semantics;

import org.telegram.telegrambots.exceptions.TelegramApiException;

public interface SemanticAction {
	void action(SemanticContext context) throws TelegramApiException;
}
