package coffee.weneed.chat.discord.api.handlers;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.interaction.command.CommandAutoCompleteInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData;

public interface ISlashCommandInteractionHandler extends IHandler {

    void registerCommand(JDA jda);
    SlashCommandData getCommandDataForRegistry();
    void handleEvent(SlashCommandInteractionEvent event);

    void handleEvent(CommandAutoCompleteInteractionEvent event);

    boolean handles(SlashCommandInteractionEvent event);

    boolean handles(CommandAutoCompleteInteractionEvent event);
}
