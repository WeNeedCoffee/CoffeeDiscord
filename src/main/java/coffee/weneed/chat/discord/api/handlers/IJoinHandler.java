package coffee.weneed.chat.discord.api.handlers;


import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;

public interface IJoinHandler extends IHandler {
	void handleEvent(GuildMemberJoinEvent event);

	boolean handles(GuildMemberJoinEvent event);
}
