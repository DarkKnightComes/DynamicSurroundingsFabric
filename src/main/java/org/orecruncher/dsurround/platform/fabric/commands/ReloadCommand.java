package org.orecruncher.dsurround.platform.fabric.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import org.orecruncher.dsurround.commands.ReloadCommandHandler;

import static net.fabricmc.fabric.api.client.command.v2.ClientCommandManager.literal;

class ReloadCommand extends ClientCommand {

    ReloadCommand() {
        super("dsreload");
    }

    public void register(CommandDispatcher<FabricClientCommandSource> dispatcher) {
        dispatcher.register(literal(this.command).executes(this::execute));
    }

    private int execute(CommandContext<FabricClientCommandSource> ctx) {
        return this.execute(ctx, ReloadCommandHandler::execute);
    }
}