package coffee.weneed.chat.discord.api.handlers;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public interface IMessageHandler {
	void handleEvent(MessageReceivedEvent event);

	boolean handles(MessageReceivedEvent event);
}
