package coffee.weneed.chat.discord.api.handlers;

import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;

public interface IReactionAddHandler extends IHandler {
	void handleEvent(MessageReactionAddEvent event);

	boolean handles(MessageReactionAddEvent event);
}
