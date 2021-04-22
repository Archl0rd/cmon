package svex.tgy;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class daClass implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) return false;
       Player player = (Player) sender;

       if(!player.isOp()) return false;





        if(args.length > 2) return false;
      if(args[0].equals("diaset")) {
          for(Player p: Bukkit.getOnlinePlayers()){
              p.getInventory().addItem(new ItemStack(Material.DIAMOND_HELMET));
              p.getInventory().addItem(new ItemStack(Material.DIAMOND_CHESTPLATE));
              p.getInventory().addItem(new ItemStack(Material.DIAMOND_LEGGINGS));
              p.getInventory().addItem(new ItemStack(Material.DIAMOND_BOOTS));
              p.getInventory().addItem(new ItemStack(Material.DIAMOND_AXE));
              p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD));
              p.getInventory().addItem(new ItemStack(Material.STONE,512));
              p.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE,2));
              p.getInventory().addItem(new ItemStack(Material.SHIELD));
              p.getInventory().addItem(new ItemStack(Material.WATER_BUCKET));
          }
      }
      else if (args[0].equalsIgnoreCase("ntrset")) {
          for(Player p: Bukkit.getOnlinePlayers()){
              p.getInventory().addItem(new ItemStack(Material.NETHERITE_HELMET));
              p.getInventory().addItem(new ItemStack(Material.NETHERITE_CHESTPLATE));
              p.getInventory().addItem(new ItemStack(Material.NETHERITE_LEGGINGS));
              p.getInventory().addItem(new ItemStack(Material.NETHERITE_BOOTS));
              p.getInventory().addItem(new ItemStack(Material.NETHERITE_AXE));
              p.getInventory().addItem(new ItemStack(Material.NETHERITE_SWORD));
              p.getInventory().addItem(new ItemStack(Material.STONE,512));
              p.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE,2));
              p.getInventory().addItem(new ItemStack(Material.SHIELD));
              p.getInventory().addItem(new ItemStack(Material.WATER_BUCKET));
          }


      }
        if(args.length!= 2) return false;
          if(args[1].equalsIgnoreCase("ench")) {
              for(Player p: Bukkit.getOnlinePlayers()){
                  p.getInventory().addItem(new ItemStack(Material.ENCHANTING_TABLE));
                  p.getInventory().addItem(new ItemStack(Material.LAPIS_LAZULI,64));
                  p.setLevel(69420);
              }

      }

          else if(args[1].equalsIgnoreCase("fullench")) {
              for(Player p: Bukkit.getOnlinePlayers()){
                  p.getInventory().addItem(new ItemStack(Material.ENCHANTING_TABLE));
                  p.getInventory().addItem(new ItemStack(Material.LAPIS_LAZULI,64));
                  p.getInventory().addItem(new ItemStack(Material.BOOKSHELF,64));
                  p.setLevel(69420);
              }
          }
    return false;
    }

}
