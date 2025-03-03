public class MUDPrototypeDemo {
    public static void main(String[] args){
        Room originalRoom = new Room("Original Room", "Description");
        Room clonedRoom = originalRoom.cloneEntity();
        NPC originalNPC = new NPC("Original NPC", "Description");
        NPC clonedNPC = originalNPC.cloneEntity();
    }
}
