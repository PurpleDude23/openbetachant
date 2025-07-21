package io.github.PurpleDude23.betachantmod.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateSwordItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class BetaSharpness extends TemplateSwordItem implements CustomTooltipProvider {
    public BetaSharpness(Identifier identifier, ToolMaterial arg) {
        super(identifier, arg);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(14, attacker);
        return true;
    }

    @Override
    public String[] getTooltip(ItemStack itemInstance, String originalTooltip) {
        return new String[]{originalTooltip, "this is the beta"};
    }
}