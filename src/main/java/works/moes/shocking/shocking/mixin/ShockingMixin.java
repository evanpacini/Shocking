package works.moes.shocking.shocking.mixin;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import works.moes.shocking.shocking.Shocking;
import static java.lang.Math.min;

@Mixin(PlayerEntity.class)
public abstract class ShockingMixin {
    @Inject(method = "applyDamage", at = @At("TAIL"))
    private void applyDamage(DamageSource source, float amount, CallbackInfo ci) {
        Shocking.LOGGER.info("Ouch! I'm hurt! Amount: " + min(amount, 20f));
        Shocking.send(new byte[(int) min(amount, 20f)]);
    }
}
