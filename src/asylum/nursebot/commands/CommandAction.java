package asylum.nursebot.commands;

import org.telegram.telegrambots.exceptions.TelegramApiException;

public interface CommandAction {
	void action(CommandContext context) throws TelegramApiException;
}
