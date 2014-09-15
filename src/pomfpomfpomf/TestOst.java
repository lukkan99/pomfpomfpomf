package pomfpomfpomf;

import org.spongepowered.api.event.SpongeEventHandler;
import org.spongepowered.api.event.state.InitializationEvent;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.plugin.Plugin;
//import org.spongepowered.api.Game;


@Plugin(id = "testingost", name = "Lukkan99sTEST")
public class TestOst {
    @SpongeEventHandler
    public void onInitialization(InitializationEvent event) {
        event.getGame().getLogger().info("INITIALIZATION!!!!!!!!!!!!!!!!!!!!!!!!!!");
        event.getGame().getLogger().warn("woot this is a test for sponge");
    }

    @SpongeEventHandler
    public void onServerStarting(ServerStartingEvent event) {
        event.getGame().getLogger().info("server is starting!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        event.getGame().getLogger().warn("woot this is a test too");
    }
}
