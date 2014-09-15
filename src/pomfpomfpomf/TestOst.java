package pomfpomfpomf;

import org.spongepowered.api.event.SpongeEventHandler;
import org.spongepowered.api.event.state.InitializationEvent;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.plugin.Plugin;


@Plugin(id = "PomfPomfPomf", name = "PomfPomfPomfLukkan99sTest")
public class TestOst {
    @SpongeEventHandler
    public void onInitialization(InitializationEvent event) {
        event.getGame().getLogger().info("INITIALIZATION!!!!!!!!!!!!!!!!!!!!!!!!!!");
        event.getGame().getLogger().warn("woot this is a test for sponge");
        event.getGame().getLogger().error("test no3");
    }

    @SpongeEventHandler
    public void onServerStarting(ServerStartingEvent event) {
        event.getGame().getLogger().info("server is starting!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        event.getGame().getLogger().warn("woot this is a test too");
        event.getGame().getLogger().error("pomfpomfpomf");
    }
}
