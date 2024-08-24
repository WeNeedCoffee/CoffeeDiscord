package coffee.weneed.chat.discord.api;

import coffee.weneed.chat.discord.api.handlers.*;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.interaction.command.CommandAutoCompleteInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageDeleteEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class DiscordListener extends ListenerAdapter {
	@Override
	public void onMessageReactionAdd(MessageReactionAddEvent event) {
		for (IReactionAddHandler handler : HandlerRegistry.getReactionAddHandlers()) if (handler.handles(event)) handler.handleEvent(event);
	}
	@Override
	public void onMessageDelete(MessageDeleteEvent event) {
		for (IMessageDeleteHandler handler : HandlerRegistry.getMessageDeleteHandlers()) if (handler.handles(event)) handler.handleEvent(event);
	}
	@Override
	public void onGuildMemberJoin(GuildMemberJoinEvent event) {
		for (IJoinHandler handler : HandlerRegistry.getJoinHandlers()) if (handler.handles(event)) handler.handleEvent(event);
	}

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		for (IMessageHandler handler : HandlerRegistry.getMessageHandlers()) if (handler.handles(event)) handler.handleEvent(event);
	}

	@Override
	public void onSlashCommandInteraction(SlashCommandInteractionEvent event){
		for (ISlashCommandInteractionHandler handler : HandlerRegistry.getSlashCommandInteractionHandlers()) if (handler.handles(event)) handler.handleEvent(event);
	}

	@Override
	public void onCommandAutoCompleteInteraction(CommandAutoCompleteInteractionEvent event) {
		for (ISlashCommandInteractionHandler handler : HandlerRegistry.getSlashCommandInteractionHandlers()) if (handler.handles(event)) handler.handleEvent(event);
	}
}
