package BeatBox;

import javax.sound.midi.*;

public class MiniMiniMusicApp {

    public static void main (String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    private void play() {
        try {
            //получить синтезатор и открыть его
            Sequencer player = MidiSystem.getSequencer(true);
            player.open();

            //создаем последовательность треков (как диск)
            Sequence seq = new Sequence(Sequence.PPQ,4);

            //запрашиваем трек у последовательности
            Track track = seq.createTrack();

            //помещаем в трек MIDI-события
            //что за нота
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            //когда запустить ноту: на 1 такте (1 бит)
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent noteOff = new MidiEvent(b, 3);
            track.add(noteOff);

            //передаем последовательность синтезатору как будто бы вставляем диск
            player.setSequence(seq);

            player.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
