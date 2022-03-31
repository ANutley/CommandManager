package me.anutley.jdautils.commands.application.slash.annotations;

import net.dv8tion.jda.api.interactions.commands.Command.Choice;

/**
 * An annotation to represent a {@link Choice} when registering a command
 */
public @interface SlashChoice {

    /**
     * @return the name of the slash command option choice
     */
    String name();

    /**
     * @return the value which the slash command option choice will return
     */
    String value();

}
