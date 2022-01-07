package com.autovw.advancednetherite.content.armor;

import com.autovw.advancednetherite.common.item.AdvancedArmorItem;
import com.autovw.advancednetherite.config.Config;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;

/**
 * Author: Autovw
 */
public class NetheriteDiamondArmorItem extends AdvancedArmorItem {
    public NetheriteDiamondArmorItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public boolean pacifiesEndermen() {
        return Config.ArmorConfig.diamondEndermanPassiveArmor.get();
    }

    @Override
    public boolean pacifiesPiglins() {
        return Config.ArmorConfig.diamondPiglinPassiveArmor.get();
    }
}
