package Lesson_8;

public class Pramogolnic {
    int dlina;
    int shirina;

    int plo() {
        int plo = dlina * shirina;
        return plo;
    }

    int per() {
        int per = (dlina + shirina) * 2;
        return per;
    }
    public String toString() {
        String result = dlina + ", " + shirina;
        return result;
    }


}

