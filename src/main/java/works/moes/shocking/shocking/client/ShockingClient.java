package works.moes.shocking.shocking.client;

import net.fabricmc.api.ModInitializer;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class ShockingClient implements ModInitializer {
    @Override
    public void onInitialize() {
        System.out.println("[Shocking] Hello Fabric world!");
    }
}
