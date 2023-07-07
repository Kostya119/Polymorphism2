public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicGroups = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyles musicGroup : musicGroups) {
            musicGroup.playMusic();
        }
    }
}