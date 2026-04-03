package github.ciluqwq.hidemodded.mixin.client;

import net.minecraft.util.ModCheck;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
@Mixin(ModCheck.class)
public class HideModded {
    /**
     * @author CiLuQwQ
     * @reason
     */
    @Overwrite
    public boolean shouldReportAsModified() {
        return false;
    }
}
