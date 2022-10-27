package works.moes.shocking.shocking.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import works.moes.shocking.shocking.Shocking;

@Mixin(PlayerEntity.class)
public class ShockingMixin {
    @Inject(at = @At("TAIL"), method = "applyDamage")
    private void applyDamage(CallbackInfo info) {
        System.out.println("Ouch! I'm hurt!");
        Shocking.serialPort.writeBytes("1".getBytes(), 1);
    }
}
