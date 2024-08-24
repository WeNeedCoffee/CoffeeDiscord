package coffee.weneed.chat.discord.api.handlers;

import net.dv8tion.jda.api.events.message.MessageDeleteEvent;

public interface IMessageDeleteHandler extends IHandler {
	void handleEvent(MessageDeleteEvent event);

	boolean handles(MessageDeleteEvent event);
}
