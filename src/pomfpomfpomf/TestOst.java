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
        event.getGame().getLogger().info("remeber this is just a test");
    }

    @SpongeEventHandler
    public void onServerStarting(ServerStartingEvent event) {
        event.getGame().getLogger().info("server is starting!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        event.getGame().getLogger().warn("woot this is a test too");
        event.getGame().getLogger().error("pomfpomfpomf");
        event.getGame().getLogger().info("pomfpomfpomf is a console test made by lukkan99");
        event.getGame().getLogger().info("it was my first sponge plugin");
        event.getGame().getLogger().info("and it useless in a real server");
        event.getGame().getLogger().info("if you dont whant to see this every sever start up");
        event.getGame().getLogger().info("just remove pomfpomfpomf in mod folder");
    }
}
