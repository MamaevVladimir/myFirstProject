package lesson17;

import java.util.LinkedHashSet;

public class Harakteristika {
    private String key;
    private String value;
    private String podskazka;
    private LinkedHashSet <Harakteristika> harakteristiks = new LinkedHashSet<>();

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPodskazka() {
        return podskazka;
    }

    public void setPodskazka(String podskazka) {
        this.podskazka = podskazka;
    }

    public LinkedHashSet<Harakteristika> getHarakteristiks() {
        return harakteristiks;
    }

    public void setHarakteristiks(LinkedHashSet<Harakteristika> harakteristiks) {
        this.harakteristiks = harakteristiks;
    }
}
