package me.Rokaz.AutoPicker.core.config.unit;

import me.Rokaz.AutoPicker.core.AutoPicker;
import me.Rokaz.AutoPicker.lib.config.file.FileSection;
import me.Rokaz.AutoPicker.lib.config.unit.UnitConfig;
import me.Rokaz.AutoPicker.lib.datatypes.Message;
import org.bukkit.entity.Player;

public class MessageConfig extends UnitConfig<Message> {
    public static final String INVENTORY_FULL_MESSAGE_KEY = "inventoryFullMessage";
    public static final String NO_PERMISSION_MESSAGE_KEY = "noPermissionMessage";
    public MessageConfig() {
        super("messages",new FileSection(new FileSection(AutoPicker.PLUGIN_FOLDER), AutoPicker.UNIT_FOLDER));
    }
    public Message obtain(String name, Player p) {
        if (!getYaml().contains(name)) return null;
        return new Message(getYaml().getString(name));
    }
}
