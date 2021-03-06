package ninja5tyl3.NinjaOres;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import ninja5tyl3.steamtech.SteamTech;
import ninja5tyl3.steamtech.SteamTechBlock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockIridiumOre extends SteamTechBlock{
	
	public BlockIridiumOre(int id, Material par2Material) {
		
		super(id, par2Material);
		
	}
	
	@SideOnly(Side.CLIENT)
	private Icon[] icons;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		
		icons = new Icon[17];
		
		for(int i = 0; i < icons.length; i++) {
			
			icons[i] = par1IconRegister.registerIcon(SteamTech.modid + ":" + (this.getUnlocalizedName().substring(5)) + 1);
			
		}
		
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		
		switch(par2) {
		
		case 0:
			return icons[0];
		
		case 1: {
			
			switch(par1) {
			
			case 0:
				return icons[1];
				
			case 1:
				return icons[2];
				
			default:
				return icons[3];
				
			}
			
		}
		
		default: {
			
			System.out.println("Invalid metadata for " + this.getUnlocalizedName());
			return icons[0];
			
		}
		
		}
		
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		
		for(int i = 0; i < 2; i++) {
			
			par3List.add(new ItemStack(par1, 1, i));
			
		}
		
	}

}