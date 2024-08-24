package coffee.weneed.chat.discord.api;

import coffee.weneed.chat.discord.api.handlers.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

import java.util.ArrayList;
import java.util.List;

public class HandlerRegistry {
	private static List<IMessageHandler> messageHandlers = new ArrayList<>();
	private static List<IJoinHandler> joinHandlers = new ArrayList<>();
	private static List<IReactionAddHandler> reactionAddHandlers = new ArrayList<>();
	private static List<IMessageDeleteHandler> messageDeleteHandlers = new ArrayList<>();
	private static List<ISlashCommandInteractionHandler> slashCommandInteractionHandlers = new ArrayList<>();
	public static void addHandler(IHandler... handlers){
		for (IHandler handler : handlers) {
			if (handler instanceof IMessageHandler)
				messageHandlers.add((IMessageHandler) handler);
			else if (handler instanceof IJoinHandler)
				joinHandlers.add((IJoinHandler) handler);
			else if (handler instanceof IReactionAddHandler)
				reactionAddHandlers.add((IReactionAddHandler) handler);
			else if (handler instanceof IMessageDeleteHandler)
				messageDeleteHandlers.add((IMessageDeleteHandler) handler);
			else if (handler instanceof ISlashCommandInteractionHandler)
				slashCommandInteractionHandlers.add((ISlashCommandInteractionHandler) handler);
		}
	}
	private static boolean registered = false;
	public static void addMessageHandler(IMessageHandler handler){
		messageHandlers.add(handler);
	}

	public static void addMessageDeleteHandler(IMessageDeleteHandler handler){
		messageDeleteHandlers.add(handler);
	}

	public static void addJoinHandler(IJoinHandler handler) {
		joinHandlers.add(handler);
	}

	public static void addReactionAddHandler(IReactionAddHandler handler) {
		reactionAddHandlers.add(handler);
	}

	public static List<IMessageHandler> getMessageHandlers() {
		return messageHandlers;
	}

	public static List<IJoinHandler> getJoinHandlers() {
		return joinHandlers;
	}

	public static List<IReactionAddHandler> getReactionAddHandlers() {
		return reactionAddHandlers;
	}

	public static List<IMessageDeleteHandler> getMessageDeleteHandlers() {
		return messageDeleteHandlers;
	}

	public static List<ISlashCommandInteractionHandler> getSlashCommandInteractionHandlers() { return slashCommandInteractionHandlers; }

}
