package org.orecruncher.dsurround;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.orecruncher.dsurround.config.Configuration;
import org.orecruncher.dsurround.config.SoundConfiguration;
import org.orecruncher.dsurround.gui.keyboard.KeyBindings;
import org.orecruncher.dsurround.lib.TickCounter;
import org.orecruncher.dsurround.lib.logging.IModLog;
import org.orecruncher.dsurround.lib.logging.ModLog;
import org.orecruncher.dsurround.sound.StartupSoundHandler;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {

    public static final String ModId = "dsurround";
    public static final IModLog LOGGER = new ModLog(ModId);
    public static final Configuration Config = Configuration.getConfig();
    public static final SoundConfiguration SoundConfig = SoundConfiguration.getConfig();

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing...");

        TickCounter.register();
        StartupSoundHandler.register();
        KeyBindings.register();

        LOGGER.info("Initialization complete");
    }
}
