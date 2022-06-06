package com.fzz.boardbrick.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class rwmCommand implements Command<CommandContext> {
    @Override
    public int run(CommandContext<CommandContext> context) throws CommandSyntaxException {
        return 0;
    }

    /*
     *
     * /rwm string int
     *
     * */


}
