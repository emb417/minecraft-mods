package org.devoxx4kids.forge.mods;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ElectronicIngotFromElectronicBlock extends Block {
	private String textureName;

	public ElectronicIngotFromElectronicBlock() {
		super(Material.iron);
		this.setUnlocalizedName("ElectronicBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.textureName = "mymods:electronic_block";
		this.setResistance(5.0F);
		this.setHardness(10.0F);
		this.setLightLevel(1.0F);
	}
	
	public Item getItemDropped(int i1, Random random, int i2)
    {
        return Main.electronicIngot;
    }
	
	public int quantityDropped(Random random)
    {
        return random.nextInt(2) + 3;
    }
}