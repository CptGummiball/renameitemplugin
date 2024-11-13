package org.cptgummiball.renameItems;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.meta.ItemMeta;

public class Main extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        // Registriert den Befehl beim Start des Plugins
        this.getCommand("renameitem").setExecutor(this);
        getLogger().info("Item Renamer ist gestartet");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Prüft, ob der Absender ein Spieler ist
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Dieser Befehl kann nur von Spielern verwendet werden.");
            return true;
        }

        Player player = (Player) sender;

        // Prüft, ob der Spieler die Berechtigung hat
        if (!player.hasPermission("renameitem.use")) {
            player.sendMessage(ChatColor.RED + "Du hast keine Berechtigung, um diesen Befehl zu verwenden.");
            return true;
        }

        // Prüft, ob das Item in der Hand vorhanden ist
        ItemStack item = player.getInventory().getItemInMainHand();
        if (item == null || !item.hasItemMeta()) {
            player.sendMessage(ChatColor.RED + "Du musst ein Item in der Hand halten, um es umzubenennen.");
            return true;
        }

        // Prüft, ob ein neuer Name angegeben wurde
        if (args.length == 0) {
            player.sendMessage(ChatColor.RED + "Bitte gib einen neuen Namen für das Item an.");
            return true;
        }

        // Setzt den neuen Namen des Items
        String newName = String.join(" ", args);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', newName));

        item.setItemMeta(meta);

        player.sendMessage(ChatColor.GREEN + "Das Item wurde erfolgreich umbenannt zu: " + ChatColor.RESET + meta.getDisplayName());
        return true;
    }

    @Override
    public void onDisable() {
        getLogger().info("Item Renamer wurde beendet");
    }
}
