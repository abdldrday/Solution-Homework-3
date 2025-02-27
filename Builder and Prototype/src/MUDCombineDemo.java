public class MUDCombineDemo {
    public static void main(String[] args){
        Room prototypeRoom = new Room("Prototype Room", "Here description of room");
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Name of Dungeon")
                .addRoom(prototypeRoom.cloneEntity())
                .addNPC(new NPC("NPC", "Some description"))
                .build();

        dungeon.describe();
    }
}
