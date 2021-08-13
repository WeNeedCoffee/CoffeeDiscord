package coffee.weneed.chat.discord.api;

import coffee.weneed.chat.discord.api.handlers.IJoinHandler;
import coffee.weneed.chat.discord.api.handlers.IMessageHandler;
import coffee.weneed.chat.discord.api.handlers.IReactionAddHandler;

import java.util.ArrayList;
import java.util.List;

public class HandlerRegistry {
	private static List<IMessageHandler> messageHandlers = new ArrayList<>();
	private static List<IJoinHandler> joinHandlers = new ArrayList<>();
	private static List<IReactionAddHandler> reactionAddHandlers = new ArrayList<>();

	public static void addMessageHandler(IMessageHandler handler){
		messageHandlers.add(handler);
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
}
