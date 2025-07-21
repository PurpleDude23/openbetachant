package io.github.PurpleDude23.betachantmod.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateSwordItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class BetaFireAspect extends TemplateSwordItem implements CustomTooltipProvider {
    public BetaFireAspect(Identifier identifier, ToolMaterial arg) {
        super(identifier, arg);
   }

public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
    stack.damage(12, attacker);
    target.fireTicks += 20;;
    return true;
}

    @Override
    public String[] getTooltip(ItemStack itemInstance, String originalTooltip) {
        return new String[]{originalTooltip, "Is the betasharpness"};
    }
}